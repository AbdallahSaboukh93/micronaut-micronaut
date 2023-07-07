package com.udamy.model;

import com.udamy.client.UserPrefernces;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserResponse {
    private User user;
    private List<UserPrefernces>  userPrefernces;
}
