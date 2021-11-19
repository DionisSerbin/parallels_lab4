package ru.bmstu.iu9;

import akka.actor.ActorRef;
import akka.actor.ActorSelection;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.http.javadsl.Http;
import akka.http.javadsl.server.AllDirectives;
import akka.routing.RoundRobinPool;
import akka.stream.ActorMaterializer;

import java.io.IOException;

public class AkkaApp extends AllDirectives {

    private static final String STORE_ACTOR = "storeActor";
    private static final String TEST_PACKAGE_ACTOR = "testPackageActor";
    private static final String TEST_PERFORM_ACTOR = "testPerformActor";
    private static final Integer POOLS_NUMBER = 5;

    public static void main(String[] args) throws IOException {
        final ActorSystem system = ActorSystem.create("lab4");
        final Http http = Http.get(system);
        final ActorMaterializer materializer = ActorMaterializer.create(system);
        ActorRef storeActor = system.actorOf(Props.create(StoreActor.class), STORE_ACTOR );
        ActorRef testPackageActor = system.actorOf(Props.create(TestPackageActor.class),
                TEST_PACKAGE_ACTOR );
        ActorRef testPerformActor = system.actorOf(
                new RoundRobinPool(POOLS_NUMBER).
                        props(Props.create(Tes)),
                TEST_PERFORM_ACTOR);
    }
}
