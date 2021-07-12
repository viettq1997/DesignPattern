package CreationalDesignPattern.FactoryMethod.Animal.impl;

import CreationalDesignPattern.FactoryMethod.Animal.TwoLegAnimal;

public class Duck extends TwoLegAnimal {

    @Override
    public String getName() {
        return "I am Duck";
    }
    
}
