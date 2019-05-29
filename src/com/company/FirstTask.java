package com.company;

public class FirstTask {
  
   public boolean booleanExpression(boolean a,boolean b,boolean c,boolean d){
            return (((a & b) ^ (b & c) ^ (c & d)) ^ ((a & b & c & d)));
        }
}
