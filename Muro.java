import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.io.*;
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
            String cmd = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome "+ "muroAGuardar.html" ;
            Runtime.getRuntime().exec(cmd); 
        } 
        catch (IOException ioe) 
        {
          System.out.println (ioe);
        }

    }
    
    public void mostrarMuroNavegadorSegundaParte(String autor)
    {
        try{
            URL url = new URL("https://script.google.com/macros/s/AKfycbzHc3p1twTfyF7o0_cxSwnxSsyOemuHnSu406ly9DZIf5Ck2BA/exec?user=" + autor);
            Scanner sc = new Scanner(url.openStream());
            int cont = 0;
            while (sc.hasNextLine()) {
                String lineaLeida= sc.nextLine();
                String[] muroNavegador = lineaLeida.split(";");
                
                switch(entradas.getClass().getSimpleName())
                {
                    //En el caso de EntradaTexto
                    case "EntradaTexto":
                    
                    EntradaFoto entradaFoto = new EntradaFoto(muroNavegador[1],muroNavegador[4], muroNavegador[5]);
                    this.entradas.add(entradaFoto);

                    cont = 0;
                    while(cont<Integer.parseInt(muroNavegador[2])){
                        entradaFoto.meGusta();
                        cont++;
                    }

                    cont = 0;
                    muroNavegador[3] = muroNavegador[3].replace("-","/");
                    muroNavegador[3] = muroNavegador[3].replace(":","/");

                    String fechaYHora[] = muroNavegador[3].split("/");
                    int[] elementosFechaHora = new int[5];
                    while(cont < 5){
                        elementosFechaHora[cont] = Integer.parseInt(fechaYHora[cont]);
                        cont++;
                    }
                    LocalDateTime momentoLeido = LocalDateTime.of(elementosFechaHora[2], elementosFechaHora[1], elementosFechaHora[0], elementosFechaHora[3], elementosFechaHora[4]);
                    

                    if(!muroNavegador[6].equals("Sin comentarios")){
                        String comentarios[] = muroNavegador[6].split("%");

                        cont = 0;
                        while(cont<comentarios.length){
                            entradaFoto.addComentario(comentarios[cont]);
                            cont++;
                        }
                    }
                    
                    break;
                    //En el caso de EntradaFoto
                    case "EntradaFoto":
                    
                    EntradaTexto entradaTexto = new EntradaTexto(muroNavegador[1],muroNavegador[4]);
                    this.entradas.add(entradaTexto);

                    cont = 0;
                    while(cont<Integer.parseInt(muroNavegador[2])){
                        entradaTexto.meGusta();
                        cont++;
                    }

                    cont = 0;
                    muroNavegador[3] = muroNavegador[3].replace("-","/");
                    muroNavegador[3] = muroNavegador[3].replace(":","/");

                    String fechaYHoraFoto[] = muroNavegador[3].split("/");
                    int[] elementosFechaHoraFoto = new int[5];
                    while(cont < 5){
                        elementosFechaHoraFoto[cont] = Integer.parseInt(fechaYHoraFoto[cont]);
                        cont++;
                    }
                    LocalDateTime momentoLeidoFoto = LocalDateTime.of(elementosFechaHoraFoto[2], elementosFechaHoraFoto[1], elementosFechaHoraFoto[0], elementosFechaHoraFoto[3], elementosFechaHoraFoto[4]);

                    if(!muroNavegador[5].equals("Sin comentarios")){
                        String comentarios[] = muroNavegador[5].split("%");

                        cont = 0;
                        while(cont<comentarios.length){
                            entradaTexto.addComentario(comentarios[cont]);
                            cont++;
                        }
                    }
                    
                    break;
                    //En el caso de EntradaUnionAGrupo
                    case "EntradaUnionAGrupo":
                    
                    EntradaUnionAGrupo entradaUnionAGrupo = new EntradaUnionAGrupo(muroNavegador[1], muroNavegador[4]);
                    this.entradas.add(entradaUnionAGrupo);

                    cont = 0;
                    while(cont < Integer.parseInt(muroNavegador[2])){
                        entradaUnionAGrupo.meGusta();
                        cont++;
                    }

                    cont = 0;
                    muroNavegador[3] = muroNavegador[3].replace("-","/");
                    muroNavegador[3] = muroNavegador[3].replace(":","/");

                    String fechaYHoraEnGrupo[] = muroNavegador[3].split("/");
                    int[] elementosFechaHoraEnGrupo = new int[5];
                    while(cont < 5){
                        elementosFechaHoraEnGrupo[cont] = Integer.parseInt(fechaYHoraEnGrupo[cont]);
                        cont++;
                    } 
                    
                    break;
                    
                }
            }
            sc.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        this.mostrarMuroEnNavegador();
    }

}
