package org.encos.tests.series.service;

import io.vertx.core.json.Json;
import io.vertx.ext.web.RoutingContext;
import org.encos.tests.series.dto.Series;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Enrico Costanzi
 */
public class SeriesService {

    private static Map<Integer, Series> seriesMap = new HashMap<>();

    static {

        seriesMap.put(1, new Series("The Wire", 9.0));
        seriesMap.put(2, new Series("Breaking Bad", 10.0));
    }

    public void getAll(RoutingContext routingContext) {
        routingContext.response()
                .putHeader("content-type", "application/json; charset=utf-8")
                .end(Json.encodePrettily(seriesMap.values()));
    }

}
