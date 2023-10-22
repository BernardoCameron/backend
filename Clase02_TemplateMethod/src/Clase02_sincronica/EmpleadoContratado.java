package Clase02_sincronica;

public class EmpleadoContratado extends Empleado{
    private Integer cantHoras;
    private Double precioPorHora;

    public EmpleadoContratado(String nombre, String apelido, String cuentaBancaria, Integer cantHoras, Double precioPorHora) {
        super(nombre, apelido, cuentaBancaria);
        this.cantHoras = cantHoras;
        this.precioPorHora = precioPorHora;
    }

    public Integer getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(Integer cantHoras) {
        this.cantHoras = cantHoras;
    }

    public Double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(Double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }
}
