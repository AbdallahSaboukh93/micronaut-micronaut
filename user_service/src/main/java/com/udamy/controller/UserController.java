package com.udamy.controller;

import com.udamy.model.User;
import com.udamy.model.UserResponse;
import com.udamy.service.UserService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller("api/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @Post
    public HttpResponse createUser(@Body @Valid User user) {
        return HttpResponse.created(userService.createUser(user));
    }
    @Get
    public HttpResponse<List<User>> getAllUsers() {
        return HttpResponse.ok(userService.getAllUsers());
    }

    @Get("/{id}")
    public HttpResponse<UserResponse> getUserById(@PathVariable("id") int id) {
        return HttpResponse.ok(userService.getUserDetails(id));
    }

    @Put("/{id}")
    public  HttpResponse<User> updateUser(@PathVariable("id") int id ,@Body User user){
        return HttpResponse.ok(userService.updateUser(id ,user)) ;
    }

    @Delete("/{id}")
    public  HttpResponse<Void> deleteUserById(@PathVariable("id") int id ){
        userService.deleteUserById(id);
       return HttpResponse.ok() ;
    }
}
