package com.kaif.dockerspringbootproject.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

   
    private String name;
    private String email;
    private Long mobile;

}
