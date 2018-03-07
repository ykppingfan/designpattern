package com.ykp.designpattern.factory.function;

import com.ykp.designpattern.factory.Cup;

public class FactoryDemoTest {

    public static void main(String[] args) {
        Factory factory = new GlassCupFactory();
        Cup cup = factory.makeCup();
        cup.showCup();
    }
}
