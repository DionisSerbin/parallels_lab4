package ru.bmstu.iu9;

import akka.NotUsed;
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.http.javadsl.Http;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.http.javadsl.server.AllDirectives;
import akka.http.javadsl.server.Route;
import akka.pattern.PatternsCS;
import akka.routing.RoundRobinPool;
import akka.stream.ActorMaterializer;
import akka.stream.javadsl.Flow;

import java.io.IOException;
import java.util.concurrent.CompletionStage;

public class AkkaApp extends AllDirectives {

    private static final String STORE_ACTOR = "storeActor";
    private static final String TEST_PACKAGE_ACTOR = "testPackageActor";
    private static final String TEST_PERFORM_ACTOR = "testPerformActor";
    private static final Integer POOLS_NUMBER = 5;
    private static final String ID_PACKAGE_STRING = "packageId";

    private Route createRoute() {
        return route(
                get(
                        () -> parameter(
                                ID_PACKAGE_STRING,
                                (packageId) -> {
                                    CompletionStage<Object> res = PatternsCS.ask(
                                            store
                                    )
                                }
                        )
                )
        )
    }

    public static void main(String[] args) throws IOException {
        final ActorSystem system = ActorSystem.create("lab4");
        final Http http = Http.get(system);
        final ActorMaterializer materializer = ActorMaterializer.create(system);
        ActorRef storeActor = system.actorOf(Props.create(StoreActor.class), STORE_ACTOR );
        ActorRef testPackageActor = system.actorOf(Props.create(TestPackageActor.class),
                TEST_PACKAGE_ACTOR );
        ActorRef testPerformActor = system.actorOf(
                new RoundRobinPool(POOLS_NUMBER).
                        props(Props.create(TestActor.class)),
                TEST_PERFORM_ACTOR);
        final Flow<
                HttpRequest,
                HttpResponse,
                NotUsed
                > route =
    }
}
