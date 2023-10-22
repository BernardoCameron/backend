package Presencial;

public class ManejadorComercial extends Manejador{
    @Override
    public String comprobar(Mail mail) {
        if (mail.getDestino().equals("comercial@lacolmena.com") || mail.getAsunto().equalsIgnoreCase("comercial")){
            return "Usted esta siendo atentido por el depto comercial";
        }
        else{
            System.out.println("No pudimos atender tu solicitud");
            return getSiguienteManejador().comprobar(mail);
        }
    }
}
