package ru.bmstu.iu9;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.http.javadsl.server.AllDirectives;

import java.io.IOException;

public class AkkaApp extends AllDirectives {

    public static void main(String[] args) throws IOException {
        final ActorSystem system = ActorSystem.create("lab4");
        ActorRef router = system.actorOf(Props.create(ActorRouter.class));
    }
}
