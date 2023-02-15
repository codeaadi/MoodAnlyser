package com.bridgelabz.MoodAnalyser.src.test.java;

import com.bridgelabz.MoodAnalyser.src.main.java.org.Moodanalyser.MoodAnalyser;
import com.bridgelabz.MoodAnalyser.src.main.java.org.Moodanalyser.MoodAnalysisException;
import org.junit.Test;
import org.junit.Assert;

//Ability to analyse and respond Happy or Sad Mood

class moodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenNullMood_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("Happy",mood);
    }
}
