package com.example.goods;

public class DataBean {
    private Integer imageRes;
    private String imageUri;
    private String title;
    private String text;

    public DataBean(Integer imageRes, String title, String text) {
        this.imageRes = imageRes;
        this.title = title;
        this.text = text;
    }

    public DataBean(String imageUri, String title, String text) {
        this.imageUri = imageUri;
        this.title = title;
        this.text = text;
    }

    public Integer getImageRes() {
        return imageRes;
    }

    public void setImageRes(Integer imageRes) {
        this.imageRes = imageRes;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
