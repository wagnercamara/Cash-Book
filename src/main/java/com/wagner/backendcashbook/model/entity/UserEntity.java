package com.wagner.backendcashbook.model.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "tb_user")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_user")
    private Integer userEntityId;

    @Column(name = "name_user",nullable = false,length = 150)
    private String userEntityName;

    @Column(name = "password_user",nullable = false, length = 20)
    private String userEntityPassword;

    @Column(name = "email_user",nullable = false,unique = true)
    private String userEntityEmail;

    @Column(name = "registration_user")
    private LocalDate userEntityRegistrationDate;

}
