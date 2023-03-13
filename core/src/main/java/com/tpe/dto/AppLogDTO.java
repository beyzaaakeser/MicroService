package com.tpe.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppLogDTO {

    private String id;

    private String level;

    private String description;

    private LocalDateTime time;


}
