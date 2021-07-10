package StructureDesignPattern.DecoratorDesignPattern;

import StructureDesignPattern.DecoratorDesignPattern.Decorators.BlackSugar;
import StructureDesignPattern.DecoratorDesignPattern.Decorators.Bubble;
import StructureDesignPattern.DecoratorDesignPattern.Decorators.EggPudding;
import StructureDesignPattern.DecoratorDesignPattern.Decorators.WhiteBubble;
import StructureDesignPattern.DecoratorDesignPattern.base.IMilkTea;
import StructureDesignPattern.DecoratorDesignPattern.base.MilkTea;

public class Program {
    public static void main(String[] args) {
        IMilkTea ourMilkTea = new EggPudding(
                                new BlackSugar(
                                    new Bubble(
                                        new WhiteBubble(
                                            new MilkTea()))));
        System.out.println("EggPuddingAndBlackSugarAndBubbleAndWhiteBubbleMilkTea:\t"
                            + ourMilkTea.cost());

        IMilkTea secondMilkTea = new Bubble(
                                    new BlackSugar(
                                        new MilkTea()));
        System.out.println("BubbleAndBlackSugarMilkTea:\t"
                            + secondMilkTea.cost());
    }
}
