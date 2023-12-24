package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
// Test Case 3.2
// Given Empty Mood Should Throw MoodAnalysisException indicating Empty Mood
// Handle Empty Mood Scenario throw MoodAnalysisException and inform user of the EmptyMood
// HINT: Use Enum to EMPTY or NULL
public class Mood_Analyzer_Test {
    Mood_Analyzer mood;

    @Test
    public void test_analyseMood(){
        mood = new Mood_Analyzer("");
        String actual = mood.analyseMood();
        Assert.assertEquals("Custom Exception: Empty mood",actual);
    }

}
