package com.example.backend.controller;

import com.example.backend.bean.Employee;
import com.example.backend.service.EmployeeService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("employee")
public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();

    @POST
    @Path("/login")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)

    public Response login(Employee employee) {
        Employee loggedInEmployee = EmployeeService.login(employee);

        if(loggedInEmployee == null)
            return Response.status(401).build();
        else
            return Response.ok().entity(loggedInEmployee).build();
    }
}
