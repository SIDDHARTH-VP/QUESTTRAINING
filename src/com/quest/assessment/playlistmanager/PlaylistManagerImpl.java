package com.quest.assessment.playlistmanager;

import java.util.*;

public class PlaylistManagerImpl implements PlaylistManagerInterface{

//    private Map<String,Playlist> playlists;
//    public PlaylistManagerImpl(){
//        playlists = new HashMap<>();
//    }

    private User user;
    public PlaylistManagerImpl(User user) {
        this.user = user;
    }

    @Override
    public void addTrackToPlaylist(Playlist playlist, Track track) throws DuplicateTrackException {
        if(playlist.getTracks().contains(track)){
            throw new DuplicateTrackException("Track already exists in playlist");
        }
        playlist.getTracks().add(track);
        System.out.println("Track added to playlist");
    }

    @Override
    public void removeTrackFromPlaylist(Playlist playlist,String trackId) throws NoSuchElementException{
        Track trackToRemove = null;
        for (Track track : playlist.getTracks()) {
            if (track.getTrack_id().equals(trackId)) {
                trackToRemove = track;
                break;
            }
        }

        if (trackToRemove != null) {
            playlist.getTracks().remove(trackToRemove);
        } else {
            throw new NoSuchElementException("Track does not exist in playlist");
        }
    }

    @Override
    public List<Track> searchTrack(Playlist playlist, String search) {
        String lowerCaseSearch = search.toLowerCase();
        List<Track> results = new ArrayList<>();
        for(Track track : playlist.getTracks()){
            if(track.getTrack_name().toLowerCase().contains(lowerCaseSearch) ||
            track.getArtist().toLowerCase().contains(lowerCaseSearch)){
                results.add(track);
            }
        }
        return results;
    }

    public Playlist getPlaylist(String playlistName){
        return user.getPlaylistByName(playlistName);
    }

    @Override
    public void sortByDuration(Playlist playlist) {
        playlist.getTracks().sort(new TrackDurationComparator());
    }

    @Override
    public void sortByTitle(Playlist playlist) {
        playlist.getTracks().sort(new TrackTitleComparator() );
    }

    @Override
    public void shuffle(Playlist playlist) {
        Collections.shuffle(playlist.getTracks());
    }

    @Override
    public void displayTracks(Playlist playlist) {
        for (Track track : playlist.getTracks()) {
            System.out.println(track);
        }
    }


    //users meth
    @Override
    public void createPlaylist(String playlistName) {
        user.addPlaylist(playlistName);
    }

    @Override
    public void deletePlaylist(String playlistName) {
        user.removePlaylist(playlistName);
    }


    @Override
    public void mergePlaylists(String playlist1, String playlist2, String newPlaylistName) {

    }
}
