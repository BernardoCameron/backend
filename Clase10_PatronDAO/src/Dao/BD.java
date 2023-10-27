package Dao;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BD {
    public static final Logger logger = Logger.getLogger(BD.class);
    public static final String SQL_DROP_CREATE = "DROP TABLE IF EXISTS MEDICAMENTOS; " +
            "CREATE TABLE MEDICAMENTOS (ID INT PRIMARY KEY, CODIGO INT NOT NULL, " +
            "NOMBRE VARCHAR(100) NOT NULL, LABORATORIO VARCHAR (100) NOT NULL, PRECIO NUMERIC(10,2) NOT NULL, " +
            "CANTIDAD INT NOT NULL)" ;


    public static void crearTabla(){
        Connection connection= null;
        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_DROP_CREATE);

        }catch (Exception e){
            logger.error(e.getMessage());
        }finally {
            try {
                connection.close();
            }catch (SQLException ex){
                logger.error(ex.getMessage());
            }
        }
    }
    public static Connection getConnection() throws Exception{
        //Necesita cargar el driver
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/testMedicamentos1","sa", "sa");
    }
}
