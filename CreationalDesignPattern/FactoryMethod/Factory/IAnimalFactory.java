package CreationalDesignPattern.FactoryMethod.Factory;

import CreationalDesignPattern.FactoryMethod.Animal.IAnimal;

public interface IAnimalFactory {
    IAnimal createAnimal();
}
