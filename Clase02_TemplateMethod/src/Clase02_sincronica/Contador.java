package Clase02_sincronica;

public abstract class Contador {
    public String liquidarSueldo(Empleado empleado){
        String resp = "La liquidacion no pudo ser calculada";
        Double sueldo = calcularSueldo(empleado);
        if (sueldo > 0){
            String recibo = emitirRecibo(empleado);
            resp = recibo + sueldo;
        }
        return resp;
    }
    private String depositarSueldo(Empleado empleado){
        return "Orden de pago en la cuenta de : " +empleado.getNombre();
    }
    protected abstract Double calcularSueldo(Empleado empleado);
    protected abstract String emitirRecibo(Empleado empleado);
}
