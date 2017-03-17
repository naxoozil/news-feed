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
        String textoDevolver = "";
        textoDevolver = textoDevolver + "Usuario " + getUsuario() + "\n";
        textoDevolver = textoDevolver + getComentarios() + "\n";
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