package com.riskcare.resttest.resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.base.Optional;
import com.yammer.metrics.annotation.Timed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * User: chris
 * Date: 07/12/13
 * Time: 23:37
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/numbers")
public class NumberResource {
    @GET
    @Path("percents")
    @Consumes(MediaType.APPLICATION_JSON)
    @Timed
    public String nextPercent(@QueryParam("percent") final Optional<Integer> percent) throws JsonProcessingException {
        int pc = percent.or(0);
        int newPercent = (int) (pc + (Math.random() * (100 - pc)));
        String json = "{\"oldPercent\":%d,\"percent\":%d}";
        return String.format(json, pc, newPercent);
    }
}