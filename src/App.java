import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado, documentoEmpleado, diaDescanso = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double deduccionPension = 0;
        double deduccionSalud = 0;
        double horasTrabajadas =0;
        double valorHora = 0;
        double bonificacionEmpleado =0;
        double valorSalarioMinimo = 1423500;
        double auxilioTransporte = 200000;
        double cantidadHorasExtras = 0;
        double valorHoraExtra = 0;
        double totalHorasExtras = 0;
        
        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado = sc.nextLine();
        System.out.println("Ingrese el documento del empleado: ");
        documentoEmpleado = sc.nextLine();
        System.out.println("Ingrese el dia de descanso del empleado: ");
        diaDescanso = sc.nextline();
        System.out.println("Ingrese el salario bruto del empleado: ");
        salarioBruto = sc.nextDouble();
        System.out.println("Ingrese el salario neto del empleado: ");
        salarioNeto = sc.nextDouble();
        System.out.println("Ingrese la deduccion de pension del empleado: ");
        deduccionPension = sc.nextDouble();
        System.out.println("Ingrese la deduccion de salud del empleado: ");
        deduccionSalud = sc.nextDouble();
        System.out.println("Ingrese las horas trabajadas del empleado: ");
        horasTrabajadas = sc.nextDouble();
        System.out.println("Ingrese el valor de la hora del empleado: ");
        valorHora = sc.nextDouble();
        System.out.println("Ingrese la bonificacion del empleado: ");
        bonificacionEmpleado = sc.nextDouble();
        System.out.println(Ingrese el valor del salario minimo);


    }
}
