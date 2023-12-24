package com.bridgelabz;
// Use Case 3
// Inform user if entered Invalid Mood
//- In case of NULL or Empty Mood throw Custom Exception MoodAnalysisException
//- Use Enum to differentiate the Mood Analysis Errors

class MoodAnalysisException extends Exception{
    enum Mood_Enum{         //Enumeration is a 'public' 'final' for class as well as variables;
        Null_Mood, Empty_Mood;
    }
    Mood_Enum enum_mood;
}
public class Mood_Analyzer {
    String message;
    Mood_Analyzer(String message){      // Parameterized constructor
        this.message = message;
    }
    public static void main(String[] args) {
        System.out.println("Mood Analyzer Problem");
    }
    public String analyseMood(){
        try{
            MoodAnalysisException m_exc = new MoodAnalysisException();
            if(message == null){
                m_exc.enum_mood = MoodAnalysisException.Mood_Enum.Null_Mood;    // Null mood Exception
                throw m_exc;
            } else if (message.isEmpty()) {
                m_exc.enum_mood = MoodAnalysisException.Mood_Enum.Empty_Mood;   // Empty mood Exception
                throw m_exc;
            } else if (message.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch(MoodAnalysisException e){         //Handle Exception if User Provides Invalid Mood like null
            switch (e.enum_mood){
                case Null_Mood: return "Custom Exception: Null mood";
                case Empty_Mood: return "Custom Exception: Empty mood";
                default: return "Custom Exception: Invalid mood";
            }
        }

    }
}
