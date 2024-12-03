package com.quest.assessment.playlistmanager;

import java.util.HashMap;
import java.util.Map;

public class User {
    private String username;
    private Map<String,Playlist> playlists;

    public User(String username) {
        this.username = username;
        this.playlists = new HashMap<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<String, Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(Map<String, Playlist> playlists) {
        this.playlists = playlists;
    }

    public void addPlaylist(String playlistName) {
        if (playlists.containsKey(playlistName)) {
            System.out.println("Playlist with name '" + playlistName + "' already exists.");
            return;
        }
        playlists.put(playlistName, new Playlist(playlistName, null));
        System.out.println("Playlist '" + playlistName + "' created successfully.");
    }

    public void removePlaylist(String playlistName) {
        if (playlists.containsKey(playlistName)) {
            playlists.remove(playlistName);
            System.out.println("Playlist '" + playlistName + "' removed successfully.");
        } else {
            System.out.println("Playlist '" + playlistName + "' does not exist.");
        }
    }

    public Playlist getPlaylistByName(String playlistName) {
        return playlists.get(playlistName);
    }



    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", playlists=" + playlists +
                '}';
    }
}
