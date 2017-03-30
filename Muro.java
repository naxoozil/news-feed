import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.io.IOException;
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
    
    public void mostrarMuroEnNavegador()
    {
        //referencia a una ruta donde estara el archivo
        Path rutaArchivo = Paths.get("muroAGuardar.html");
        // Abrimos archivo, escribimos en el y lo cerramos. Si se produce una exception la mostraremos
        try  
        {
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
            archivo.write("<html> <head> <title> Muro</title> <link rel=\"stylesheet\" type=\"text/css\" href=\"cogerCSS.css\" media=\"screen\"/> </head> <body>");
            archivo.write("<h1> Bienvenido </h1>");
            for (int i =0; i<entradas.size();i++)
            {
                archivo.write("<p>" + entradas.get(i) + "<br/></p>");
            }
            archivo.write("</body></html>");
            archivo.close();
        }
        catch (IOException excepcion) {
            System.out.println(excepcion.toString());
        }
        
        Runtime runtime = Runtime.getRuntime();
       
        try 
        {
            String cmd = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome "+"muroAGuardar.html" ;
            Runtime.getRuntime().exec(cmd); 
        } 
        catch (IOException ioe) 
        {
          System.out.println (ioe);
        }

    }

}
