package test;
import com.group6.Escaleno;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class EscalenoTest {

    @Test
    public void testCalcularArea() {
        Escaleno escaleno = new Escaleno(5, 6, 7);
        assertEquals(14.696938456699069, escaleno.calcularArea(), 0.0001);
    }
}
