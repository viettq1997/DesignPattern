package CreationalDesignPattern.FactoryMethod.Factory.impl;

import java.util.Random;

import CreationalDesignPattern.FactoryMethod.Animal.IAnimal;
import CreationalDesignPattern.FactoryMethod.Animal.impl.Cat;
import CreationalDesignPattern.FactoryMethod.Animal.impl.Dog;
import CreationalDesignPattern.FactoryMethod.Animal.impl.Duck;
import CreationalDesignPattern.FactoryMethod.Factory.IAnimalFactory;

public class RandomAnimalFactory implements IAnimalFactory {

    @Override
    public IAnimal createAnimal() {
        Random random = new Random();
        int type = random.nextInt(3);
        switch(type) {
            case 0:
                return new Dog();
            case 1:
                return new Cat();
            case 2:
                return new Duck();
            default:
                return new Dog();
        }
    }
    
}
