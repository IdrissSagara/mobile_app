package com.example.my_first_app.model;

import java.util.List;

public class Question {
    private String mQuestion;
    private List<String> mChoiceList;
    private int mAnswerIndex;


    public Question(String question, List<String> choiceList, int answerIndex) {
        this.setQuestion(question);
        this.setChoiceList(choiceList);
        this.setAnswerIndex(answerIndex);
    }

    public String getQuestion() {
        return mQuestion;
    }

    public List<String> getChoiceList() {
        return mChoiceList;
    }

    public int getAnswerIndex() {
        return mAnswerIndex;
    }

    public void setQuestion(String question) {
        mQuestion = question;
    }

    public void setChoiceList(List<String> choiceList) {
        if (choiceList == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        mChoiceList = choiceList;
    }

    public void setAnswerIndex(int answerIndex) {
        if (answerIndex < 0 || answerIndex >= mChoiceList.size()) {
            throw new IllegalArgumentException("Answer index is out of bound");
        }
        mAnswerIndex = answerIndex;
    }

    @Override
    public String toString() {
        return "Question{" +
                "mQuestion='" + mQuestion + '\'' +
                ", mChoiceList=" + mChoiceList +
                ", mAnswerIndex=" + mAnswerIndex +
                '}';
    }
}
