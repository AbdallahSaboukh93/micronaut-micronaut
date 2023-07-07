package com.udamy.repository;

import com.udamy.model.UserPrefernces;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface UserPreferncesRepository extends CrudRepository<UserPrefernces ,Integer> {

    List<UserPrefernces> findByUserId(int userId);
}
