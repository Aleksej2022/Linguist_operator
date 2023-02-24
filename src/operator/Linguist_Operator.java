package operator;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Linguist_Operator {
    /*
    * Program Name:- Linguist Operator.java
    * Program Description:- This program's objective is to teach the user's Arabic language
    * Date created:- 2023.01.25
    * */


    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Welcome to the Linguist Operator, where you will learn Arabic language");
        System.out.printf("%20s %n","*********** Hi, I am your Linguist ***********");
        System.out.printf("%30s %n","A.Arabic");
        System.out.printf("%31s %n","B.Spanish");
        System.out.print("What language would you like to learn? ");
        String user_response = scanner.nextLine();

        if (user_response.equals("A")){
            System.out.println("Welcome to Arabic Linguist Operator, what would you like to learn first?\n1.Greeting Phrases\n2.Small Talk Phrases\n3.Farewell Phrases");
           int choose = scanner.nextInt();
            switch (choose){
                case (1):
                    System.out.printf("%20s %n", "*********** Written Phrases in Arabic ***********");
                    System.out.println("English Greeting Phrase: -> Hello, how are you doing?");
                    System.out.println("Arabic Greeting Phrase: -> marhaban kayf halika?");
                    System.out.printf("%20s %n", "*********** Pronunciation in Arabic ***********");
                    File file = new File("ArabGreet.wav");
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    System.out.print("Enter P to play the audio");
                    String response = scanner1.nextLine();
                    response = response.toUpperCase();

                    if (response.equals("P")){
                        clip.start();
                        System.out.print("Enter R to replay");

                        response = scanner1.nextLine();
                        response = response.toUpperCase();

                        if (response.equals("R")){
                            clip.setMicrosecondPosition(0);
                            clip.start();

                            System.out.println("Enter E to exit");

                            response = scanner1.nextLine();
                            response = response.toUpperCase();

                            System.out.println("Thank you");
                        }
                    }
                    break;

                case (2):
                    System.out.printf("%20s %n", "*********** Written Phrases in Arabic ***********");
                    System.out.println("English Small Talk Phrase: -> Beautiful day, isn't it?");
                    System.out.println("Arabic Small Talk Phrase: -> Yawn jamil, alaysa kadhalika?");
                    System.out.printf("%20s %n", "*********** Pronunciation in Arabic ***********");
                    File file2 = new File("Arabtalk.wav");
                    AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
                    Clip clip2 = AudioSystem.getClip();
                    clip2.open(audioStream2);
                    System.out.print("Enter P to play the audio");
                    String response2 = scanner1.nextLine();
                    response2 = response2.toUpperCase();

                    if (response2.equals("P")){
                        clip2.start();
                        System.out.print("Enter R to replay");

                        response2 = scanner1.nextLine();
                        response2 = response2.toUpperCase();

                        if (response2.equals("R")){
                            clip2.setMicrosecondPosition(0);
                            clip2.start();

                            System.out.println("Enter E to exit");

                            response2 = scanner1.nextLine();
                            response2 = response2.toUpperCase();

                            System.out.println("Thank you");
                        }
                    }
                    break;

                case (3):
                    System.out.printf("%20s %n", "*********** Written Phrases in Arabic ***********");
                    System.out.println("English Farewell Phrase: -> See you later!");
                    System.out.println("Arabic Farewell Phrase: -> arak lahqan!");
                    System.out.printf("%20s %n", "*********** Pronunciation in Arabic ***********");
                    File file3 = new File("Farewell.wav");
                    AudioInputStream audioStream3 = AudioSystem.getAudioInputStream(file3);
                    Clip clip3 = AudioSystem.getClip();
                    clip3.open(audioStream3);
                    System.out.print("Enter P to play the audio");
                    String response3 = scanner1.nextLine();
                    response = response3.toUpperCase();

                    if (response3.equals("P")){
                        clip3.start();
                        System.out.print("Enter R to replay");

                        response3 = scanner1.nextLine();
                        response3 = response3.toUpperCase();

                        if (response3.equals("R")){
                            clip3.setMicrosecondPosition(0);
                            clip3.start();

                            System.out.println("Enter E to exit");

                            response3 = scanner1.nextLine();
                            response3 = response3.toUpperCase();

                            System.out.println("Thank you");
                        }
                    }
                    break;
            }


        }
        Scanner user_feedback = new Scanner(System.in);
        System.out.printf("%60s %n", "Did you enjoy learning Arabic language?");
        String user_opinion = user_feedback.nextLine();
        user_opinion = user_opinion.toUpperCase();

        if (user_opinion.equals("YES")){
            System.out.printf("%50s %n", "We are glad to hear that!");
        }
        else{
            System.out.printf("%50s %n", "We are sorry to hear that!");
        }
    }
}
