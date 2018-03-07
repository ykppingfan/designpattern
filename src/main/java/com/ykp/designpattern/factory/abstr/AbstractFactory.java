package com.ykp.designpattern.factory.abstr;

import com.ykp.designpattern.factory.Cup;

public interface AbstractFactory {

    Cup makeGlassCup();

    Cup makeVacuumCup();
}
