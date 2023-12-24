package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//
public class Mood_Analyzer_Test {
    Mood_Analyzer mood;

    @Test
    public void test_analyseMood(){
        mood = new Mood_Analyzer("I am in good mood");
        String actual = mood.analyseMood();
        Assert.assertEquals("HAPPY",actual);
    }

}
