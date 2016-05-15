package org.encos.tests;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;

/**
 * @author Enrico Costanzi
 */
public class VertxTestApp extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        System.out.println("VertxTestApp STARTED!");

        Router router = Router.router(vertx);
        router.route().handler(StaticHandler.create());

        vertx.createHttpServer()
                .requestHandler(router::accept)
                .listen(8080);
    }
}
