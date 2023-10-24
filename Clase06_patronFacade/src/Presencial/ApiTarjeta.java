package Presencial;

public class ApiTarjeta {
    public static int calcularDescuento(Tarjeta tarjeta){
        if (tarjeta.getBanco().equalsIgnoreCase("star bank")){
            return 20;
        }else{
            return 0;
        }
    }
}
