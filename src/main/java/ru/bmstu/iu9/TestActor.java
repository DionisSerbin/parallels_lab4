package ru.bmstu.iu9;

import akka.actor.AbstractActor;
import akka.actor.ActorSelection;
import akka.japi.pf.ReceiveBuilder;

public class TestActor extends AbstractActor {

    private ActorSelection store = getContext().actorSelection()

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create().
                match(TestMessage.class, m -> {

                }
                )
                
    }

}
