package com.musicbrainz.search;

class SearchRecordingArtist {

    private String mbId;
    private String name;
    private String sortName;

    public SearchRecordingArtist() {
        this.mbId = null;
        this.name = null;
        this.sortName = null;
    }

    public SearchRecordingArtist(String mbId, String name, String sortName) {
        this.mbId = mbId;
        this.name = name;
        this.sortName = sortName;
    }

    public String getMbId() {
        return this.mbId;
    }

    public void setMbId(String mbId) {
        this.mbId = mbId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSortName() {
        return this.sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }
}
