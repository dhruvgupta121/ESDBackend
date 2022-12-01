package com.example.backend.controller;

import com.example.backend.bean.Salary;
import com.example.backend.service.SalaryService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("salary/{e_id}")
public class SalaryController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBills(@PathParam("e_id") int e_id) {
        List<Salary> salaryList = SalaryService.salaryHistory(e_id);
        return Response.ok().entity(salaryList).build();
    }
}
