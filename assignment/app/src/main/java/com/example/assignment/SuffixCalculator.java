package com.example.assignment;

import java.io.IOException;

public class SuffixCalculator {

    String str;
    Integer num;

    public SuffixCalculator(String str, Integer num){
        this.str=str;
        this.num=num;
    }

    public String eval() throws IOException {
        int len = str.length();

          if(num > len){
            throw new IOException("Number is greater than the length of the input.");
        }
        return str.substring(len - num);
    }
}
