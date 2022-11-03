package com.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TheaterWritersApplication {

    public static void main(String[] args) {
        SpringApplication.run(TheaterWritersApplication.class, args);
        Builder theaterBuilder = Theater.newBuilder();

        String filename = "theater_protobuf_output";
        System.out.println("Reading from file " + filename);

        try(FileInputStream input = new FileInputStream(filename)) {
            Theater theater = theaterBuilder.mergeFrom(input).build();
            System.out.println(theater);
        }


    }

}
