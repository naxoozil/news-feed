import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaUnionAGrupo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaUnionAGrupo extends Entrada
{
    // instance variables - replace the example below with your own
    private String grupo;

    /**
     * Constructor for objects of class EntradaUnionAGrupo
     */
    public EntradaUnionAGrupo(String autor, String grupo)
    {
        super(autor);
        this.grupo = grupo;
    }

    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += super.toString();
        textoADevolver += "<em><strong>El usuario se ha unido al grupo</strong></em> " + grupo + "<br/>";

        return textoADevolver;
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 4;
    }

	public void mostrarDatosExclusivos()
	{
		System.out.println("El usuario se ha unido al grupo " + grupo + "\n");
	}
}
