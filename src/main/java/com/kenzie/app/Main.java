package com.kenzie.app;

// import necessary libraries


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static final String URL = "https://jservice.kenzie.academy/api/clues";

    public static void main(String[] args) throws IOException, NullPointerException, JsonProcessingException {
        //Write main execution code here
        File file = new File("Clues");
        ObjectMapper objMapper = new ObjectMapper();
        DTO dto = new DTO();
        dto = objMapper.readValue(file, DTO.class);

        int score = 0;
        int questionNumber = 1;
        int wrongAnswers = 0;
        int correctAnswers = 0;

        System.out.println("Welcome to the Kenzie Capstone Quiz!");
        System.out.println("There will be 10 questions total.");
        System.out.println("Enter your name: ");
        Scanner scannerName = new Scanner(System.in);
        String name = scannerName.nextLine();
        System.out.println("Hello " + name + "!");

        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < 10; j++) {

                int random = new Random().nextInt(100);

                System.out.println("Question " + questionNumber +"/10"+": " + dto.clues.get(random).question);
                System.out.println("Answer: " + dto.clues.get(random).answer);
                System.out.println("Enter your answer: ");
                Scanner scanner = new Scanner(System.in);

                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase(dto.clues.get(random).answer)) {

                    System.out.print("Correct! ");
                    score++;
                    questionNumber++;
                    correctAnswers++;
                    if(score == 1 && correctAnswers == 1) {
                        System.out.println("You have " + score + " point and " + correctAnswers + " correct answer!");
                    } else {
                        System.out.println("You have " + score + " points and " + correctAnswers + " correct answers!");
                    }
                    if(score == 1) {
                        System.out.println("You have " + score + " point.");
                    }else {
                        System.out.println("You have " + score + " points.");
                    }

                } else {
                    System.out.println("Incorrect! The correct answer is: " + dto.clues.get(random).answer);
                    questionNumber++;
                    wrongAnswers ++;

                    if(wrongAnswers == 1 && score == 0 ){
                            System.out.println("You have " + wrongAnswers + " wrong answer!");
                            System.out.println("You have " + score + " points.");

                        } else {

                        if (wrongAnswers == 1 && score == 1) {
                            System.out.println("You have " + wrongAnswers + " wrong answer!");
                            System.out.println("You have " + score + " point.");

                        } else {
                            if(wrongAnswers == 2 && score == 1) {
                                System.out.println("You have " + wrongAnswers + " wrong answers!");
                                System.out.println("You have " + score + " point.");
                            }
                            System.out.println("You have " + wrongAnswers + " wrong answers!");
                            System.out.println("You have " + score + " points.");
                        }
                    }
                }

                    if (j == 9) {
                        if(score == 1) {
                            System.out.println("****************************************");
                            System.out.println("Game over! You have " + score + " point.");
                        } else {
                            System.out.println("****************************************");
                            System.out.println("Game over! You have " + score + " points.");
                        }
                    System.out.println("You have answered " + (j + 1) + " questions.");
                        if(correctAnswers == 1) {
                            System.out.println("You have answered " + correctAnswers + " question correctly.");
                        } else {
                            System.out.println("You have " + correctAnswers + " correct answers.");
                        }
                    if(wrongAnswers == 1) {
                            System.out.println("You have answered " + wrongAnswers + " question incorrectly.");
                        } else {
                            System.out.println("You have " + wrongAnswers + " incorrect answers.");
                        }

                    System.out.println("Thank you for playing " + name + "!");
                    System.out.println("Would you like to play again? (y/n)");
                    Scanner scanner2 = new Scanner(System.in);
                    String answer2 = scanner2.nextLine();
                    if (answer2.equalsIgnoreCase("y")) {
                        score = 0;
                        questionNumber = 1;
                        wrongAnswers = 0;
                        correctAnswers = 0;
                        j = -1;
                    } else {
                        System.out.println("Thank you for playing " + name + "!");
                        System.out.println("Goodbye!");
                        System.out.println("****************************************");
                        System.exit(0);
                    }

                }
                }
            }
        }
    }

















