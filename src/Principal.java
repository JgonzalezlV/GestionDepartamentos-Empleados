import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Departamento> departamentos = new ArrayList();

    public static void main(String[] args) throws IOException{
        //cargaAutomaticaConAgregacion();
        cargaAutomaticaConComposicion();
        mostrarDepartamentos();
        insertarEmpleado();
        mostrarDepartamentos();
       // System.out.println(existeDepartamento(90));
        //System.out.println(existeEmpleado(6,departamentos.get(1)));
    }

    public static void cargaAutomaticaConAgregacion() {
        ArrayList<Empleado> empleados = new ArrayList();
        empleados.add(new Analista(11,"Pérez",400, LocalDate.of(1999,12,23),null));
        empleados.add(new Director(56,"García",3200,LocalDate.of(2000, 4,9),null,450));
        departamentos.add(new Departamento(90,"Ventas","Malpartida de Cáceres",empleados));
        ArrayList<Empleado> empleados1 = new ArrayList();
        empleados1.add(new Analista(1,"Pérez",400, LocalDate.of(1999,12,23),null));
        empleados1.add(new Director(6,"García",3200,LocalDate.of(2000, 4,9),null,450));
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
    public static int existeEmpleado(int num_empleado, Departamento d) {

        boolean encontrado = false;
        int contador = 0;

        do{
            do {
                if (d.getEmpleados().get(contador).getNum_empleado() == num_empleado){
                    encontrado = true;
                }else contador++;
            }while (!encontrado);
        }while (!encontrado);

        if (encontrado) return contador;
        else return -1;
    }
    public static int existeDepartamento(int dept_no){

        boolean encontrado = false;
        int contador = 0;

        do{
            if (departamentos.get(contador).getDept_no() == dept_no){
                encontrado = true;
            }
            else contador++;
        }while (!encontrado);

        if (encontrado) return contador;
        else return -1;
    }

    static void insertarEmpleado(Empleado e,Departamento d){
        d.getEmpleados().add(e);
    }
    static void insertarEmpleado() throws IOException {
        System.out.println("Introduce el número del empleado. ");
        int num_empleado = 0;
        try {
            num_empleado = Integer.parseInt(br.readLine());
        }catch (NumberFormatException nfew ){
            System.out.println("Sólo se admiten números. ");
        }
        System.out.println("Introduce número de departamento al que quieras insertar un nuevo empleado. ");
        int dept_no = 0;
        try {
           dept_no = Integer.parseInt(br.readLine());
        }catch (NumberFormatException nfew ){
            System.out.println("Sólo se admiten números. ");
        }
        if (existeDepartamento(dept_no) == -1){
            System.out.println("Ese departamento no existe. ");
        }
        if (existeEmpleado(num_empleado,departamentos.get(existeDepartamento(dept_no))) >= 0){
            System.out.println("Ese número de empleado ya está en uso. ");
        }else {
            System.out.println("Introduce el apellido del empleado. ");
            String apellido = br.readLine();
            System.out.println("Introduce el salario del empleado. ");
            double salario = Integer.parseInt(br.readLine());
            System.out.println("Introduce el día en el que se dio de baja al empleado. ");
            int dia = Integer.parseInt(br.readLine());
            System.out.println("Introduce el mes en el que se dio de baja al empleado. ");
            int mes = Integer.parseInt(br.readLine());
            System.out.println("Introduce el anio en el que se dio de baja al empleado. ");
            int anio = Integer.parseInt(br.readLine());
            LocalDate fechaAlta = LocalDate.of(anio,mes,dia);
            Empleado e = new Analista(num_empleado,apellido,salario,fechaAlta,departamentos.get(existeDepartamento(dept_no)));
            insertarEmpleado(e,departamentos.get(existeDepartamento(dept_no)));
        }
    }









    }
