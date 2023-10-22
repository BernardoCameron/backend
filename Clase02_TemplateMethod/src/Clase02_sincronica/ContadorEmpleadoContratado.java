package Clase02_sincronica;

public class ContadorEmpleadoContratado extends Contador{
    private String liquidarSueldo;

    @Override
    protected Double calcularSueldo(Empleado empleado) {
        Double resp = 0.0;
        if(empleado instanceof EmpleadoContratado){
            EmpleadoContratado ec = (EmpleadoContratado) empleado;
            resp= ec.getPrecioPorHora()*ec.getCantHoras();
        }
        return resp;
    }

    @Override
    protected String emitirRecibo(Empleado empleado) {
        return "La liquidacion generada es un documento digital. Saldo a liquidar: " ;
    }
}
