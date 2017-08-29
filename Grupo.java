public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes,String nomMateria)
    {
        estudiantes=new Estudiante[totalEstudiantes];
        this.nomMateria=nomMateria;
    }
    
    public void inscribir(Estudiante unEstudiante)
    {
        for(int i=0;i<estudiantes.length;i++)
        {
            if(estudiantes[0]==null)
            {
                estudiantes[i]=unEstudiante;
            }
        } 
            
    } 
        
     

//terminar este metodo de tarea
   public void darbaja(Estudiante claveEstudiante)
   {
       Estudiante eclave;
       for(int i=0;i<estudiantes.length;i++)
       {
           if(claveEstudiante==estudiantes[i].getclave())
           {
               estudiantes[i]=null;
            }
            else
            {
                System.out.println("la clave no es correcta");
            }
        }
    
    }
}
