import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Departamento {
    private int dept_no;
    private String dNombre;
    private String localizacion;
    private ArrayList<Empleado> empleados;

    //Constructor parametrizado para composición.
    public Departamento(int dept_no, String dNombre, String localizacion) {
        this.dept_no = dept_no;
        this.dNombre = dNombre;
        this.localizacion = localizacion;
        empleados = new ArrayList<Empleado>();
        empleados.add(new Analista(115,"Pérez",400, LocalDate.of(1999,12,23),null));
        empleados.add(new Director(562,"López",235,LocalDate.of(1999,5,4),null,340));
    }
    //Constructor parametrizado para agregación.
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
                ", \nEmpleados: " + empleados + "\n";
    }

}
