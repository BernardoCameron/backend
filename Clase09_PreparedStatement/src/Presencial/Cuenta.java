package Presencial;

import org.apache.log4j.Logger;
import org.h2.Driver;

import java.sql.*;

public class Cuenta {
    public static final Logger logger = Logger.getLogger(Cuenta.class);

    //Vamos a generar la atomocidad en las SQL

    private static final String SQL_DROP_CREATE = "DROP TABLE IF EXISTS CUENTAS;" +
            "CREATE TABLE CUENTAS (ID INT PRIMARY KEY, NOMBRE VARCHAR(100) NOT NULL, NUMEROCUENTA INT NOT NULL, " +
            "SALDO NUMERIC(10,2) NOT NULL)";

    public static final String SQL_INSERT= "INSERT INTO CUENTAS  VALUES (?,?,?,?)";

    public static final String SQL_UPDATE= "UPDATE CUENTAS SET SALDO=? WHERE ID=?";

    public static final String SQL_SELECT= "SELECT * FROM CUENTAS";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            //Traemos la conexion
            connection= getConnection();
            logger.info("Conexion establecida");

            //Creamos la tabla

            Statement statement = connection.createStatement();
            statement.execute(SQL_DROP_CREATE);

            //Insertamos datos en la tabla
            PreparedStatement psInsert= connection.prepareStatement(SQL_INSERT);
            //Ahora pasamos los parametros
            psInsert.setInt(1, 1);
            psInsert.setString(2, "Jorgito");
            psInsert.setInt(3,12345678);
            psInsert.setDouble(4, 250);
            psInsert.execute();

            //UPDATE



            ResultSet rs =statement.executeQuery("SELECT * FROM CUENTAS");

            while (rs.next()){
                System.out.println("ID: "+ rs.getInt(1) + " Nombre: " + rs.getString(2) + " NroCuenta: "+ rs.getInt(3)+ " Saldo: " + rs.getDouble(4));
            }


            System.out.println("*****************************************");

            PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
            psUpdate.setDouble(1, 250+10);
            psUpdate.setInt(2, 1);
            psUpdate.execute();

            rs = statement.executeQuery("SELECT * FROM CUENTAS");
            while (rs.next()){
                System.out.println("ID: "+ rs.getInt(1) + " Nombre: " + rs.getString(2) + " NroCuenta: "+ rs.getInt(3)+ " Saldo: " + rs.getDouble(4));
            }


            connection.setAutoCommit(false);

            PreparedStatement psUpdateTx= connection.prepareStatement(SQL_UPDATE);
            psUpdateTx.setDouble(1, 250+10+15);
            psUpdateTx.setInt(2, 1);
            psUpdateTx.execute();
            rs = statement.executeQuery("SELECT * FROM CUENTAS");
            System.out.println("***************SIN CONFIRMACION****************************");
            while (rs.next()){
                System.out.println("ID: "+ rs.getInt(1) + " Nombre: " + rs.getString(2) + " NroCuenta: "+ rs.getInt(3)+ " Saldo: " + rs.getDouble(4));
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:E:/DevWorkspace/backend/db/cuentas1","admin1", "admin1");
    }
}
