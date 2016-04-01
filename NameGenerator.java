
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
      public static final int NOMBRE = 3;
      public static final int APELLIDO_1 = 3;
      public static final int APELLIDO_2 = 2;
      public static final int LUGAR_N = 3;
      public static final int AP  = 0;
    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
       
    }

    /**
     * 
     */
    
     public String generateStarWarsName(String nombre, String apellido1, String apellido2, String lugarN){
      return (apellido1.substring(AP,APELLIDO_1)+(nombre.toLowerCase().substring(AP,NOMBRE))+
            " " +apellido2.substring(AP,APELLIDO_2)+lugarN.toLowerCase().substring(AP,LUGAR_N));
        
    }
}













