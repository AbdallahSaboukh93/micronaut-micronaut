package com.udamy.client;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserPrefernces {
    private int id  ;
    private int userId ;
    private String locale  ;
    private String diet  ;
    private String notifyOff  ;
}
