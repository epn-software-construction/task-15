package test;

import org.junit.Test;

import com.group6.Isoceles;

import static org.junit.Assert.assertEquals;

public class IsocelesTest {

    @Test
    public void testCalcularArea() {
        Isoceles isoceles = new Isoceles(5, 5, 6);
        assertEquals(12.0, isoceles.calcularArea(), 0.0001);
    }
}