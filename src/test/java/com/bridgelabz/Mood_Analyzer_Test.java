package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Test Case : 1.2
// Given “I am in Any Mood” message Should Return HAPPY
// -To make the Test case pass analyseMood method need to check for Sad else return HAPPY
public class Mood_Analyzer_Test {
    Mood_Analyzer mood;
    @Before
    public void start(){
        mood = new Mood_Analyzer();
    }
//    @Test
//    public void test_analyseMood_sad(){
//        String actual = mood.analyseMood("I am in Any Mood");
//        Assert.assertEquals("HAPPY",actual);
//    }

}
