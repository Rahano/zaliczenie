package edu.iis.mto.testreactor.coffee;

import static org.hamcrest.MatcherAssert.assertThat;

import edu.iis.mto.testreactor.coffee.milkprovider.MilkProvider;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CoffeeMachineTest {


    private MockGrinder mockGrinder = new MockGrinder();
    @Mock
    private MilkProvider milkProvider;

    private MockReceipes mockReceipes = new MockReceipes();
    private CoffeeMachine coffeeMachine;

    @BeforeEach
    public void init() throws Exception{
        coffeeMachine = new CoffeeMachine(mockGrinder, milkProvider,mockReceipes);
    }

    @Test
    public void positiveTest() {

        CoffeOrder coffeOrder = CoffeOrder.builder().withSize(CoffeeSize.STANDARD).withType(CoffeType.CAPUCCINO).build();
        Coffee result = coffeeMachine.make(coffeOrder);

    }



}
