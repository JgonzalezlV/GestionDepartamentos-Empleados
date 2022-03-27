import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Empleado {
    private Departamento departamentos;
    private int num_empleado;
    private String apellido;
    private double salario;
    private LocalDate fechaAlta;

    public Empleado(int num_empleado, String apellido, double salario, LocalDate fechaAlta, Departamento departamentos) {

        this.num_empleado = num_empleado;
        this.apellido = apellido;
        this.salario = salario;
        this.fechaAlta = fechaAlta;
        departamentos = departamentos;
    }

    public Empleado() {
    }

    public Departamento getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento departamentos) {
        this.departamentos = departamentos;
    }

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

}
