package com.udamy.service;

import com.udamy.client.UserPrefernceClient;
import com.udamy.client.UserPrefernces;
import com.udamy.exception.UserNotFoundException;
import com.udamy.model.User;
import com.udamy.model.UserResponse;
import com.udamy.repository.UserRepository;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class UserService {

    private final UserRepository userRepository;
    private final UserPrefernceClient userPrefernceClient;

    public UserService(UserRepository userRepository, UserPrefernceClient userPrefernceClient) {
        this.userRepository = userRepository;
        this.userPrefernceClient = userPrefernceClient;
    }

    public User createUser(User user) {
        userRepository.save(user);
        return user;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    private User getUserById(int id) {
        return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }

    public UserResponse getUserDetails(int id) {
        List<UserPrefernces> userPrefernces =userPrefernceClient.getUserPrefernces(id).orElse(null) ;
        return UserResponse.builder().userPrefernces(userPrefernces).user(getUserById(id)).build();
    }

    public User updateUser(int id, User user) {
        User oldUSer = getUserById(id);
        oldUSer.setAddress(user.getAddress());
        oldUSer.setName(user.getName());
        oldUSer.setEmail(user.getEmail());
        userRepository.update(oldUSer);
        return oldUSer;
    }


    public void deleteUserById(int id) {
        User oldUser = getUserById(id);
        userRepository.delete(oldUser);
    }

    public long getUsersCount() {
        return userRepository.count();
    }
}
