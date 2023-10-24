package Presencial;

public class Tarjeta {
    private int numeroTarjeta;
    private String banco;

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Tarjeta(int numeroTarjeta, String banco) {
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
    }
}
