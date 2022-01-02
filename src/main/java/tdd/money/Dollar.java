// package tdd.example;
package tdd.money;

import java.util.function.DoubleSupplier;

class Dollar extends Money {

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
