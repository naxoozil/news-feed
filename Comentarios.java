import java.util.ArrayList;
/**
 * Write a description of class Comentarios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comentarios extends Entrada
{
    // instance variables - replace the example below with your own
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class Comentarios
     */
    public Comentarios(String autor)
    {
       super(autor);
       comentarios = new ArrayList<>();
    }
    
    public void addComentario(String texto)
    {
        comentarios.add(texto);        
    }
    
    public ArrayList<String> getComentarios()
    {
        return comentarios;
    }

    public String toString()
    {
        String textoADevolver = "";
        textoADevolver += super.toString();
        if (getComentarios().isEmpty()) {
            textoADevolver += "La entrada no tiene comentarios.\n";
        }
        else {
            //Se recopilan los comentarios
            textoADevolver += "Comentarios:\n";
            for (String comentario : getComentarios()) {
                textoADevolver += comentario + "\n";
            }

        }  
        return textoADevolver;
    }
    
}
