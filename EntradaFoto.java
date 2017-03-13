import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * 
 */
public class EntradaFoto
{
    // instance variables - replace the example below with your own
    private String usuario;
    private String urlImagen;
    private String titulo;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList <String> comentarios;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaFoto(String autor,String url, String titulo)
    {
        usuario = autor;
        urlImagen = url;
        this.titulo = titulo;
        ArrayList<String> comentarios = new ArrayList<String>();
        cantidadMeGusta = 0;
        momentoPublicacion = null;
    }

    /**
     * Metodo que suma un me gusta
     */
    public void meGusta()
    {
        cantidadMeGusta++;
    }
    
    public void unlike()
    {
        cantidadMeGusta++;
    }
    
    public void addComentario(String text)
    {
        comentarios.add(text);
    }
    
    public String getUrlImagen()
    {
        return urlImagen;
    }
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    public String toString()
    {
        String valorToString = "";
        if(comentarios == null){
            valorToString = "Esta entrada no tiene comentarios hasta el momento.";
        }
        else{
            valorToString = "Usuario: " + usuario + " Url: " + urlImagen + "Momento de la publicación: " 
                            + momentoPublicacion + " Cantidad de Me Gusta: " + cantidadMeGusta + " Comentarios: "
                            + comentarios;
        }
        return valorToString;
    }
}
