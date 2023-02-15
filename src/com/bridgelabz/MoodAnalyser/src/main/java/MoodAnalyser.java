import java.util.Scanner;

public class MoodAnalyser {
    public String analyseMood(String message){
        String Mood;
        if(message.contains("SAD"))
             return Mood= "SAD";
        else return Mood="HAPPY";
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String message = scanner.nextLine();
        MoodAnalyser mood = new MoodAnalyser();
    }
}
