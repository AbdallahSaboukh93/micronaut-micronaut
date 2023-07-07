package com.udamy.model;

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
@Introspected
@Entity
@Table(name="user_prefernces")
public class UserPrefernces {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id  ;

    @NotBlank
    @Column(name = "user_id")
    private int userId ;
    @NotBlank
    @Column
    private String locale  ;
    @NotBlank
    @Column
    private String diet  ;
    @NotBlank
    @Column(name = "notify_off")
    private String notifyOff  ;
}
