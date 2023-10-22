package Clase02_sincronica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContadorTest {
    @Test
    public void liquidarSueldoEmpleadoContratado(){
        //Dado
        Empleado juan = new EmpleadoContratado("Juan", "Velasquez", "1234123512",20, 7.0);
        Contador pedro= new ContadorEmpleadoContratado();
        String respEsp = "La liquidacion generada es un documento digital. Saldo a liquidar: 140.0" ;
        //Cuando
        String liquidacion = pedro.liquidarSueldo(juan);
        //Entonces
        Assertions.assertEquals(respEsp, liquidacion);
    }

    @Test
    public void liquidarSueldoEmpleadoEfectivo(){
        Empleado pablo = new EmpleadoEfectivo("Martin", "Martini", "123145", 400.0, 60.0, 40.0);
        Contador cEfectivo = new ContadorEmpleadoEfectivo();
        String respEsp = "La liquidacion generada es un documento digital. Saldo a liquidar: 420.0";
        String liquidacion = cEfectivo.liquidarSueldo(pablo);
        Assertions.assertEquals(respEsp, liquidacion);
    }

    @Test
    public void errorLiquidarSueldo(){
        Empleado eContratado= new EmpleadoContratado("Juan", "Perez","1231441",40,20.0);
        Contador cEfectivo = new ContadorEmpleadoEfectivo();
        String respEsp = "La liquidacion no pudo ser calculada";
        String liquidacion = cEfectivo.liquidarSueldo(eContratado);
        Assertions.assertEquals(respEsp, liquidacion);
    }
}
