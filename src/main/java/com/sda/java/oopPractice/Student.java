package com.sda.java.oopPractice;

public class Student extends Persoana{
    private String numeFacultate;
    private int nrMatricol;


    public Student(String nume, String prenume, int varsta,
                   String facult, int nrMatr) {
        super(nume, prenume, varsta);
        this.numeFacultate = facult;
        this.nrMatricol = nrMatr;
    }

    public String getNumeFacultate() {
        return numeFacultate;
    }

    public int getNrMatricol() {
        return nrMatricol;
    }
}
