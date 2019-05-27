package com.company;

public class LeapYear {
  
  public static int leapYearCount(int year) {
        return ((int)(year / 4) - (int)(year / 100) + (int)(year / 400));
    }
}
