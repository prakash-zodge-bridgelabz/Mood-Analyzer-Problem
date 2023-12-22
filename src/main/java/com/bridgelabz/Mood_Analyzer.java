package com.bridgelabz;
// UC 1
// Given a Message, ability to analyse and respond Happy or Sad Mood
// - Create MoodAnalyser Object
// - Call analyseMood function with message as parameter and return Happy or Sad Mood
public class Mood_Analyzer {
    public static void main(String[] args) {
        System.out.println("Mood Analyzer Problem");
    }
    public String analyseMood(String msg){
        if(msg.contains("sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
