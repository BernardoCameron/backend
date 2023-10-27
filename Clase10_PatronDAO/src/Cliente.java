import Dao.BD;
import Dao.MedicamentoDAOH2;
import Model.Medicamento;
import Service.MedicamentoService;

public class Cliente {
    public static void main(String[] args) {
        //Primero crear la tabla
        BD.crearTabla();
        //Que voy a guardar?
        Medicamento medicamento = new Medicamento(1, 11111, "Paracetamol", "Bayer", 1000.0, 300);
        //Quien se encarga de guardar el medicamento?
        MedicamentoService servicio = new MedicamentoService(new MedicamentoDAOH2());
        //Quien guarda el medicamento
        servicio.guardarMedicamento(medicamento);

    }
}
