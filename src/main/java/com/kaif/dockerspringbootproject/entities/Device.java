package com.kaif.dockerspringbootproject.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Device {

    private Long id;

    private Long time;
    private String msg;
    private Long humidity;
    private Long temperature;

}
