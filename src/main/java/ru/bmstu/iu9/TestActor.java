package ru.bmstu.iu9;

import akka.actor.AbstractActor;
import akka.actor.ActorSelection;
import akka.japi.pf.ReceiveBuilder;

import javax.script.ScriptEngineManager;
import java.util.ArrayList;

public class TestActor extends AbstractActor {

    private ActorSelection store = getContext().actorSelection("/user/storeActor");
    private final String SCRIPT = "nashorn";

    private ArrayList<Test> buildTest(String jsScript, String functionName, String testName,
                                      String expectedResult, ArrayList<Integer> params){

        ScriptEngine scriptEngine = new ScriptEngineManager().getEngineByName()

    }

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
