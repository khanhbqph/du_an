package com.example.myapplication;

public class News {
    String heading;
    int titleImage;

    public News(String heading, int titleImage) {
        this.heading = heading;
        this.titleImage = titleImage;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public int getTitleImage() {
        return titleImage;
    }

    public void setTitleImage(int titleImage) {
        this.titleImage = titleImage;
    }
}
