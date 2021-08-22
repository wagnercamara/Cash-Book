package com.wagner.backendcashbook.model.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name="tb_expenditure")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ExpenditureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_expenditure")
    private Integer ExpenditureEntityId;

    @Column(name="date_expenditure", nullable = false)
    private LocalDate expenditureEntityDate;

    @Column(name = "description_expenditure", length = 250, nullable = false)
    private String ExpenditureEntityDescription;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private UserEntity serviceEntityUserEntity;

    @ManyToOne
    @JoinColumn(name = "id_creditor")
    private CreditorEntity creditorEntity;

    @ManyToOne
    @JoinColumn(name = "id_type_expenditure")
    private TypeExpenditureEntity typeExpenditureEntity;

}
