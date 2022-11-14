package com.lydia.my_reciepes.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    private String nameDish;
    private String storeDish;
    private String basisWeightDish;
    private String caloriesDish;
    private String descriptionDish;


}
