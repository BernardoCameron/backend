package Presencial;

public class CompruebaMail {
    private Manejador inicial;

    public CompruebaMail(){
        inicial = new ManejadorComercial();
        Manejador tecnico= new ManejadorTecnico();
        Manejador gerencial= new ManejadorGerencial();
        Manejador spam= new ManejadorSpam();
        inicial.setSiguienteManejador(tecnico);
        tecnico.setSiguienteManejador(gerencial);
        gerencial.setSiguienteManejador(spam);
    }

    public String disparador(Mail mail){
        return inicial.comprobar(mail);
    }
    public Manejador getInicial(){
        return inicial;
    }
    public void setInicial(Manejador inicial){
        this.inicial=inicial;
    }
}
