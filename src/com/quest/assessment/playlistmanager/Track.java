package com.quest.assessment.playlistmanager;

import java.util.Objects;

public class Track {
    private String track_id;
    private String track_name;
    private String artist;
    private double duration;

    public Track(String track_id, String track_name, String artist, double duration) {
        this.track_id = track_id;
        this.track_name = track_name;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTrack_id() {
        return track_id;
    }

    public String getTrack_name() {
        return track_name;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Track{" +
                "track_id='" + track_id + '\'' +
                ", track_name='" + track_name + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return  Objects.equals(track_id, track.track_id) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(track_id);
    }
}
