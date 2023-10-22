package Clase02_sincronica;

public class ContadorEmpleadoEfectivo extends Contador{
    @Override
    protected Double calcularSueldo(Empleado empleado) {
        Double resp = 0.0;
        if (empleado instanceof EmpleadoEfectivo){
            EmpleadoEfectivo ef = (EmpleadoEfectivo) empleado;
            resp= ef.getSueldoBasico() + ef.getPremios()-ef.getDescuentos();
        }
        return resp;
    }

    @Override
    protected String emitirRecibo(Empleado empleado) {
        return "La liquidacion generada es un documento digital. Saldo a liquidar: " ;
    }
}
