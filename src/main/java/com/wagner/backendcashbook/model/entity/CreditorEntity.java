package com.wagner.backendcashbook.model.entity;

import lombok.*;

import javax.persistence.*;

@Table(name="tb_creditor")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CreditorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_creditor")
    private Integer creditorEntityId;

    @Column(name="name_creditor",nullable = false)
    private String creditorEntityName;
}
