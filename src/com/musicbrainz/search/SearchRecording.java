package com.musicbrainz.search;

public class SearchRecording {

    private String mbId;
    private String title;
    private int length;
    private String videoLink;

    public SearchRecording() {
        this.mbId =  null;
        this.title = null;
        this.length = 0;
        this.videoLink = null;
    }

    public SearchRecording(String mbId, String title, int length, String videoLink) {
        this.mbId =  mbId;
        this.title = title;
        this.length = length;
        this.videoLink = videoLink;
    }

    public String getMbId() {
        return this.mbId;
    }

    public void setMbId(String mbId) {
        this.mbId = mbId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getVideoLink() {
        return this.videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }
}
