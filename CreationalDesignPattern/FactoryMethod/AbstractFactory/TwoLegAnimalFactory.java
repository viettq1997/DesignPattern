package CreationalDesignPattern.FactoryMethod.AbstractFactory;

import java.util.Random;

import CreationalDesignPattern.FactoryMethod.Animal.IAnimal;
import CreationalDesignPattern.FactoryMethod.Animal.impl.Chicken;
import CreationalDesignPattern.FactoryMethod.Animal.impl.Duck;

public class TwoLegAnimalFactory extends AbstractAnimalFactory {

    @Override
    public IAnimal createAnimal() {
        Random random = new Random();
        int type = random.nextInt(2);
        
        switch(type) {
            case 0:
                return new Chicken();
            case 1:
                return new Duck();
            default:
                return new Chicken();
        }
    } 
}
