package com.example.realwordwizard;

public class Word {

    private String word;
    private String type;
    private String definition;
    private String sentence;

    public Word(String word, String type, String definition, String sentence) {

        this.sentence = sentence;
        this.word = word;
        this.definition = definition;
        this.type = type;
    }

    public void setDefinition(String def) {
        this.definition = def;
    }

    public void setType(String t) {
        this.type = t;
    }

    public void setWord(String w){
        this.word = w;
    }

    public void setSentence(String s){
        this.sentence = s;
    }

    public String getWord() {

        return word;
    }

    public String getDefinition() {

        return definition;
    }

    public String getType() {

        return type;
    }

    public String getSentence() {

        return sentence;
    }

}

