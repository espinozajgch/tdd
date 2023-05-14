package utilidades;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    Calculadora calculadora;

    //Flujo de Trabajo AAA (Arrenge, Act, Assert)

    //TestFixture
    @BeforeEach
    void setUp() {
        //arrange
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Suma")
    void testSuma(){
        //fail("Not yet implemented");

        //act
        double suma = calculadora.sumar(2,2);
        boolean igual = suma==4;
        boolean distinto = suma==2;

        //expected
        assertEquals(4, suma);
        assertTrue(igual);
        assertFalse(distinto);
    }

    @Test
    @DisplayName("Resta")
    void testResta(){
        //fail("Not yet implemented");

        //act
        double resta = calculadora.restar(2,2);

        //expected
        assertEquals(0, resta);

    }

    @Test
    @DisplayName("Dividir")
    void testDividir(){
        //fail("Not yet implemented");

        //act
        double dividir = calculadora.dividir(2,2);

        //expected
        assertEquals(1, dividir);
        assertThrows(RuntimeException.class, ()->calculadora.dividir(2,0));

    }
}