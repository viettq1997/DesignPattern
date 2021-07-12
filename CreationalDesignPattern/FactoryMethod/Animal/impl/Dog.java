package CreationalDesignPattern.FactoryMethod.Animal.impl;

import CreationalDesignPattern.FactoryMethod.Animal.FourLegAnimal;

public class Dog extends FourLegAnimal {

    @Override
    public String getName() {
        return "I am Dog";
    }
    
}
