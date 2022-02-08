package com.ideaco.dia;

import com.ideaco.dia.request.RegisterUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class FirstController {

    @Autowired
    private FirstService firstService;

    public FirstController(FirstService firstService){
        this.firstService = firstService;
    }

    @GetMapping("/helloWorld")
    public String helloWorld(){
        //response
        return "helloWorld";
    }

    @GetMapping("/sendMessage")
    public String sendMessage(@RequestParam("message") String message){
        return firstService.sendMessage(message);
    }

    @GetMapping("/user/{userId}")
    public UserModel getUser(@PathVariable("userId") int userId){
        return firstService.getJobById(userId);
    }

    @PostMapping("/user/add")
    public UserModel createUser(@RequestBody RegisterUserRequest registerUserRequest){
        return firstService.createUser(registerUserRequest);
    }


}
