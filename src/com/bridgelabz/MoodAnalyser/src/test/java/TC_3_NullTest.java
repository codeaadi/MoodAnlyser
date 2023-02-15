package com.bridgelabz.MoodAnalyser.src.test.java;

import com.bridgelabz.MoodAnalyser.src.main.java.org.Moodanalyser.MoodAnalyser;
import com.bridgelabz.MoodAnalyser.src.main.java.org.Moodanalyser.MoodAnalysisException;
import org.junit.Test;
import org.junit.Assert;

class moodanalysertest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyzeMood();
        }catch (MoodAnalysisException e){
            System.out.println(e);
        }
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = null;
        try{
            mood = moodAnalyser.analyzeMood();
            Assert.assertEquals("Happy",mood);
        }catch (MoodAnalysisException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenNullMood_ShouldReturnHappy(){
        String mood = null;
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try{
            mood = moodAnalyser.analyzeMood();
            Assert.assertEquals("Happy",mood);
        }catch (MoodAnalysisException e){
            System.out.println(e);
        }
    }

    @Test
    public void givenEmptyMood_ShouldReturnHappy(){
        String mood = null;
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try{
            mood = moodAnalyser.analyzeMood();
            Assert.assertEquals("Happy",mood);
        }catch (MoodAnalysisException e){
            System.out.println(e);
        }
    }
}
