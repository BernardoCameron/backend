package Presencial;

public class Cliente {
    public static void main(String[] args) {
        FacadeDescuento fachada = new FacadeDescuento();
        Tarjeta tarjeta1 = new Tarjeta(111111111, "star bank");
        Producto producto1 = new Producto("tomate", "caja");
        int cantidad = 5;
        System.out.println("El descuento acumulado es de: " + fachada.calcularDescuento(tarjeta1,producto1,cantidad));
    }
}
