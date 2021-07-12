package CreationalDesignPattern.FactoryMethod.Animal.impl;

import CreationalDesignPattern.FactoryMethod.Animal.TwoLegAnimal;

public class Chicken extends TwoLegAnimal{

    @Override
    public String getName() {
        return "I am Chicken";
    }    
}
