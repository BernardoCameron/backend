package Presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompruebaMailTest {
    @Test
    public void mailASpam(){
        //DADO
        CompruebaMail colmena = new CompruebaMail();
        Mail mail = new Mail("bernardo@gmail.com", "colmena@pruebas.com","holas");
        String respEsp= "El mail se envio a Spam, no pudimos procesar tu solicitud";
        //CUANDO
        String respActual = colmena.disparador(mail);
        //Entonces
        Assertions.assertEquals(respActual, respEsp);
    }

    @Test
    public void mailAGerencial(){
        //DADO
        CompruebaMail colmena = new CompruebaMail();
        Mail mail = new Mail("bernardo@gmail.com", "colmena@pruebas.com","gerencial");
        String respEsp= "Usted esta siendo atentido por el depto gerencial";
        //CUANDO
        String respActual = colmena.disparador(mail);
        //Entonces
        Assertions.assertEquals(respActual, respEsp);
    }
}
