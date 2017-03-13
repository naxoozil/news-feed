import java.util.ArrayList;
/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{
    // instance variables - replace the example below with your own
    private ArrayList <EntradaTexto> mensajes;
    private ArrayList <EntradaFoto> fotos;
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        ArrayList <EntradaTexto> mensajes = new ArrayList <EntradaTexto>();
        ArrayList <EntradaFoto> fotos = new ArrayList <EntradaFoto>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addEntradaTexto(EntradaTexto entradaTexto)
    {
        mensajes.add(entradaTexto);
    }
    
    public void addEntradaFoto(EntradaFoto entradaFoto)
    {
        fotos.add(entradaFoto);
    }
}
