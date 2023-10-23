package Presencial;

public class Vacunatorio implements VacunatorioInterface{

    @Override
    public String vacunar(Persona persona) {
        System.out.println("Verificando...");
        return "Se ha registrado satisfactoriamente la cedula: "+ persona.getCedula() + " con el nombre: " + persona.getNombre() + " " + persona.getApellido() +
                "\n" + "Vacuna colocada " + persona.getNombreVacuna();
    }
}
