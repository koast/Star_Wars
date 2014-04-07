public class NameGenerator
{
    private String nombre;
    private String apellidos;
    private String apellidoMadre;
    private String ciudadDondeNacistes;
    private static final int COMIENZO = 0;
    private static final int PRIMERA_LETRA = 1;
    private static final int FINAL = 3;
    private static final int APELLIDO_FINAL = 2;
    public NameGenerator()
    {   
    }

    public String generateStarWarsName(String nombre,String apellidos,String apellidoMadre,String ciudadDondeNacistes)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.apellidoMadre = apellidoMadre;
        this.ciudadDondeNacistes = ciudadDondeNacistes; 
        String nombreStarWars = apellidos.substring(COMIENZO,PRIMERA_LETRA).toUpperCase() +
        apellidos.substring(PRIMERA_LETRA,FINAL).toLowerCase() + nombre.substring(COMIENZO,FINAL).toLowerCase();
        String apellidosStarWars = apellidoMadre.substring(COMIENZO,PRIMERA_LETRA).toUpperCase()
        + apellidoMadre.substring(PRIMERA_LETRA,APELLIDO_FINAL).toLowerCase() +  ciudadDondeNacistes.substring(COMIENZO,FINAL).toLowerCase();
        return nombreStarWars + " " + apellidosStarWars;
    }
}