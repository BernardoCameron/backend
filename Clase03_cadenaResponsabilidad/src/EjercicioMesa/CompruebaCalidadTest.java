package EjercicioMesa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompruebaCalidadTest {

    @Test
    public void productoAceptado(){
        CompruebaCalidad proceso = new CompruebaCalidad();
        Articulo carne = new Articulo("Carne", 1000,1250, "sano");
        String respEsp = "Producto aceptado";
    }

}
