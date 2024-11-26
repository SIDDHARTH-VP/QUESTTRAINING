package com.quest.garbage;

public class SpecialEditionBook extends Book {
    private String specialFeature;

    public SpecialEditionBook(String title, String author, double price, int stock,String specialFeature) {
        super(title, author, price, stock);
        this.specialFeature = specialFeature;
    }
    @Override
    public void display() {
        super.display();
        System.out.println(specialFeature);
    }
}
