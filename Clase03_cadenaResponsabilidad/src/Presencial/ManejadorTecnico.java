package Presencial;

public class ManejadorTecnico extends Manejador{
    @Override
    public String comprobar(Mail mail) {
        if (mail.getDestino().equals("tecnico@lacolmena.com") || mail.getAsunto().equalsIgnoreCase("tecnico")){
            return "Usted esta siendo atentido por el depto tecnico";
        }
        else{
            System.out.println("No pudimos atender tu solicitud");
            return getSiguienteManejador().comprobar(mail);
        }
    }
}
