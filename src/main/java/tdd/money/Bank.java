package tdd.money;

import java.util.Map;
import java.util.HashMap;

class Bank {
    private Map<Pair, Integer> rates = new HashMap<>();

    Money reduce(Expression source, String to) {
        // if (source instanceof Money)
        // return ((Money) source).reduce(to);
        // Sum sum = (Sum) source;
        return source.reduce(this, to);
    }

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    int rate(String from, String to) {
        // return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
        if (from.equals(to))
            return 1;
        return rates.get(new Pair(from, to));
    }
}
