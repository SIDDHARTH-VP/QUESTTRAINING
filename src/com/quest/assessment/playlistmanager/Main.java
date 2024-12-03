package com.quest.assessment.playlistmanager;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user= new User("Sid");
        PlaylistManagerInterface playlistManager = new PlaylistManagerImpl(user);


        user.addPlaylist("Rock");
        user.addPlaylist("Paper");

        System.out.println("Users Playlist"+user.getPlaylists().keySet());

        Scanner scanner = new Scanner(System.in);

        playlistManager.createPlaylist("Fav Songs");
        playlistManager.createPlaylist("Top Songs");

        Playlist favSongs = playlistManager.getPlaylist("Fav Songs");
        Playlist topSongs = playlistManager.getPlaylist("Top Songs");

        Track track1 = new Track("1", "Track 1", "Artist 1", 3.5);
        Track track2 = new Track("2", "Track 2", "Artist 2", 4.0);
        Track track3 = new Track("3", "Track 3", "Artist 1", 3.0);
        Track track4 = new Track("4", "Track 4", "Artist 3", 2.5);

        try {
            playlistManager.addTrackToPlaylist(favSongs, track1);
            playlistManager.addTrackToPlaylist(favSongs, track2);
            playlistManager.addTrackToPlaylist(topSongs, track3);
            playlistManager.addTrackToPlaylist(topSongs, track4);
        } catch (DuplicateTrackException e) {
            System.out.println(e.getMessage());
        }

        boolean ruuning = true;

        while (ruuning) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add Track to Playlist");
            System.out.println("2. Remove Track from Playlist");
            System.out.println("3. Display Tracks in Playlist");
            System.out.println("4. Search Track");
            System.out.println("5. Sort Tracks by Duration");
            System.out.println("6. Sort Tracks by Title");
            System.out.println("7. Exit");


//            Create users and their playlists.
//                    Add, remove, and display tracks in playlists.
//            Test the equals method by comparing two Track objects.
//                    Test exception handling for duplicate tracks and invalid operations.
//                    Sort tracks by duration or title.
//                    Shuffle tracks in a playlist and display the shuffled order.
//                    Merge two playlists into a new playlist. (have to do)
//                    Rate tracks and display them sorted by rating.
//                    Mark/unmark favorite tracks and display all favorites.

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Paylist Name");
                    String playlistName = scanner.nextLine();
                    Playlist playlistToAdd = playlistManager.getPlaylist(playlistName);
                    if (playlistToAdd == null) {
                        System.out.println("Playlist does not exist");
                        break;
                    }
                    System.out.println("Enter Track Details:");
                    System.out.print("Track ID: ");
                    String trackId = scanner.nextLine();
                    System.out.print("Track Name: ");
                    String trackName = scanner.nextLine();
                    System.out.print("Artist Name: ");
                    String artist = scanner.nextLine();
                    System.out.print("Duration: ");
                    double duration = scanner.nextDouble();
                    scanner.nextLine();
                    Track newTrack = new Track(trackId, trackName, artist, duration);
                    try {
                        playlistManager.addTrackToPlaylist(playlistToAdd, newTrack);
                        System.out.println("Added track to playlist");
                    } catch (DuplicateTrackException e) {
                        System.out.println("Error" + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Enter playlist name: ");
                    String playlistToRemoveFrom = scanner.nextLine();
                    Playlist playlistToRemove = playlistManager.getPlaylist(playlistToRemoveFrom);
                    if (playlistToRemove == null) {
                        System.out.println("Playlist does not exist");
                    } else {
                        System.out.println("Enter Track ID to remove: ");
                        String trackToRemove = scanner.nextLine();
                        try {
                            playlistManager.removeTrackFromPlaylist(playlistToRemove, trackToRemove);
                            System.out.println("Removed track from playlist");
                        } catch (NoSuchElementException e) {
                            System.out.println("Error" + e.getMessage());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter playlist name to display tracks ");
                    String playlistToDisplay = scanner.nextLine();
                    Playlist playlistDisplay = playlistManager.getPlaylist(playlistToDisplay);
                    if (playlistDisplay != null) {
                        playlistManager.displayTracks(playlistDisplay);
                    } else {
                        System.out.println("Playlist does not exist");
                    }
                    break;
                case 4:
                    System.out.println("Enter playlist name to search tracks ");
                    String playlistToSearch = scanner.nextLine();
                    Playlist playlistSearch = playlistManager.getPlaylist(playlistToSearch);

                    if (playlistSearch != null) {
                        System.out.println("Enter Track Nmae or artist to search: ");
                        String searchterm = scanner.nextLine();
                        List<Track> searchRes = playlistManager.searchTrack(playlistSearch, searchterm);
                        if (searchRes == null) {
                            System.out.println("No tracks found");
                        } else {
                            System.out.println("Search Results:");
                            for (Track track : searchRes) {
                                System.out.println(track);
                            }
                        }
                    } else {
                        System.out.println("Playlist not found");
                    }
                    break;
                case 5:
                    System.out.println("Enter playlist name to sort by duration tracks ");
                    String playlistToSort = scanner.nextLine();
                    Playlist playlistSort = playlistManager.getPlaylist(playlistToSort);
                    if (playlistSort != null) {
                        playlistManager.sortByDuration(playlistSort);
                        playlistManager.displayTracks(playlistSort);
                    } else {
                        System.out.println("Playlist not found");
                    }
                    break;
                case 6:
                    System.out.println("Enter playlist name to sort by title tracks ");
                    String playlistToSortByTitle = scanner.nextLine();
                    Playlist playlistSortTitle = playlistManager.getPlaylist(playlistToSortByTitle);
                    if (playlistSortTitle != null) {
                        playlistManager.sortByTitle(playlistSortTitle);
                        playlistManager.displayTracks(playlistSortTitle);
                    } else {
                        System.out.println("Playlist not found");
                    }
                    break;

                case 7:
                    System.out.println("exiting");
                    ruuning = false;
                    break;

                default:
                    System.out.println("Invalid choice");


            }

        }
    }
}
