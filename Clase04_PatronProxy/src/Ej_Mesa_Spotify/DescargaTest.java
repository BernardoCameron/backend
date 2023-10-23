package Ej_Mesa_Spotify;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DescargaTest {
    @Test
    public void casoCorrecto(){
        //DADO
        Usuario usuario = new Usuario(10,"Premium");
        DescargaProxy solicitud = new DescargaProxy();
        String resEsp = "Se ha iniciado la descarga.";
        //Cuando
        String respActual = solicitud.descargar(usuario);
        //Entonces
        Assertions.assertEquals(resEsp, respActual);
    }

    @Test
    public void casoIncorrecto(){
        Usuario usuario = new Usuario(11,"Normal");
        DescargaProxy solicitud = new DescargaProxy();
        String resEsp = "Solo usuarios premium pueden realizar descargas";
        //Cuando
        String respActual = solicitud.descargar(usuario);
        //Entonces
        Assertions.assertEquals(resEsp, respActual);
    }
}
