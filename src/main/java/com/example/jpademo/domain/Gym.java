package com.example.jpademo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.ResourceSupport;

import java.io.Serializable;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gym{

    private String id;
    private String name;
    private String address;

}
