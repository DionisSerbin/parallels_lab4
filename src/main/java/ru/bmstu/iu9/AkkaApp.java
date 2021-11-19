package ru.bmstu.iu9;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.http.javadsl.Http;
import akka.http.javadsl.server.AllDirectives;
import akka.stream.ActorMaterializer;

import java.io.IOException;

public class AkkaApp extends AllDirectives {

    private static final String STORE_ACTOR = "storeActor";

    public static void main(String[] args) throws IOException {
        final ActorSystem system = ActorSystem.create("lab4");
        final Http http = Http.get(system);
        final ActorMaterializer materializer = ActorMaterializer.create(system);
        ActorRef storeActor = system.actorOf(Props.create(StoreActor.class), STORE_ACTOR );
        test
    }
}
