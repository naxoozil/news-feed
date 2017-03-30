import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * 
 */
public class EntradaFoto extends Comentarios
{
    private String urlImagen;
    private String titulo;
    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaFoto(String autor,String url, String titulo)
    {
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
    }
    
    public String getUrlImagen()
    {
        return urlImagen;
    }
	
	public String getTituloImagen()
    {
        return titulo;
    }

    public String toString()
    {
        String cadenaADevolver = "";
        cadenaADevolver += super.toString();
        cadenaADevolver += titulo + "<br/>";
        cadenaADevolver += urlImagen + "<br/>";
        return cadenaADevolver;

    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 6;
    }

	public void mostrarDatosExclusivos()
	{
		System.out.println(titulo + "\n" + urlImagen + "\n");
	}
}
