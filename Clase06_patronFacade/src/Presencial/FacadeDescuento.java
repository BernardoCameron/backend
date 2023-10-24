package Presencial;

public class FacadeDescuento implements Descuento{
    @Override
    public int calcularDescuento(Tarjeta tarjeta, Producto producto, int cantidad) {
        int descuento = 0;
        descuento = descuento+ApiTarjeta.calcularDescuento(tarjeta)+ApiProducto.descuentoPorProducto(producto)+ApiCantidad.descuentoPorCantidad(cantidad);
        return descuento;
    }
}
