package com.kripton.recycleview;

public class NewsModelClass {
    String ImageURL,NewsTitle,NewsDesp,NewsTime;

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String imageURL) {
        ImageURL = imageURL;
    }

    public String getNewsTitle() {
        return NewsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        NewsTitle = newsTitle;
    }

    public String getNewsDesp() {
        return NewsDesp;
    }

    public void setNewsDesp(String newsDesp) {
        NewsDesp = newsDesp;
    }

    public String getNewsTime() {
        return NewsTime;
    }

    public void setNewsTime(String newsTime) {
        NewsTime = newsTime;
    }

    public NewsModelClass(String imageURL, String newsTitle, String newsDesp, String newsTime) {
        ImageURL = imageURL;
        NewsTitle = newsTitle;
        NewsDesp = newsDesp;
        NewsTime = newsTime;
    }
}
