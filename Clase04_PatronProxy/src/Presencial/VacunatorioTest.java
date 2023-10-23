package Presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class VacunatorioTest {
    @Test

    public void casoIncorrecto(){
        //DADO
        Persona persona = new Persona("Juan", "Perez", "15.963.139-6", new Date(2023-1900,8, 16 ),"Cansino");
        VacunatorioProxy vacuna = new VacunatorioProxy();
        String respEsp = "Vuelva en la fecha indicada";
        //Cuando
        String respActual = vacuna.vacunar(persona);
        //Entonces
        Assertions.assertEquals(respEsp, respActual);
    }

    @Test
    public void casoCorrecto(){
        Persona persona = new Persona("Juan", "Perez", "15.963.139-6", new Date(2023-1900,9, 24 ),"Cansino");
        System.out.println(persona.getFechaVacuna());
        VacunatorioProxy vacuna1 = new VacunatorioProxy();
        String respEsp = "Se ha registrado satisfactoriamente la cedula: 15.963.139-6 con el nombre: Juan Perez\n" +
                "Vacuna colocada Cansino";
        String respActual = vacuna1.vacunar(persona);

        Assertions.assertEquals(respEsp, respActual);
    }
}
