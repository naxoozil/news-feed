import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Entrada
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
        cadenaADevolver += "Usuario: " + getUsuario() + "<br/>";
        cadenaADevolver += getMeGusta() + " <em>me gusta</em> <br/>";
        
        long segundosQueHanPasado = getMomentoPublicacion().until(LocalDateTime.now(),ChronoUnit.SECONDS);
        long minutosQueHanPasado = segundosQueHanPasado / 60;
        long segundosResiduales = segundosQueHanPasado % 60;
        long horasQueHanPasado = minutosQueHanPasado / 60;
        long diasQueHanPasado = horasQueHanPasado / 24;
        
        cadenaADevolver += "Hace ";
        if(minutosQueHanPasado > 0 )
        {
            if(diasQueHanPasado>=1){
                cadenaADevolver += diasQueHanPasado + " dias";
            }
            else if (minutosQueHanPasado > 1440 && minutosQueHanPasado > 0){
                cadenaADevolver += diasQueHanPasado + " minutos";
            }
        }
        cadenaADevolver += segundosResiduales + " segundos. <br/>";
        
        return cadenaADevolver;
    }
    
    public abstract void mostrar();
    public abstract int getCantidadDeDatosAsociadosALaEntrada();
    
}
