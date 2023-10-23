package EjercicioMesa;

public class ManejadorEnvase extends Manejador{
    @Override
    public void comprobar(Articulo articulo) {
        if (articulo.getEnvase().equalsIgnoreCase("sano") || articulo.getEnvase().equalsIgnoreCase("casi sano")){
            if (getSiguienteManejador()!=null){
                getSiguienteManejador().comprobar(articulo);
            }
        }else{
            System.out.println("Fue rechazado por envase");
        }
    }
}
