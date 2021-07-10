package StructureDesignPattern.DecoratorDesignPattern.Decorators;

import StructureDesignPattern.DecoratorDesignPattern.base.IMilkTea;
import StructureDesignPattern.DecoratorDesignPattern.base.MilkTeaDecorator;

/**
 * BlackSugar có giá 2d
 */
public class BlackSugar extends MilkTeaDecorator {

    public BlackSugar(IMilkTea inner) {
        super(inner);
    }

    @Override
    public double cost() {
        double price = 2d + super.cost();
        return price;
    }
}
