package com.example.mymovieseatbooking;

public class Item {

    String name;
    String deatail;
    String location;
    int seat;
    int image;

    public Item(String name, String deatail, String location, int seat, int image) {
        this.name = name;
        this.deatail = deatail;
        this.location = location;
        this.seat = seat;
        this.image = image;
    }

    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeatail() {
        return deatail;
    }

    public void setDeatail(String deatail) {
        this.deatail = deatail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}


