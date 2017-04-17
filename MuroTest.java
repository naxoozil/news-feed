

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MuroTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MuroTest
{
    private Muro muro1;
    private EntradaTexto entradaT1;
    private EntradaTexto entradaT2;
    private EntradaFoto entradaF1;
    private EntradaFoto entradaF2;
    private EntradaUnionAGrupo entradaU1;
    private EntradaUnionAGrupo entradaU2;

    
    
    
    
    
    
    

    
    
    
    
    
    
    

    
    
    
    
    
    
    

    
    
    
    
    
    
    

    /**
     * Default constructor for test class MuroTest
     */
    public MuroTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        muro1 = new Muro();
        entradaT1 = new EntradaTexto("miguel", "nba");
        entradaT2 = new EntradaTexto("clase", "facebook");
        entradaF1 = new EntradaFoto("brian", "facebook", "clase");
        entradaF2 = new EntradaFoto("torxu", "nba", "miguel");
        entradaU1 = new EntradaUnionAGrupo("naxo", "clase");
        entradaU2 = new EntradaUnionAGrupo("torxu", "nba");
        muro1.addEntradaTexto(entradaF1);
        muro1.addEntradaTexto(entradaF2);
        muro1.addEntradaTexto(entradaU1);
        muro1.addEntradaTexto(entradaU2);
        muro1.addEntradaTexto(entradaT2);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
