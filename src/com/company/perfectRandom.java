package com.company;

/**
 * Created by bm846 on 10/9/18.
 */
public class perfectRandom {
    public int random;


    public int perfectRandom(int r){
        random = (int)(Math.random()*10);
        r = random * random;
       return r;

    }


}

