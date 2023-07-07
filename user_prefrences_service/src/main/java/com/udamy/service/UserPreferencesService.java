package com.udamy.service;

import com.udamy.model.UserPrefernces;
import com.udamy.repository.UserPreferncesRepository;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;
@Singleton
public class UserPreferencesService {
    private UserPreferncesRepository userPreferncesRepository ;

    public UserPreferencesService(UserPreferncesRepository userPreferncesRepository) {
        this.userPreferncesRepository = userPreferncesRepository;
    }

    public UserPrefernces createUserPrefernces(UserPrefernces userPrefernces) {
        userPreferncesRepository.save(userPrefernces) ;
        return  userPrefernces ;
    }

    public List<UserPrefernces> getUserPreferncesByUserId(int userId) {
        return userPreferncesRepository.findByUserId( userId) ;
    }
}
