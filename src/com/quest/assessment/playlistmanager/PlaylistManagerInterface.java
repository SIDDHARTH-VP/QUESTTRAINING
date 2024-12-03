package com.quest.assessment.playlistmanager;

import java.util.List;

public interface PlaylistManagerInterface {

    void addTrackToPlaylist(Playlist playlist, Track track) throws DuplicateTrackException;
    void removeTrackFromPlaylist(Playlist playlist,String trackId) throws NoSuchElementException;
    List<Track> searchTrack(Playlist playlist,String search);
    void sortByDuration(Playlist playlist);
    void sortByTitle(Playlist playlist);
    void shuffle(Playlist playlist);
    void displayTracks(Playlist playlist);

    //user meth
    void createPlaylist(String playlistName);
    void deletePlaylist(String playlistName);
    Playlist getPlaylist(String playlistName);
    void mergePlaylists(String playlist1, String  playlist2,String newPlaylistName);
}
