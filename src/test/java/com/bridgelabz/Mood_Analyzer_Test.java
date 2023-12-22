package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Repeat Test Case : 1.1
// Given “I am in Sad Mood” message in Constructor Should Return SAD
// - To pass this Test Case when calling analyseMood method with no params should return SAD
public class Mood_Analyzer_Test {
    Mood_Analyzer mood;

    @Test
    public void test_analyseMood_sad(){
        mood = new Mood_Analyzer("I am in sad Mood");
        String actual = mood.analyseMood();
        Assert.assertEquals("SAD",actual);
    }

}
