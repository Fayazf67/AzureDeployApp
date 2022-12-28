package com.fayaz.springbootAzureSQL;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Employee {


    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String dept;
    private long salary;


}
