package com.example.aparna.cards;

public class Item {

    int background ;
    String itemTitle;
    int profilePhoto;
    int num;

    public Item() {
    }

    public Item(int background, String itemTitle, int profilePhoto, int num) {
        this.background = background;
        this.itemTitle = itemTitle;
        this.profilePhoto = profilePhoto;
        this.num = num;
    }

    public int getBackground() {
        return background;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public int getProfilePhoto() {
        return profilePhoto;
    }

    public int getNum() {
        return num;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setItemTitle(String profileName) {
        this.itemTitle = profileName;
    }

    public void setProfilePhoto(int profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
