package com.example.helloworld;

import java.util.Optional;

import io.inverno.core.annotation.Bean;
import io.inverno.core.v1.Application;
import io.inverno.mod.web.annotation.QueryParam;
import io.inverno.mod.web.annotation.WebController;
import io.inverno.mod.web.annotation.WebRoute;

@Bean
@WebController
public class App {

    @WebRoute(path = "/hello")
    public String hello(@QueryParam Optional<String> name) {
        return String.format("Hello, %s!", name.orElse("world"));
    }

    public static void main(String[] args) {
        Application.run(new Helloworld.Builder());
    }
}