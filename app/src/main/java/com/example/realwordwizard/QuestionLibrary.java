package com.example.realwordwizard;

public class QuestionLibrary {

    private String questions [] = {
            "the word 'dog' is a...",
            "the word 'cat' is a...",
            "the word 'bird' is a...",
            "the word 'run' is a...",
            "the word 'talk' is a...",
            "the word 'sleep' is a...",
            "the word 'quickly' is a...",
            "the word 'gently' is a...",
            "the word 'slowly' is a...",
    };

    private String choices [][] = {
            {"noun","verb","adjective"},
            {"noun","verb","adjective"},
            {"noun","verb","adjective"},
            {"verb","noun","adverb"},
            {"adverb","noun","verb"},
            {"adjective","noun","verb"},
            {"adverb","noun","adjective"},
            {"adverb","noun","adjective"},
            {"adverb","noun","adjective"}

    };

    private String correctAnswers[] = {
            "noun",
            "noun",
            "noun",
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

