package com.udamy.controller;

import com.udamy.model.UserPrefernces;
import com.udamy.service.UserPreferencesService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import java.util.List;

@Controller("api/user-prefrences")
public class UserPrefrencesController {
    private UserPreferencesService userPreferencesService;

    public UserPrefrencesController(UserPreferencesService userPreferencesService) {
        this.userPreferencesService = userPreferencesService;
    }
    @Post
    public HttpResponse<UserPrefernces> createUserPrefernces(@Body UserPrefernces userPrefernces) {
        return HttpResponse.created(userPreferencesService.createUserPrefernces(userPrefernces));
    }

    @Get("/{userId}")
    public HttpResponse<List<UserPrefernces>> getUserPreferncesByUserId(@PathVariable("userId") int userId ){
        return HttpResponse.ok(userPreferencesService.getUserPreferncesByUserId(userId)) ;
    }
}
