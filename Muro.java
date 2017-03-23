import java.util.ArrayList;
/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{
    private ArrayList <Entrada> entradas;
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        entradas = new ArrayList <Entrada>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addEntradaTexto(Entrada entrada)
    {
        entradas.add(entrada);
    }

    public String toString()
    {
        String valorADevolver = "";
        for(Entrada entrada : entradas)
        {
            valorADevolver += entrada + "\n";
        }
        return valorADevolver;
    }

    public void mostrar()
    {
        System.out.println(this);
    }

    public void verCantidadDatosPorEntrada()
    {
        for(Entrada entrada : entradas)
        {
            System.out.println(entrada.getCantidadDeDatosAsociadosALaEntrada());
        }
    }

    public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntradaABuscar, String nombreAutor)
    {
        for(Entrada entrada : entradas)
        {
            if(entrada.getClass().getSimpleName() == tipoEntradaABuscar){
                if(entrada.getUsuario() == nombreAutor){
                    switch(entrada.getClass().getSimpleName())
                    {
                        case "EntradaTexto":

                        ((EntradaTexto)entrada).mostrarDatosExclusivos();
                        break;
                        case "EntradaFoto":

                        ((EntradaFoto)entrada).mostrarDatosExclusivos();	
                        break;
                        case "EntradaUnionAGrupo":

                        ((EntradaUnionAGrupo)entrada).mostrarDatosExclusivos();
                        break;
                    }
                }

            }
        }
    }

}
