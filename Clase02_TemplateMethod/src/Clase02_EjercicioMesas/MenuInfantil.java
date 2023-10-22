package Clase02_EjercicioMesas;

public class MenuInfantil extends Menu{

    private int cantidadJuguetes;

    public MenuInfantil(String tipo, Double precioBase, int cantidadJuguetes) {
        super(tipo, precioBase);
        this.cantidadJuguetes = cantidadJuguetes;
    }

    @Override
    public void armarMenu() {

    }
}
