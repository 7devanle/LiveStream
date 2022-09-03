package com.example.LiveStream.model;

import java.time.LocalDate;
import java.util.Objects;

public class MutableLiveStream {
    private String id;
    private String titre;
    private String description;
    private String url;
    private LocalDate startDate;
    private LocalDate endDate;

    public MutableLiveStream(String id, String titre, String description, String url, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.url = url;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableLiveStream that = (MutableLiveStream) o;
        return Objects.equals(id, that.id) && Objects.equals(titre, that.titre) && Objects.equals(description, that.description) && Objects.equals(url, that.url) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titre, description, url, startDate, endDate);
    }

    @Override
    public String toString() {
        return "MutableLiveStream{" +
                "id='" + id + '\'' +
                ", titre='" + titre + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
