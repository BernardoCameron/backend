package Clase02_EjercicioMesas;

public abstract class Menu {
    protected String tipo;
    protected Double precioBase;

    public Menu(String tipo, Double precioBase) {
        this.tipo = tipo;
        this.precioBase = precioBase;
    }
    public abstract void armarMenu();
    public Double calcularPrecio(){
        return precioBase;
    }
}
