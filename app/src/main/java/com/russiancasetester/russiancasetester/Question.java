package com.russiancasetester.russiancasetester;

/**
 * Created by Azmat on 23/06/2015.
 */
public class Question {
    private String word;
    private String definition;
    private String gender;
    private String theCase;
    private String answer;

    public Question(String word, String definition, String gender,
                    String theCase, String answer) {
        this.word = word;
        this.definition = definition;
        this.gender = gender;
        this.theCase = theCase;
        this.answer = answer;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTheCase() {
        return theCase;
    }

    public void setTheCase(String theCase) {
        this.theCase = theCase;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
