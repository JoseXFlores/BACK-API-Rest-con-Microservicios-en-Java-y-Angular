package com.example.demo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("api/v1")
public class TestController {
	

	
	   @GetMapping("/hello")
	    public String getHello() {
	        return "GET sin parámetros";
	    }

	    @GetMapping("/hello/{name}")
	    public String getHelloWithName(@PathVariable String name) {
	        return "GET con parámetro: " + name;
	    }

	    // -------- POST --------

	    @PostMapping("/create")
	    public String postCreate() {
	        return "POST sin parámetros";
	    }

	    @PostMapping("/create/{item}")
	    public String postCreateWithItem(@PathVariable String item) {
	        return "POST con parámetro: " + item;
	    }

	    // -------- PUT --------

	    @PutMapping("/update")
	    public String putUpdate() {
	        return "PUT sin parámetros";
	    }

	    @PutMapping("/update/{id}")
	    public String putUpdateWithId(@PathVariable Long id) {
	        return "PUT con parámetro: ID = " + id;
	    }

	    // -------- DELETE --------

	    @DeleteMapping("/delete")
	    public String deleteSomething() {
	        return "DELETE sin parámetros";
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteWithId(@PathVariable int id) {
	        return "DELETE con parámetro: ID = " + id;
	    }

}