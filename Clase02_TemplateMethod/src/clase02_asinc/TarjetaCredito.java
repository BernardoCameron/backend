package clase02_asinc;

import java.util.Date;

public class TarjetaCredito extends Tarjeta{
    private Double LimiteSaldo;
    private Double SaldoUtilizado;

    public TarjetaCredito(int nroTarjeta, int CCV, Date expiracion, Double limiteSaldo, Double saldoUtilizado) {
        super(nroTarjeta, CCV, expiracion);
        LimiteSaldo = limiteSaldo;
        SaldoUtilizado = saldoUtilizado;
    }

    @Override
    public void validarAutorizacion(double monto) {
        if(validarFecha()){
            System.out.println("(LimiteSaldo - SaldoUtilizado) >= monto");
        }
        System.out.println("false;");
    }
}
