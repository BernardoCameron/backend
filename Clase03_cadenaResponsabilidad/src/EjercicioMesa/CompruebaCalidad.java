package EjercicioMesa;

public class CompruebaCalidad {
    Manejador inicial = new ManejadorLote();
    public CompruebaCalidad(){
        Manejador peso = new ManejadorPeso();
        Manejador envase = new ManejadorEnvase();
        Manejador aceptado = new ManejadorAceptar();
        inicial.setSiguienteManejador(peso);
        peso.setSiguienteManejador(envase);
        envase.setSiguienteManejador(aceptado);
    }

    public void disparador(Articulo articulo){
        inicial.comprobar(articulo);
    }
}
