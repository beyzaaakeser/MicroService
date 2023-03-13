package com.tpe.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.tpe.enums.AppLogLevel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Document // !!! MongoDb kullanildigi icin @Entity yerine @Document kullanildi
public class AppLog {

    @Id
    private String id;

    private AppLogLevel level;

    private String description;

    private LocalDateTime time;

}
