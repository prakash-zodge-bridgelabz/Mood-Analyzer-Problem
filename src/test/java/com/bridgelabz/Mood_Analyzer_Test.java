package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
// Test Case 3.1
// Given NULL Mood Should Throw MoodAnalysisException
// -To pass this Test Case in try catch block throw MoodAnalysisException
public class Mood_Analyzer_Test {
    Mood_Analyzer mood;

    @Test
    public void test_analyseMood(){
        mood = new Mood_Analyzer(null);
        String actual = mood.analyseMood();
        Assert.assertEquals("Custom Exception: Null mood",actual);
    }

}
