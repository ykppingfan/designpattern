package com.ykp.designpattern.factory.abstr;

import com.ykp.designpattern.factory.Cup;
import com.ykp.designpattern.factory.GlassCup;
import com.ykp.designpattern.factory.VacuumCup;

/**
 * @Author: yangkunpeng
 * @Date 2018/3/7
 */
public class ActualCupFactory implements AbstractFactory {
    public Cup makeGlassCup() {
        return new GlassCup();
    }

    public Cup makeVacuumCup() {
        return new VacuumCup();
    }
}
