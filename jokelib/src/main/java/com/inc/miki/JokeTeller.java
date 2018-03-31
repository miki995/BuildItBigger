package com.inc.miki;

import java.util.Random;

public class JokeTeller {

    private static final  String jokes[]={
            "Chuck Norris threw a grenade and killed 50 people, then it exploded.",
            "Talking to a liberal is like trying to explain social media to a 70 years old",
            "When Chuck Norris does a push up, he isn't lifting himself up, he's pushing the Earth down.",
            "Maybe if we start telling people the brain is an app they will start using it",
            "I changed my password to \"incorrect\". So whenever I forget what it is the computer will say \"Your password is incorrect\"",
            "If you were a browser, you'd be called FireFoxy."

    };
    public static String getJoke(){
        int size=jokes.length;
        Random r=new Random();
        int index=r.nextInt(size);
        return jokes[index];
    }

}
