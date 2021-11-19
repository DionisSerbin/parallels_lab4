package ru.bmstu.iu9;

import akka.actor.AbstractActor;
import akka.japi.pf.ReceiveBuilder;

public class TestPackageActor extends AbstractActor {
    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create().
                match(
                        MassageTestPackage.class, m -> {
                            for (Test test : m.getTests()) {
                                te
                            }
                        }
                )
    }
}
