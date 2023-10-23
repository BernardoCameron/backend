package EjercicioMesa;

public class ManejadorLote extends Manejador{

    @Override
    public void comprobar(Articulo articulo) {
        if (articulo.getLote()>=1000&&articulo.getLote()<=2000){
            if (getSiguienteManejador()!=null){
                getSiguienteManejador().comprobar(articulo);
            }
        }
        else{
            System.out.println("Fue rechazado por Lote");
        }
    }
}
