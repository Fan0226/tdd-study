//package tdd.example;
package tdd.money;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tdd.money.Dollar;

public class MoneyTest {
    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
