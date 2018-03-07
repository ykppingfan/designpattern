package com.ykp.designpattern.factory.function;

import com.ykp.designpattern.factory.Cup;
import com.ykp.designpattern.factory.GlassCup;

public class GlassCupFactory implements Factory {

    public Cup makeCup() {
        return new GlassCup();
    }
}
