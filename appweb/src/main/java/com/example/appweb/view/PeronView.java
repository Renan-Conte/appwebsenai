package com.example.appweb.view;
import com.example.appweb.controller.Controller;
import com.example.appweb.model.Person;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PeronView {

    @Autowired
    Controller controller;
    @GetMapping("/person")
    public  Person findPerson(@PathParam("name") String name){
    return controller.findPerson(name);
    }
    @DeleteMapping("/person")
    public String deletePerson(@PathParam("name")String name){
        Person person = new Person();
      controller.deletePerson(name);
        return "Pessoa com o nome de " + name + " foi deletada";

    }
    @PostMapping("/person") public Person addPerson(@PathParam("name") String name, @PathParam("genero") String genero){
       return controller.addPerson(name, genero);
    }
    @PutMapping("/person")
    public Person updatePerson( @PathParam("name") String name,@PathParam("genero") String genero){

        return controller.editPerson(name, genero);
    }

}
