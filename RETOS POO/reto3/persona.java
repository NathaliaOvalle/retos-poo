package reto3;

import java.util.Scanner;

public class persona 
{
    private String nombre;
    private String apellido;
    private String ticDocumento;
    private int documento;
    private double peso;
    private double estatura;
    private String sexo;
    private int edad;
    private double pesoActual;

    Scanner lectura = new Scanner(System.in);

    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getApellido() 
    {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getTicDocumento() {
        return ticDocumento;
    }


    public void setTicDocumento(String ticDocumento) {
        this.ticDocumento = ticDocumento;
    }


    public int getDocumento() {
        return documento;
    }


    public void setDocumento(int documento) {
        this.documento = documento;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public double getEstatura() {
        return estatura;
    }


    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }


    public String getSexo()
    {
        return sexo;
    }
    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }
    public int getEdad() 
    {
        return edad;
    }
    public void setEdad(int edad) 
    {
        this.edad = edad;
    }
    public double getPesoActual()
    {
        return pesoActual;
    }
    public void setPesoActual(double pesoActual) 
    {
        this.pesoActual = pesoActual;
    }

    public persona(String nombre, String apellido, String ticDocumento, int documento, double peso, double estatura,
            String sexo, int edad, double pesoActual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ticDocumento = ticDocumento;
        this.documento = documento;
        this.peso = peso;
        this.estatura = estatura;
        this.sexo = sexo;
        this.edad = edad;
        this.pesoActual = pesoActual;
    }
    public void pedirDatos()
    {
     System.out.println("dijite el tipo de documento");
     setTicDocumento(lectura.next());
     System.out.println("dijite el numero de documento");
     setDocumento(lectura.nextInt());
     System.out.println("dijite su nombre");
     setNombre(lectura.next());
     System.out.println("dijite su apellido");
     setApellido(lectura.next());
     System.out.println("dijite su estatura");
     setEstatura(lectura.nextDouble());
     System.out.println("dijite su peso");
     setPeso(lectura.nextDouble());
     System.out.println("dijite el sexo que lo identifica");
     setSexo(lectura.next());
     System.out.println("escriba su edad actual");
     setEdad(lectura.nextInt());
    }
    
}