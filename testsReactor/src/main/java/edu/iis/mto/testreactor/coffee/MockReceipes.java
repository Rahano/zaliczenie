package edu.iis.mto.testreactor.coffee;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class MockReceipes implements CoffeeReceipes {

    @Override public Optional<CoffeeReceipe> getReceipe(CoffeType type) {
        Map<CoffeeSize, Integer> waterAmounts = Collections.emptyMap();
        waterAmounts.put(CoffeeSize.STANDARD, 150);

        if(type == CoffeType.CAPUCCINO){
            CoffeeReceipe coffeeReceipe = CoffeeReceipe.builder().withMilkAmount(50).withWaterAmounts(waterAmounts).build();
        }

    }
}
