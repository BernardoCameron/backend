package Presencial;

import java.util.Date;

public class VacunatorioProxy implements VacunatorioInterface{

    private Vacunatorio centroVacunatorio;

    public VacunatorioProxy() {
        centroVacunatorio = new Vacunatorio();
    }

    @Override
    public String vacunar(Persona persona) {
        Date fechaActual = new Date();

        //Para poder vacunarse, la fecha de vacunacion DEBE SER POSTERIOR A LA FECHA ACTUAL
        if (persona.getFechaVacuna().before(fechaActual)){
        //if (fechaActual.before(persona.getFechaVacuna())){
            //No se puede vacunar
            return "Vuelva en la fecha indicada";
        }else {
            return centroVacunatorio.vacunar(persona);
        }
    }
}
