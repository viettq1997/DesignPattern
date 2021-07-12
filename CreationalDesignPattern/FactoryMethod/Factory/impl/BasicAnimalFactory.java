package CreationalDesignPattern.FactoryMethod.Factory.impl;

import CreationalDesignPattern.FactoryMethod.Animal.IAnimal;
import CreationalDesignPattern.FactoryMethod.Animal.impl.Cat;
import CreationalDesignPattern.FactoryMethod.Animal.impl.Dog;
import CreationalDesignPattern.FactoryMethod.Animal.impl.Duck;
import CreationalDesignPattern.FactoryMethod.Factory.IAnimalFactory;

public class BasicAnimalFactory implements IAnimalFactory {

    int index = 0;

    @Override
    public IAnimal createAnimal() {
        if (index == 0) {
            index++;
            return new Dog();
        }
        if (index == 1) {
            index++;
            return new Cat();
        }
        if (index == 2) {
            index = 0;
            return new Duck();
        }
        return null;
    }
}
