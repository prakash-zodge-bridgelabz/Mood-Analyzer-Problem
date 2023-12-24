package com.bridgelabz;
// Use Case 2
// Handle Exception if User Provides Invalid Mood
//- Like NULL
public class Mood_Analyzer {
    String message;
    Mood_Analyzer(String message){      // Parameterized constructor
        this.message = message;
    }
    public static void main(String[] args) {
        System.out.println("Mood Analyzer Problem");
    }
    public String analyseMood(){        //Changed to no parameters
        try{
            if(message.contains("sad")){
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }catch(Exception e){         //Handle Exception if User Provides Invalid Mood like null
            return "HAPPY";
        }

    }
}
