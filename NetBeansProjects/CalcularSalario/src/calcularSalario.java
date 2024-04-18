import javax.swing.JOptionPane; 
 
public class calcularSalario {
    
    public static void main(String[] args) {
       double cedulaEmpleado, salarioBasico, comisionVentas, auxilioTransporte = 0, totalDevengado, totalDeducciones, salarioNeto;
        int diasLaborados, prestamos;
        String  nombreEmpleado;
        
       nombreEmpleado= JOptionPane.showInputDialog("Ingrese el nombre del empleado: ");
       cedulaEmpleado= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero de cedula del empleado: "));
       salarioBasico=  Double.parseDouble(JOptionPane.showInputDialog("Ingrese salario basico del empleado: "));
       diasLaborados= Integer.parseInt(JOptionPane.showInputDialog("Ingrese dias laborados (1 a 30): "));
       prestamos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor de los prestamos: "));
       comisionVentas= Double.parseDouble(JOptionPane.showInputDialog("Ingrese las ventas del mes: "));
       
       double sueldoDevengado = salarioBasico * diasLaborados / 30;
       if (salarioBasico <= 2 * 1300000) { 
            auxilioTransporte = 83140 * diasLaborados / 30;
        }
       
       totalDevengado = salarioBasico * diasLaborados / 30 + comisionVentas;
       
       totalDeducciones = prestamos;
       
       salarioNeto = totalDevengado - totalDeducciones;
       
       JOptionPane.showMessageDialog(null, "Nombre Empleado: " + nombreEmpleado + "\n" +
                "Cedula empleado: " + cedulaEmpleado + "\n" +
                "Salario Básico: " + salarioBasico + "\n" +
                "Auxilio de Transporte: " + auxilioTransporte + "\n" +
                "Comisión de Ventas: " + comisionVentas + "\n" +
                "Préstamos: " + prestamos + "\n" +
                "Salario Neto a Recibir: " + salarioNeto);
  
    }
    
}
