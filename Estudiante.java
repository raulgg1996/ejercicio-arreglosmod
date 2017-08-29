public class Estudiante
{
    private String nombre;
    private int clave;
    
    public Estudiante(int claveini,String nombreini)
    {
       nombre=nombreini;
       clave=claveini;
    }
    
    public String dimedetalles()
    {
        return "Clave: "+clave+ "Nombre: "+nombre;
    }
    public int dimeClave()
    {
        return clave;
    }
}