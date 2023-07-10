package com.in28minutes.rest.webservices.restfulwebservices.user;


import com.in28minutes.rest.webservices.restfulwebservices.exception.UserNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {


    private UserDaoService service;

    public UserResource(UserDaoService service){
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    // http://localhost:8080/users
    @GetMapping("/users/{id}")
    public EntityModel<User> retrieveUser(@PathVariable int id){
        User user =  service.findOne(id);
        if (user == null){
            throw new UserNotFoundException("id:" + id);
        }

        EntityModel<User> entityModel = EntityModel.of(user);

        WebMvcLinkBuilder link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder
                .methodOn(this.getClass()).retrieveAllUsers());

        entityModel.add(link.withRel("all-users"));

        return entityModel;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
       User savedUser = service.save(user);
        // location - /users/4
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri(); //current url -> users
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById(@PathVariable int id){
        service.deleteUserById(id);
    }
}
