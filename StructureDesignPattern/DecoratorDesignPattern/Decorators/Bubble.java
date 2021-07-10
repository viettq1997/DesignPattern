package StructureDesignPattern.DecoratorDesignPattern.Decorators;

import StructureDesignPattern.DecoratorDesignPattern.base.IMilkTea;
import StructureDesignPattern.DecoratorDesignPattern.base.MilkTeaDecorator;

/**
 * bubble có giá 1d
 */
public class Bubble extends MilkTeaDecorator {

    public Bubble(IMilkTea inner) {
        super(inner);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double cost() {
        double price = 1d + super.cost();
        return price;
    }
}
