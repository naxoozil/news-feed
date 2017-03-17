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
        String textoDevolver = "";
        textoDevolver = textoDevolver + "Usuario " + getUsuario() + "\n";
        textoDevolver = textoDevolver + titulo + "\n";
        textoDevolver = textoDevolver + urlImagen + "\n";
        textoDevolver = textoDevolver + getMeGusta() + " me gusta";
       
        
        long segundosPasados = getMomentoPublicacion().until(LocalDateTime.now(),ChronoUnit.SECONDS);
        long minutosPasados = segundosPasados / 60;
        long segundosRestantes = segundosPasados % 60;
        if(minutosPasados == 0){
            textoDevolver = textoDevolver + " Hace " + segundosPasados + " segundos.";
        }
        else{
            textoDevolver = textoDevolver + " Hace " + minutosPasados + " minutos y " + segundosRestantes + " segundos.";
        }
        textoDevolver = textoDevolver + "\n" + getComentarios();
        return textoDevolver;
    }
}
