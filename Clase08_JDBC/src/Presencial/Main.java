package Presencial;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {


        Connection connection= null;
        try {
            connection= getConnection();
            logger.info("Conexion establecida");

            //objetos a tablas ---> Statement

            Statement statement = connection.createStatement();
            // Primero, eliminamos la tabla si existe
            statement.execute("DROP TABLE IF EXISTS ANIMALES");

            // Luego, creamos la nueva tabla "ANIMALES"
            statement.execute("CREATE TABLE ANIMALES (ID INT PRIMARY KEY, " +
                    "NOMBRE VARCHAR(10) NOT NULL, TIPO VARCHAR(20) NOT NULL)");

            //INSERTAR 5 ANIMALES
            statement.execute("INSERT INTO ANIMALES VALUES (1, 'Manchitas', 'Perro'), (2, 'Loki', 'Gato'), (3, 'Michi', 'Perro'), (4, 'Poli', 'Loro'), (5, 'Manuelita', 'Tortuga') ;");

            //OTRA FORMA
//            statement.execute("INSERT INTO ANIMALES (ID, NOMBRE, TIPO) VALUES (1, 'Manchitas', 'Perro')");
//            statement.execute("INSERT INTO ANIMALES (ID, NOMBRE, TIPO) VALUES (2, 'Loki', 'Gato')");
//            statement.execute("INSERT INTO ANIMALES (ID, NOMBRE, TIPO) VALUES (3, 'Michi', 'Perro')");
//            statement.execute("INSERT INTO ANIMALES (ID, NOMBRE, TIPO) VALUES (4, 'Poli', 'Loro')");
//            statement.execute("INSERT INTO ANIMALES (ID, NOMBRE, TIPO) VALUES (5, 'Manuelita', 'Tortuga')");

            //Tablas a objetos -----> ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM ANIMALES");

            //ALGO QUE ME PERMITA RECORRER LOS OBJETOS EN LOS REGISTROS DE LA BDD
            while (rs.next()){
                //Mover el puntero al siguiente objeto
                System.out.println("ID: " + rs.getInt(1) + " Nombre: " + rs.getString(2) + " Tipo: " + rs.getString(3));

            }
            System.out.println("--------------------------------------------------------------------------------------------------------------");

            statement.execute("DELETE FROM ANIMALES WHERE ID = 3");
            rs = statement.executeQuery("SELECT * FROM ANIMALES");


            while (rs.next()){
                //Mover el puntero al siguiente objeto
                System.out.println("ID: " + rs.getInt(1) + " Nombre: " + rs.getString(2) + " Tipo: " + rs.getString(3));
            }



        }catch (Exception e){
            e.printStackTrace();
        }

    }
    // conectarse al driver
    public static Connection getConnection() throws Exception{
        //Necesita cargar el driver
        logger.info("creando la conexion");
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:mem:~/alimanitos","admin", "admin");
    }
}
