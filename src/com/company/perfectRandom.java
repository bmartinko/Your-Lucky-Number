package com.company;

/**
 * Created by bm846 on 10/9/18.
 */
public class perfectRandom {
    public int number;
    public int value;

    public perfectRandom(int n){
        n = (int)(Math.random() * 10);
        number = n;
        value = number * number;

    }



}

