public class NameGenerator
{
    private String nombre;
    private String apellidos;
    private String apellidoMadre;
    private String ciudadDondeNacistes;

    public NameGenerator()
    {   
    }

    public String generateStarWarsName(String nombre,String apellidos,String apellidoMadre,String ciudadDondeNacistes)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.apellidoMadre = apellidoMadre;
        this.ciudadDondeNacistes = ciudadDondeNacistes; 
        String nombreStarWars = apellidos.substring(0,1).toUpperCase() +
        apellidos.substring(1,3).toLowerCase() + nombre.substring(0,3).toLowerCase();
        String apellidosStarWars = apellidoMadre.substring(0,1).toUpperCase()
        + apellidoMadre.substring(1,2).toLowerCase() +  ciudadDondeNacistes.substring(0,3).toLowerCase();
        return nombreStarWars + " " + apellidosStarWars;
    }
}