package com.ykp.designpattern.factory.abstr;

import com.ykp.designpattern.factory.Cup;

public class AbstractFactoryDemoTest {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ActualCupFactory();
        Cup cup = abstractFactory.makeGlassCup();
        cup.showCup();
    }
}
