package com.example.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.enbedded.EmbeddedDatabaseBuilder;


@ConFiguration
public class TestConfig {

    @Bean
    public DataSource(h20){
            return new EmbeddedDatabaseBuilder()
                    .setType(EmbeddedDatabaseType.H2)
                    .build();

}}