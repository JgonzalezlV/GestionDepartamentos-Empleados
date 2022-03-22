import java.util.ArrayList;

public class Departamento {
    private int dept_no;
    private String dNombre;
    private String localizacion;
    private ArrayList<Empleado> empleados;

    public Departamento(int dept_no, String dNombre, String localizacion) {
        this.dept_no = dept_no;
        this.dNombre = dNombre;
        this.localizacion = localizacion;
    }

    public Departamento(int dept_no, String dNombre, String localizacion, ArrayList<Empleado> empleados) {
        this.dept_no = dept_no;
        this.dNombre = dNombre;
        this.localizacion = localizacion;
        this.empleados = empleados;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    public String getdNombre() {
        return dNombre;
    }

    public void setdNombre(String dNombre) {
        this.dNombre = dNombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Departamento: " +
                "Número de departamento: " + dept_no +
                ", Nombre del departamento: '" + dNombre + '\'' +
                ", Localización: '" + localizacion + '\'' +
                ", Empleados: " + empleados;
    }
}
