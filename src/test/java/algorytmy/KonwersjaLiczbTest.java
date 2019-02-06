package algorytmy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class KonwersjaLiczbTest {


    private  KonwersjaLiczb konwersjaLiczb;
    @Before
    public void setUp() throws Exception {
        konwersjaLiczb=new KonwersjaLiczb();
    }


    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void convertToInt() {
    }

    @Test
    public void convertInt() {
    }

    @Test
    public void mathPrecision() {
    }

    @Test
    public void mathRound() {
    }

    @Test
    public void max() {
    }

    @Test
    public void min() {
    }

    @Test
    public void sum() {
    }

    @Test
    public void calculate() {
    }
    @Test
    public void testCalculate() {
    double initialValue =1.1;

        BigDecimal excpectedValue = BigDecimal.valueOf(1.1*100/Math.PI);
        assertTrue(excpectedValue.equals(konwersjaLiczb.calculate(initialValue)));
    }
}