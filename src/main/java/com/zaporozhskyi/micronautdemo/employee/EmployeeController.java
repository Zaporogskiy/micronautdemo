package com.zaporozhskyi.micronautdemo.employee;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@Controller(value = "employee")
@RequiredArgsConstructor
public class EmployeeController {

    @Inject
    private final EmployeeService employeeService;

    @Get(uri = "/{id}", produces = MediaType.APPLICATION_JSON)
    HttpResponse<EmployeeDto> getById(@PathVariable long id) {
        return Optional.ofNullable(employeeService.findEmployee(id))
                .map(HttpResponse::ok)
                .orElseGet(HttpResponse::notFound);
    }
}
