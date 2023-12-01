package com.example.mytestingapplication3;


import java.io.IOException;

public class Diver {

    Integer num, denum;

    public Diver(Integer num, Integer denum){
        this.num=num;
        this.denum=denum;
    }

    public Integer eval() throws IOException {
        if(this.denum == 0){
            throw new IOException("Zero div");
        }
        return this.num/this.denum;
    }
}
