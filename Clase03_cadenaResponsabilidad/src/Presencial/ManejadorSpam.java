package Presencial;

public class ManejadorSpam extends Manejador{
    @Override
    public String comprobar(Mail mail) {
        return "El mail se envio a Spam, no pudimos procesar tu solicitud";
    }
}
