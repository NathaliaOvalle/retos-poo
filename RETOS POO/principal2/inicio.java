package principal2;

import salud2.persona;

public class inicio
 {
    public static void main(String[] args) 
    {
        double solucion;
        persona per = new persona();
        per.pedirDatos();
        per.mostrarPersona();
        per.mayorEdad();
        solucion = per.calcularImc();

        if(solucion <20)
         {
            System.out.println("el peso está por debajo de lo ideal");
         }
         else if(solucion >=20 && solucion<=25)
         {
            System.out.println("el peso es ideal");
         }
         else if(solucion>25)
         {
            System.out.println("significa que tiene sobrepeso");
         }
    }
}
