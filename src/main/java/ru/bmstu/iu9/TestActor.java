package ru.bmstu.iu9;

import akka.actor.AbstractActor;
import akka.actor.ActorSelection;
import akka.japi.pf.ReceiveBuilder;

import java.util.ArrayList;

public class TestActor extends AbstractActor {

    private ActorSelection store = getContext().actorSelection("/user/storeActor");

    private ArrayList<Test> 

    @Override
    public Receive createReceive() {
        return ReceiveBuilder.create().
                match(TestMessage.class, m -> {
                    store.
                            tell(
                                    new MessageStor(
                                            m.getPackageId(),

                                    )
                            );
                }
                )

    }

}
