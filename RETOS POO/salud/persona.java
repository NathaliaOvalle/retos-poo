package salud;

import java.util.Scanner;

public class persona 
{
    public String nombre;
    public String apellido;
    public String ticDocumento;
    private int documento;
    public double peso;
    public double estatura;
    public String sexo;
    public int edad;
    public double pesoActual;

    Scanner lectura = new Scanner(System.in);
    public void pedirDatos()
    {
    System.out.println("dijite su tipo de documento");
    ticDocumento = lectura.next();
    System.out.println("dijite su numero de documento");
    documento = lectura.nextInt();
    System.out.println("dijite su nombre");
    nombre = lectura.next();
    System.out.println("dijite su apellido");
    apellido = lectura.next();
    System.out.println("dijite su estatura");
    estatura = lectura.nextDouble();
    System.out.println("dijite su peso");
    peso = lectura.nextDouble();
    System.out.println("dijite el sexo que lo identifica");
    sexo = lectura.next(); 
    System.out.println("dijite su edad");
    edad = lectura.nextInt();
    }
    public void mostrarPersona()
    {
        System.out.println("Su tipo de documento es:" +ticDocumento);
        System.out.println("Su numero de documento es:" +documento);
        System.out.println("Su nombre es:" +nombre);
        System.out.println("Su apellido es:" +apellido);
        System.out.println("Su estatura es:" +estatura);
        System.out.println("Su peso es:" +peso);
        System.out.println("el sexo que lo define es:" +sexo);
        System.out.println("Su edad correspondiente es:" +edad);

    }
    public void calcularImc()
    {
         pesoActual= (peso/estatura*2);
         
         if(pesoActual <20)
         {
            System.out.println("el peso está por debajo de lo ideal");
         }
         else if(pesoActual >=20 && pesoActual<=25)
         {
            System.out.println("el peso es ideal");
         }
         else if(pesoActual>25)
         {
            System.out.println("significa que tiene sobrepeso");
         }
    }
    public void mayorEdad()
    {
        if(edad<18)
        {
            System.out.println("es menor de edad");
        }
        else
        {
            System.out.println("es mayor de edad");
        }
    }
}
