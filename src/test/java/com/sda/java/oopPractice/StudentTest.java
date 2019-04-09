package com.sda.java.oopPractice;

import org.junit.Test;

import javax.swing.*;

import static javax.swing.JOptionPane.*;
import static org.junit.Assert.*;

public class StudentTest {
    final int N = 2;

    @Test
    public void testStudent() {

        Student student[] = new Student[N];
        for (int i = 0; i < N; i++) {
            String nume = JOptionPane.showInputDialog("nume = ");
            String prenume = JOptionPane.showInputDialog("prenume = ");
            int varsta = Integer.parseInt(JOptionPane.showInputDialog("varsta = "));
            String facultate = JOptionPane.showInputDialog("facultate = ");
            int nrMatr = Integer.parseInt(JOptionPane.showInputDialog("nrMatr = "));
            student[i] = new Student(nume,prenume,varsta,facultate,nrMatr);
        }
        int contor_ion = 0;
        for(int i = 0;i<N;i++){
            String prenumeCrt = student[i].getPrenume();
            if(prenumeCrt.compareTo("ion")== 0) contor_ion++;
        }
        System.out.println(contor_ion);

    }
}