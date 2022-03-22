import java.time.LocalDate;
import java.util.ArrayList;

public class Analista extends Empleado{
    public Analista(int num_empleado, String apellido, double salario, LocalDate fechaAlta, ArrayList<Departamento> departamentos) {
        super(num_empleado, apellido, salario, fechaAlta, departamentos);
    }

    @Override
    public String toString() {
        return "\n Analista: " +
                "Num_empleado:  " + getNum_empleado() +
                ", Apellido: '" + getApellido() + '\'' +
                ", Salario: " + getSalario() +
                ", FechaAlta: " + getFechaAlta();
    }
}
