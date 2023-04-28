package org.example;

import java.util.Date;

public class Pessoa {
    private String first_name;
    private String surname;
    private Date date_of_birfth;

    public Pessoa(String first_name, String surname, Date date_of_birfth){
        this.first_name = first_name;
        this.surname = surname;
        this.date_of_birfth = date_of_birfth;
    }
}
