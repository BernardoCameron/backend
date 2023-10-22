package clase02_asinc;

import java.util.Date;

public abstract class Tarjeta {
    private int NroTarjeta;
    private int CCV;
    private Date Expiracion;

    public Tarjeta(int nroTarjeta, int CCV, Date expiracion) {
        NroTarjeta = nroTarjeta;
        this.CCV = CCV;
        Expiracion = expiracion;
    }
    public boolean validarFecha(){
        Date fechaActual = new Date();
        return Expiracion.after(fechaActual);
    }

    public abstract void validarAutorizacion(double monto);

    public int getNroTarjeta() {
        return NroTarjeta;
    }

    public void setNroTarjeta(int nroTarjeta) {
        NroTarjeta = nroTarjeta;
    }

    public int getCCV() {
        return CCV;
    }

    public void setCCV(int CCV) {
        this.CCV = CCV;
    }

    public Date getExpiracion() {
        return Expiracion;
    }

    public void setExpiracion(Date expiracion) {
        Expiracion = expiracion;
    }
}
