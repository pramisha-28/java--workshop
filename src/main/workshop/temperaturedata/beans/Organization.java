package src.com.vetias.java.temperaturedata.beans;

import java.time.LocalDate;

public record Organization(String name,
    
        String CompleteAddress,
        String Website,
        String email,
        String contactNumber,
        long registrationNumber,
        LocalDate registrationDate) {
        }
      
    
