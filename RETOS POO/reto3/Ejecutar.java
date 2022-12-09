package reto3;

public class Ejecutar 
{
    public static void main(String[] args)
    {
        Empleado emple = new Empleado(null, null, null, 0, 0, 0, null, 0, 0, null, 0, 0, 0, null, 0); 
        emple.pedirDatos();
        emple.calcularHonorarios();
        emple.imprimirDatos();
    }
}
