package com.quest.assessment.playlistmanager;

import java.util.Comparator;

public class TrackTitleComparator implements Comparator<Track> {
    @Override
    public int compare(Track o1, Track o2) {
        return o1.getTrack_name().compareTo(o2.getTrack_name());
    }
}
