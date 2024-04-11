package com.example.realwordwizard;

public class Question2Library {
    private String questions [] = {
            "the word 'soundly' is a...",
            "the word 'hippo' is a...",
            "the word 'softly' is a...",
            "the word 'jump' is a...",
            "the word 'swim' is a...",
            "the word 'fly' is a...",
            "the word 'happily' is a...",
            "the word 'sadly' is a...",
            "the word 'angrily' is a..."

    };

    private String choices [][] = {
            {"adverb","noun","adjective"},
            {"adverb","noun","adjective"},
            {"adverb","noun","adjective"},
            {"verb","noun","adjective"},
            {"verb","noun","adjective"},
            {"verb","noun","adjective"},
            {"adverb","noun","adjective"},
            {"adverb","noun","adjective"},
            {"adverb","noun","adjective"}

    };

    private String correctAnswers[] = {
            "adverb",
            "noun",
            "adverb",
            "verb",
            "verb",
            "verb",
            "adverb",
            "adverb",
            "adverb"
    };

    public String getQuestion(int a) {
        String question = questions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = choices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = choices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = choices[a][2];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = correctAnswers[a];
        return answer;
    }

}
