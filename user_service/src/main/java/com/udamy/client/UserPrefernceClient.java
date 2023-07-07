package com.udamy.client;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

import java.util.List;
import java.util.Optional;

@Client("http://localhost:8081/api/user-prefrences")
public interface UserPrefernceClient {

    @Get("/{userId}")
    Optional<List<UserPrefernces>> getUserPrefernces(Integer userId);

}
