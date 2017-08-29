public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes,String nomMateria)
    {
        estudiantes=new Estudiante[totalEstudiantes];
        this.nomMateria=nomMateria;
    }
    public int buscarEstudiante(int claveEstudiante)
    {
        for(int i=0;i<estudiantes.length;i++)
        {
            if(estudiantes[i].dimeClave()==claveEstudiante){
            return i;
        }
    }
    return -1;
}
    /**
     * Inscribir un estudiante nuevo en el grupo.
     * @param un Estudiante es el objeto estudiante a inscribir en el grupo.
     * @return regresa true si el estudiante fue inscrito y false en caso que no se pudo inscribir.
     */
    public boolean inscribir(Estudiante unEstudiante)
    {
        int existe=this.buscarEstudiante(unEstudiante.dimeClave());
        
        if(existe !=-1){
            return false;
        }
        int posDisponible=this.buscaEspacioDisponible();
        if(posDisponible==-1)
        {
            return false;
        }
        estudiantes[posDisponible]=unEstudiante;
        return true;
    }
         
    /**
     * Busca un espacio disponible en el arreglo.
     * regresa la posción nula dentro del arreglo
     */  
    private int buscaEspacioDisponible()
    {
        for(int i=0;i<estudiantes.length;i++)
        {
            if(estudiantes[i]==null)
            return i;
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
