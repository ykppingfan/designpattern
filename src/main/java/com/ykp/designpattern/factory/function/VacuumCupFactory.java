package com.ykp.designpattern.factory.function;

import com.ykp.designpattern.factory.Cup;
import com.ykp.designpattern.factory.VacuumCup;

public class VacuumCupFactory implements Factory {

    public Cup makeCup() {
        return new VacuumCup();
    }
}
