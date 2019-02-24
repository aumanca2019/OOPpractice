package com.sda.java.oopPractice;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyTimeTest {

    MyTime t = new MyTime(11,45,55);

    @Test
    public void print(){

        System.out.println(t.toString());

    }



    @Test
    public void setTime() {
    }




    @Test
    public void nextSecond() {
        System.out.println(t.nextSecond());
    }

    @Test
    public void nextMinute() {
        System.out.println(t.nextMinute());
    }

    @Test
    public void nextHour() {
        System.out.println(t.nextHour());
    }

    @Test
    public void previousSecond() {
        System.out.println(t.previousSecond());
    }

    @Test
    public void previousMinute() {
        System.out.println(t.previousMinute());
    }

    @Test
    public void previousHour() {
        System.out.println(t.previousHour());
    }
}