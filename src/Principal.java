import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Departamento> departamentos = new ArrayList();

    public static void main(String[] args) {
        cargaAutomaticaConAgregacion();
        //cargaAutomaticaConComposicion();
        mostrarDepartamentos();
    }

    public static void cargaAutomaticaConAgregacion() {
        ArrayList<Empleado> empleados = new ArrayList();
        empleados.add(new Analista(11,"Pérez",400, LocalDate.of(1999,12,23),null));
        empleados.add(new Director(56,"García",3200,LocalDate.of(2000, 4,9),null,450));
        departamentos.add(new Departamento(90,"Ventas","Malpartida de Cáceres",empleados));
        ArrayList<Empleado> empleados1 = new ArrayList();
        empleados1.add(new Analista(11,"Pérez",400, LocalDate.of(1999,12,23),null));
        empleados1.add(new Director(56,"García",3200,LocalDate.of(2000, 4,9),null,450));
        departamentos.add(new Departamento(15,"Innovación","Madrid",empleados1));

        Iterator<Empleado> it = empleados.iterator();
        while (it.hasNext()){
            it.next().setDepartamentos(departamentos.get(0));
        }
        Iterator<Empleado> it1 = empleados1.iterator();
        while (it1.hasNext()){
          it1.next().setDepartamentos(departamentos.get(1));
        }
     }

     public static void cargaAutomaticaConComposicion(){
         departamentos.add(new Departamento(90,"Ventas","Malpartida de Cáceres"));
     }
      static void mostrarDepartamentos(){
          Iterator<Departamento> it = departamentos.iterator();
          while (it.hasNext()){
              Departamento dep = it.next();
              System.out.println(dep);
          }
      }












    }
