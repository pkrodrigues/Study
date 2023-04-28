package org.example;

import java.util.Date;

public class Motorista extends Pessoa{
    private int numberCnh;

    public Motorista(int numberCnh, String first_name, String surname, Date date_of_birfth){
        super(first_name, surname, date_of_birfth);
        this.numberCnh = numberCnh;
    }
}
