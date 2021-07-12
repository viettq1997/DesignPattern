package CreationalDesignPattern.FactoryMethod.AbstractFactory;

import java.util.Random;

import CreationalDesignPattern.FactoryMethod.Animal.IAnimal;
import CreationalDesignPattern.FactoryMethod.Animal.impl.Cat;
import CreationalDesignPattern.FactoryMethod.Animal.impl.Dog;

public class FourLegAnimalFactory extends AbstractAnimalFactory {

    @Override
    public IAnimal createAnimal() {
        Random random = new Random();
        int type = random.nextInt(2);
        
        switch(type) {
            case 0:
                return new Dog();
            case 1:
                return new Cat();
            default:
                return new Dog();
        }
    }
    
}
