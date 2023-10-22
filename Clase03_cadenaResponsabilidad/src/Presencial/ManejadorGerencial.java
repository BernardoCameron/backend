package Presencial;

public class ManejadorGerencial extends Manejador{

    @Override
    public String comprobar(Mail mail) {
        if (mail.getDestino().equals("gerencial@lacolmena.com") || mail.getAsunto().equalsIgnoreCase("gerencial")){
            return "Usted esta siendo atentido por el depto gerencial";
        }
        else{
            System.out.println("No pudimos atender tu solicitud");
            return getSiguienteManejador().comprobar(mail);
        }
    }
}
