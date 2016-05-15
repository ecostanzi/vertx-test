package org.encos.tests;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;
import org.encos.tests.series.service.SeriesService;

/**
 * @author Enrico Costanzi
 */
public class VertxTestApp extends AbstractVerticle {

    private SeriesService seriesService = new SeriesService();

    @Override
    public void start() throws Exception {
        System.out.println("VertxTestApp STARTED!");

        Router router = Router.router(vertx);
        router.route("/").handler(StaticHandler.create());

        router.get("/api/series").handler(seriesService::getAll);

        vertx.createHttpServer()
                .requestHandler(router::accept)
                .listen(8080);
    }

}
