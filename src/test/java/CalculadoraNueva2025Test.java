/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.calculadoranueva2025.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author winadmin
 */
public class CalculadoraNueva2025Test {

    public CalculadoraNueva2025Test() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    // Test para el metodo sumar
    @Test
    public void sumartest() {
        int resultado1 = CalculadoraNueva2025.sumar(10, 5);
        assertEquals(15, resultado1);

        int resultado2 = CalculadoraNueva2025.sumar(10, 5);
        assertTrue(resultado2 > 0, "La suma es positiva");

    }

    // Test para el metodo restar
    @Test
    public void restartest() {
        int resultado1 = CalculadoraNueva2025.restar(10, 5);
        assertEquals(5, resultado1);
        assertNotEquals (2, resultado1);
        
    }

    // Test parametrizados para el metodo sumar
    @ParameterizedTest
    @CsvSource({
        "8,4,12",
        "-25,-40,-65",
        "-1,-1,-2",
        "0,0,0",
        "100,200,300",
        "2,3,5"
    })

    void SumaParametrizada(int a, int b, int resultadoesperado) {
        assertEquals(resultadoesperado, CalculadoraNueva2025.sumar(a, b));
    }
}
