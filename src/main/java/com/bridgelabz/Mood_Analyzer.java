package com.bridgelabz;
// Refactor
// Refactor the code to take the mood message in Constructor
//- Note:
//- MoodAnalyser will have a message Field
//- MoodAnalyser will have 2 Constructors
//      – Default - MoodAnalyser() and with Parameters – MoodAnalyser(message)
//- analyseMood method will change to support no parameters and use message Field defined
// for the Class
public class Mood_Analyzer {
    Mood_Analyzer(){
        //Default constructor
    }
    String message;
    Mood_Analyzer(String message){      // Parameterized constructor
        this.message = message;
    }
    public static void main(String[] args) {
        System.out.println("Mood Analyzer Problem");
    }
    public String analyseMood(){        //Changed to no parameters
        if(message.contains("sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
