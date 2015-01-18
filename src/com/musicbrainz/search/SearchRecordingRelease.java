package com.musicbrainz.search;

public class SearchRecordingRelease {

    private String mbId;
    private String title;
    private String status;
    private String date;
    private String country;
    private String totalTracks;

    public SearchRecordingRelease() {
        this.mbId =  null;
        this.title = null;
        this.status = null;
        this.date = null;
        this.country = null;
        this.totalTracks = null;
    }

    public SearchRecordingRelease(String mbId, String title,
            String status, String date,
            String country, String totalTracks) {
        this.mbId =  mbId;
        this.title = title;
        this.status = status;
        this.date = date;
        this.country = country;
        this.totalTracks = totalTracks;
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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTotalTracks() {
        return totalTracks;
    }

    public void setTotalTracks(String totalTracks) {
        this.totalTracks = totalTracks;
    }
}
