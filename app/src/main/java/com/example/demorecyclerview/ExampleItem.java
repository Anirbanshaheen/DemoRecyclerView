package com.example.demorecyclerview;

public class ExampleItem {

    private int imageResource;
    private String textOne;
    private String textTwo;

    public ExampleItem(int imageResource, String textOne, String textTwo) {
        this.imageResource = imageResource;
        this.textOne = textOne;
        this.textTwo = textTwo;
    }

    public void changeText(String text){
        textOne = text;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTextOne() {
        return textOne;
    }

    public String getTextTwo() {
        return textTwo;
    }
}
