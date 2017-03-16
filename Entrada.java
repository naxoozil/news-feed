import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entrada
{
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;
    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(String autor)
    {
        usuario = autor;
		momentoPublicacion = LocalDateTime.now();
		cantidadMeGusta = 0;
		comentarios = new ArrayList<>();
    }
	
	public String getUsuario()
	{
		return usuario;
	}
	
    public void meGusta()
    {
        cantidadMeGusta++;
    }

	public int getMeGusta()
	{
		return cantidadMeGusta;
	}	
    
    public void addComentario(String texto)
    {
        comentarios.add(texto);        
    }
	
	public ArrayList<String> getComentarios()
	{
		return comentarios;
	}
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }

    
    public String toString()
    {
		String valorADevolver = "";
        return valorADevolver;
    }
}
