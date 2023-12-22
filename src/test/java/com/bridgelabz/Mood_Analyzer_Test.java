package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Test Case : 1.1
// Given “I am in Sad Mood” message Should Return SAD
// -analyseMood method can just return SAD to pass this Test Case (TC)
public class Mood_Analyzer_Test {
    Mood_Analyzer mood;
    @Before
    public void start(){
        mood = new Mood_Analyzer();
    }
    @Test
    public void test_analyseMood_sad(){
        String actual = mood.analyseMood("I am in sad Mood");
        Assert.assertEquals("SAD",actual);
    }

}
