package Clase02_sincronica;

public abstract class Empleado {
    private String nombre;
    private String apelido;
    private String cuentaBancaria;

    public Empleado(String nombre, String apelido, String cuentaBancaria) {
        this.nombre = nombre;
        this.apelido = apelido;
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }
}
