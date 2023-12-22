package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Repeat Test Case : 1.2
// Given “I am in Happy Mood” message in Constructor Should Return HAPPY
// - To pass this Test Case when calling analyseMood method with no params should return HAPPY
public class Mood_Analyzer_Test {
    Mood_Analyzer mood;

    @Test
    public void test_analyseMood(){
        mood = new Mood_Analyzer("I am in Happy Mood");
        String actual = mood.analyseMood();
        Assert.assertEquals("HAPPY",actual);
    }

}
