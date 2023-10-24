package Presencial;

public class ApiProducto {
    public static int descuentoPorProducto(Producto producto){
        if (producto.getTipo().equalsIgnoreCase("latas")){
            return 10;
        }else{
            return 0;
        }
    }
}
