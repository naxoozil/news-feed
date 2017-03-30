import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.temporal.ChronoUnit;

public class EntradaTexto extends Comentarios

{
    private String mensaje;
    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String texto)
    {
        super(autor);
        mensaje = texto;
    }
    
    public String getMensaje()
    {
        return mensaje;
    }
    
    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += super.toString();
        textoADevolver += mensaje + "<br/>";
        return textoADevolver;
    }

    public void mostrar()
    {
        System.out.println(this);
    }

    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 5;
    }

	public void mostrarDatosExclusivos()
	{
		System.out.println(mensaje + "\n");
	}

}