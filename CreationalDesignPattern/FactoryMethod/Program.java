package CreationalDesignPattern.FactoryMethod;

import java.util.Random;

import CreationalDesignPattern.FactoryMethod.AbstractFactory.FourLegAnimalFactory;
import CreationalDesignPattern.FactoryMethod.AbstractFactory.TwoLegAnimalFactory;
import CreationalDesignPattern.FactoryMethod.Factory.IAnimalFactory;
import CreationalDesignPattern.FactoryMethod.Factory.impl.BasicAnimalFactory;
import CreationalDesignPattern.FactoryMethod.Factory.impl.RandomAnimalFactory;

public class Program {
    public static void main(String[] args) {

        // FactoryMethod
        BasicAnimalFactory factoryMethod1 = new BasicAnimalFactory();
        System.out.println(factoryMethod1.createAnimal().getName());
        RandomAnimalFactory factoryMethod2 = new RandomAnimalFactory();
        System.out.println(factoryMethod2.createAnimal().getName());

        // AbstractFactory
        IAnimalFactory factory;
        Random random = new Random();
        int type = random.nextInt(2);
        if (type == 0) {
            factory = new FourLegAnimalFactory();
        } else {
            factory = new TwoLegAnimalFactory();
        }

        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
        System.out.println(factory.createAnimal().getName());
    }
}
