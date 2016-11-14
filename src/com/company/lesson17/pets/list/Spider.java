package com.company.lesson17.pets.list;

import com.company.lesson17.pets.Pet;
import com.company.lesson17.pets.interfaces.Cobweb;
import com.sun.xml.internal.ws.server.sei.SEIInvokerTube;

import java.io.IOException;

/**
 * Created by Anton on 14.11.2016.
 */
public class Spider extends Pet implements Cobweb {
    public Spider() throws IOException {
        setWeight(initWeight());
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Трескает лапками по паутине");
    }

    @Override
    protected void sleep() {

    }

    @Override
    public void cobweb() {

    }
}
