package Homework6.Exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    @Test
    void testKehrwert() {
        Fraction fraction = new Fraction(2, 3);
        fraction.Kehrwert();
        assertEquals(3, fraction.getZaehler());
        assertEquals(2, fraction.getNenner());
    }
    @Test
    void testMultiply() {
        Fraction fraction = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(4, 5);
        fraction.multiplikation(fraction2);
        assertEquals(8, fraction.getZaehler());
        assertEquals(15, fraction.getNenner());
    }
    @Test
    void testAddition() {
        Fraction fraction = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(4, 5);
        fraction.addition(fraction2);
        assertEquals(22, fraction.getZaehler());
        assertEquals(15, fraction.getNenner());
    }
    @Test
    void testKuerzen(){
        Fraction fraction = new Fraction(8, 12);
        assertEquals(2, fraction.getZaehler());
        assertEquals(3, fraction.getNenner());
    }


}
