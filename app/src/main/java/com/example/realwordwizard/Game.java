package com.example.realwordwizard;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    private Player player;
    private Word[] wordList;
    private int maxTries;
    private int tries;
    private boolean winner;

    public Game(Player player) {

        this.player =  player;
        this.maxTries = 3;

    }

    public Game(){
        initializeList();
    }

    private void initializeList(){

        wordList = new Word[20];

        wordList[0] = new Word("barks", "verb", "def", "the dog barks loudly.");
        wordList[1] = new Word("cat", "noun", "def", "the cat is black.");
        wordList[2] = new Word("big", "adjective", "def", "the dog is big.");
        wordList[3] = new Word("quickly", "adverb", "def", "the dog runs quickly.");
        wordList[4] = new Word("purrs", "verb", "def", "the cat purrs softly.");
        wordList[5] = new Word("dog", "noun", "def", "the dog is brown.");
        wordList[6] = new Word("small", "adjective", "def", "the cat is small.");
        wordList[7] = new Word("soundly", "adverb", "def", "the cat sleeps soundly.");
        wordList[8] = new Word("sings", "verb", "def", "the bird sings sweetly.");
        wordList[9] = new Word("bird", "noun", "def", "the bird is blue.");
        wordList[10] = new Word("colorful", "adjective", "def", "the bird is colorful.");
        wordList[11] = new Word("gracefully", "adverb", "def", "the bird flies gracefully.");
        wordList[12] = new Word("cries", "verb", "def", "the baby cries loudly.");
        wordList[13] = new Word("baby", "noun", "def", "the baby is crying.");
        wordList[14] = new Word("cute", "adjective", "def", "the baby is cute.");
        wordList[15] = new Word("hungrily", "adverb", "def", "the baby eats hungrily.");
        wordList[16] = new Word("laughs", "verb", "def", "the child laughs happily.");
        wordList[17] = new Word("child", "noun", "def", "the child is laughing.");
        wordList[18] = new Word("happy", "adjective", "def", "the child is happy.");
        wordList[19] = new Word("joyfully", "adverb", "def", "the child plays joyfully.");
    }

    public Player getPlayer() {
        return player;
    }

    public void start() {

        while (!winner) {
            int randomQuestion = (int) (Math.random() * 2);
            switch (randomQuestion) {
                case 1: QuestionType();
                case 2: QuestionDef();
            }
        }

    }

    public void QuestionDef() {
        boolean correct = false;
        int random = (int) (Math.random() * 20);
        Word word = wordList[random];
        ArrayList<String> choices = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            int randomChoice = (int) (Math.random() * 20);
            choices.add(wordList[randomChoice].getType());

        }
        while (!correct) {

            System.out.println(word.getSentence());
            System.out.println("What is the definition of " + word.getWord() + "?");
            System.out.println("A. " + choices.get(0));
            System.out.println("B. " + choices.get(1));
            System.out.println("C. " + choices.get(2));
            System.out.println("D. " + choices.get(3));
            String answer = getUserInput();
            if (answer.equals(word.getDefinition())) {
                System.out.println("Correct!");
                player.addXP(1 + player.getPet().getMultiplier());
                System.out.println("You have " + player.getXP() + " xp.");
                correct = true;
            } else {
                System.out.println("Incorrect!");
                tries++;
                System.out.println("You have " + (maxTries - tries) + " tries left.");
            }
        }
    }



    public void QuestionType() {
        boolean correct = false;
        int random = (int) (Math.random() * 20);
        Word word = wordList[random];
        System.out.println(word.getSentence());
        System.out.println("What type of word is " + word.getWord() + "?");
        System.out.println("A. verb");
        System.out.println("B. noun");
        System.out.println("C. adjective");
        System.out.println("D. adverb");
        while (!correct) {
            String answer = getUserInput();
            if (answer.equals(word.getType())) {
                System.out.println("Correct!");
                player.addXP(1 + player.getPet().getMultiplier());
                System.out.println("You have " + player.getXP() + " xp.");
                correct = true;
            } else {
                System.out.println("Incorrect!");
                tries++;
                System.out.println("You have " + (maxTries - tries) + " tries left.");
            }
        }
        if (getUserInput().equals(word.getType())) {
            System.out.println("Correct!");
            player.addXP(1 + player.getPet().getMultiplier());
            System.out.println("You have " + player.getXP() + " xp.");
        } else {
            System.out.println("Incorrect!");
            tries++;
            System.out.println("You have " + (maxTries - tries) + " tries left.");
        }
    }

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void checkAnswer(String answer) {
        int random = (int) (Math.random() * 20);
        Word word = wordList[random];
        if (answer.equals(word.getType())) {
            System.out.println("Correct!");
            player.addXP(1 + player.getPet().getMultiplier());
            System.out.println("You have " + player.getXP() + " xp.");
        } else {
            System.out.println("Incorrect!");
            tries++;
            System.out.println("You have " + (maxTries - tries) + " tries left.");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();

    }

}

