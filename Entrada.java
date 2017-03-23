import java.time.LocalDateTime;
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
    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(String autor)
    {
        usuario = autor;
		momentoPublicacion = LocalDateTime.now();
		cantidadMeGusta = 0;

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
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }

    public String toString()
    {
        String cadenaADevolver = "";
        cadenaADevolver += "Usuario: " + getUsuario() + "\n";
        cadenaADevolver += getMeGusta() + " me gusta\n";
        
        long segundosQueHanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;
        
        cadenaADevolver += "Hace ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos ";
        }
        cadenaADevolver += segundosResiduales + " segundos.\n";                
        
        return cadenaADevolver;
    }
    
    public void mostrar()
    {
        
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 0;
    }
}
