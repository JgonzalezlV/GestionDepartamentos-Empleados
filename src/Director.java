import java.time.LocalDate;
import java.util.ArrayList;

public class Director extends Empleado{
    private double comision;

    public Director(int num_empleado, String apellido, double salario, LocalDate fechaAlta, ArrayList<Departamento> departamentos, double comision) {
        super(num_empleado, apellido, salario, fechaAlta, departamentos);
        this.comision = comision;
    }

    public Director() {
    }


    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "\n Director: " +
                "Num_empleado:  " + getNum_empleado() +
                ", Apellido: '" + getApellido() + '\'' +
                ", Salario: " + getSalario() +
                ", FechaAlta: " + getFechaAlta() +
                ", Comisión: " + comision;
    }
}
