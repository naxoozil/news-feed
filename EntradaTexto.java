import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * 
 */
public class EntradaTexto
{
    // instance variables - replace the example below with your own
    private String usuario;
    private String mensaje;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList <String> comentarios;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor,String texto)
    {
        usuario = autor;
        mensaje = texto;
        ArrayList<String> comentarios = new ArrayList<String>();
        cantidadMeGusta = 0;
        momentoPublicacion = null;
    }

    /**
     * Metodo que suma un megusta
     */
    public void meGusta()
    {
        cantidadMeGusta++;
    }
    
    public void addComentario(String text)
    {
        comentarios.add(text);
    }
    
    public String getMensaje()
    {
        return mensaje;
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
            valorToString = "Usuario: " + usuario + " Mensaje: " + mensaje + "Momento de la publicación: " 
                            + momentoPublicacion + " Cantidad de Me Gusta: " + cantidadMeGusta + " Comentarios: "
                            + comentarios;
        }
        return valorToString;
    }
}
