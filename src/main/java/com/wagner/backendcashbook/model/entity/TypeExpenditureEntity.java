package com.wagner.backendcashbook.model.entity;

import lombok.*;

import javax.persistence.*;

@Table(name="tb_type_expenditure")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class TypeExpenditureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_type_expenditure")
    private Integer typeExpenditureEntityId;

    @Column(name="name_type_expenditure", nullable = false)
    private String typeExpenditureEntityName;
}
