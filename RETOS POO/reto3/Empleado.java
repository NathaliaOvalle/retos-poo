package reto3;

public class Empleado extends persona
{
  private String cargo;
  private double valorHoras;
  private double horasTrabajadas;
  private double valorTotal;
  private String departamentos;
  private double total;

  

public Empleado(String nombre, String apellido, String ticDocumento, int documento, double peso, double estatura,
        String sexo, int edad, double pesoActual, String cargo, double valorHoras, double horasTrabajadas,
        double valorTotal, String departamentos, double total) 
        {
    super(nombre, apellido, ticDocumento, documento, peso, estatura, sexo, edad, pesoActual);
    this.cargo = cargo;
    this.valorHoras = valorHoras;
    this.horasTrabajadas = horasTrabajadas;
    this.valorTotal = valorTotal;
    this.departamentos = departamentos;
    this.total = total;
}
public void calcularHonorarios()
{

double reteica =0.966;
System.out.println("escriba el cargo correspondiente");
cargo =lectura.next();
System.out.println("escriba el valor de las horas que trabaja");
valorHoras =lectura.nextDouble();
System.out.println("escriba las horas trabajadas");
horasTrabajadas =lectura.nextDouble();
System.out.println("dijite el departamento donde vive");
departamentos =lectura.next();

total = valorHoras*horasTrabajadas-reteica;
}

public void imprimirDatos()
{
System.out.println("Tipo de documento:" +getTicDocumento());
System.out.println("Numero de documento:"+getDocumento());
System.out.println("Nombres:"+getNombre());
System.out.println("Apellidos:"+getApellido());
System.out.println("Cargo:"+cargo);
System.out.println("HorasTrabajadas:"+horasTrabajadas);
System.out.println("Valor por hora:"+valorHoras);
System.out.println("Total a pagar:"+total);
} 
}
