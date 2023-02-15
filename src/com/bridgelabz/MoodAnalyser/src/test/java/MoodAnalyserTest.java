package com.bridgelabz.MoodAnalyser.src.test.java;

import com.bridgelabz.MoodAnalyser.src.main.java.org.Moodanalyser.MoodAnalyser;
import com.bridgelabz.MoodAnalyser.src.main.java.org.Moodanalyser.MoodAnalysisException;
import org.junit.Test;
import org.junit.Assert;


public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyzeMood();
        Assert.assertEquals("Sad",mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyzeMood();
        } catch (MoodAnalysisException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals("Happy",mood);
    }
}
