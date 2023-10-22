package clase02_asinc;

import java.util.Date;

public class TarjetaDebito extends Tarjeta{

    public Double SaldoDisponible;

    public TarjetaDebito(int nroTarjeta, int CCV, Date expiracion, Double saldoDisponible) {
        super(nroTarjeta, CCV, expiracion);
        SaldoDisponible = saldoDisponible;
    }

    @Override
    public void validarAutorizacion(double monto) {
        if(validarFecha()){
            System.out.println("Autorizado");

        }else{
            System.out.println("Rechazado");
        }


    }
}
