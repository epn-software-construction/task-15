package test;

import org.junit.Test;

import com.group6.TRectangulo;

import static org.junit.Assert.assertEquals;

public class TRectanguloTest {

    @Test
    public void testCalcularArea() {
        TRectangulo rectangulo = new TRectangulo(3, 4, 5);
        assertEquals(6.0, rectangulo.calcularArea(), 0.0001);
    }
}
