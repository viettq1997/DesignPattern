package StructureDesignPattern.DecoratorDesignPattern.Decorators;

import StructureDesignPattern.DecoratorDesignPattern.base.IMilkTea;
import StructureDesignPattern.DecoratorDesignPattern.base.MilkTeaDecorator;

/**
 * EggPudding có giá 3d
 */
public class EggPudding extends MilkTeaDecorator {

    public EggPudding(IMilkTea inner) {
        super(inner);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double cost() {
        double price = 3d + super.cost();
        return price;
    }
}
