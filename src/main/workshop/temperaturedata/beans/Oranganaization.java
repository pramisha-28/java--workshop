package src.com.vetias.java.temperaturedata.beans;

import java.time.LocalDate;

public record Oranganaization(String name,
        String completeAddress,
        String website,
        String email,
        String contactNumber,
        long registrationNumber,
        LocalDate registrationDate) {
        }
      
    
