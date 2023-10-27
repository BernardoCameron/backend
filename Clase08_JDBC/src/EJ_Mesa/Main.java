package EJ_Mesa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection connection= null;


        try {
            connection= getConnection();

            Statement stmt = connection.createStatement();
            // Primero, eliminamos la tabla si existe
            stmt.execute("DROP TABLE IF EXISTS FIGURAS");

            stmt.execute("CREATE TABLE FIGURAS (ID INT PRIMARY KEY, " +
                    "FIGURA VARCHAR(20) NOT NULL, COLOR VARCHAR(20) NOT NULL)");


            //INSERTAMOS 5 FIGURAS ||| 2 CIRCULOS ||| 3 CUADRADOS, DISTINTO COLOR

            stmt.execute("INSERT INTO FIGURAS (ID, FIGURA, COLOR) VALUES (1, 'Circulo', 'Verde')");
            stmt.execute("INSERT INTO FIGURAS (ID, FIGURA, COLOR) VALUES (2, 'Circulo', 'Rojo')");
            stmt.execute("INSERT INTO FIGURAS (ID, FIGURA, COLOR) VALUES (3, 'Cuadrado', 'Azul')");
            stmt.execute("INSERT INTO FIGURAS (ID, FIGURA, COLOR) VALUES (4, 'Cuadrado', 'Amarillo')");
            stmt.execute("INSERT INTO FIGURAS (ID, FIGURA, COLOR) VALUES (5, 'Cuadrado', 'Rojo')");

            //Creamos una queary para mostrar las tablas con ResultSet

            ResultSet rs = stmt.executeQuery("SELECT * FROM FIGURAS WHERE FIGURA = 'Circulo' AND COLOR = 'Rojo'");

            while (rs.next()){
                System.out.println("ID: " + rs.getInt(1) + " Figura: " + rs.getString(2) + " Color: " + rs.getString(3));

            }

            System.out.println("*****************************************************************");

            rs = stmt.executeQuery("SELECT * FROM FIGURAS");

            while (rs.next()){
                System.out.println("ID: " + rs.getInt(1) + " Figura: " + rs.getString(2) + " Color: " + rs.getString(3));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws Exception{
        //Necesita cargar el driver
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:mem:~/mesa_circulos","admin", "admin");
    }
}
