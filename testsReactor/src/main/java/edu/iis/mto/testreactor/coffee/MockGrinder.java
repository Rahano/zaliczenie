package edu.iis.mto.testreactor.coffee;

public class MockGrinder implements Grinder {

    @Override public boolean canGrindFor(CoffeeSize size) {
        if(size == null)
            return false;
        return true;
    }

    @Override public double grind(CoffeeSize size) {
        return 50;
    }
}
