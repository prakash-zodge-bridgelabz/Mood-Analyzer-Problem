package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// Test Case : 2.1
// Given Null Mood Should Return Happy
// - To make this Test Case pass Handle NULL Scenario using try catch and return Happy
public class Mood_Analyzer_Test {
    Mood_Analyzer mood;

    @Test
    public void test_analyseMood(){
        mood = new Mood_Analyzer(null);
        String actual = mood.analyseMood();
        Assert.assertEquals("HAPPY",actual);
    }

}
