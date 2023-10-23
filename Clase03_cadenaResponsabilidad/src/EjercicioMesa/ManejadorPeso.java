package EjercicioMesa;

public class ManejadorPeso extends Manejador{
    @Override
    public void comprobar(Articulo articulo) {
        if (articulo.getPeso()>=1200&&articulo.getPeso()<=1300){
            if (getSiguienteManejador()!=null){
                getSiguienteManejador().comprobar(articulo);
            }
        }else{
            System.out.println("Fue rechazado por peso");
        }
    }
}
