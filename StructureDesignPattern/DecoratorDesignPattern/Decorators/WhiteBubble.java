package StructureDesignPattern.DecoratorDesignPattern.Decorators;

import StructureDesignPattern.DecoratorDesignPattern.base.IMilkTea;
import StructureDesignPattern.DecoratorDesignPattern.base.MilkTeaDecorator;

/**
 * WhiteBubble có giá 1.5d
 */
public class WhiteBubble extends MilkTeaDecorator {

    public WhiteBubble(IMilkTea inner) {
        super(inner);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double cost() {
        double price = 1.5d + super.cost();
        return price;
    }
}
