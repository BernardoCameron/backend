package Dao;

import Model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class MedicamentoDAOH2 implements iDao<Medicamento>{
    public static final Logger logger = Logger.getLogger(MedicamentoDAOH2.class);

    public static final String SQL_INSERT = "INSERT INTO MEDICAMENTOS VALUES (?,?,?,?,?,?)";
    @Override
    public Medicamento guardar(Medicamento medicamento) {
        logger.info("Iniciando las operaciones de guardado");
        Connection connection= null;

        try {
            //Conectar a la BD
            connection = BD.getConnection();

            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);
//            ID
//            CODIGO
//            NOMBRE
//            LABORATORIO
//            PRECIO
//            CANTIDAD
            psInsert.setInt(1,medicamento.getId());
            psInsert.setInt(2, medicamento.getCodigo());
            psInsert.setString(3,medicamento.getNombre());
            psInsert.setString(4,medicamento.getLaboratorio());
            psInsert.setDouble(5,medicamento.getPrecio());
            psInsert.setInt(6,medicamento.getCantidad());
            psInsert.execute();


        }catch (Exception e){
            logger.error(e.getMessage());
        }

        return medicamento;
    }
}
