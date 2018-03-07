package com.ykp.designpattern.factory.simple;

import com.ykp.designpattern.factory.Cup;
import com.ykp.designpattern.factory.GlassCup;
import com.ykp.designpattern.factory.VacuumCup;

public class CupFactory {

    public static Cup getCup(String name) {
        if ("gs".equals(name)) {
            return new GlassCup();
        } else if ("vm".equals(name)) {
            return new VacuumCup();
        }
        return null;
    }

    public static void main(String[] args) {
        Cup gs = CupFactory.getCup("gs");
        gs.showCup();
        Cup vm = CupFactory.getCup("vm");
        vm.showCup();
    }
}
