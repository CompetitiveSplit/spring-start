package com.springapi.primeraapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apigreet")        // localhost:8080/apigreet/ ... ...
public class GreetController {

    // Establecer el metodo mediante el cual se ejecuta el endpoint
    @GetMapping("/hello")    // se llama al endpoint con url/hola mediante el metodo GET. Responde con el return.
    public String helloWorld() {          // <- Endpoint
        return "Hello, world!";
    }

    // Otro tipo de endpoint: url/variable1/variable2
    @GetMapping("/helloname/{name}/{age}")
    public String helloWorldName(@PathVariable String name,
                                 @PathVariable int age) {
        return "Hello, world!<br>" + name + ", your age is: " + age;
    }

}
