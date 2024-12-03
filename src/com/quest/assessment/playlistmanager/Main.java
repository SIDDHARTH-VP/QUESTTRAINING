package com.quest.assessment.playlistmanager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PlaylistManagerInterface playlistManager = new PlaylistManagerImpl();

        Scanner scanner = new Scanner(System.in);

        playlistManager.createPlaylist("Fav Songs");
        playlistManager.createPlaylist("Top Songs");

        Playlist favSongs= playlistManager.getPlaylist("Fav Songs");
        Playlist topSongs = playlistManager.getPlaylist("Top Songs");

        Track track1 = new Track("1", "Track 1", "Artist 1", 3.5);
        Track track2 = new Track("2", "Track 2", "Artist 2", 4.0);
        Track track3 = new Track("3", "Track 3", "Artist 1", 3.0);
        Track track4 = new Track("4", "Track 4", "Artist 3", 2.5);

        try{
            playlistManager.addTrackToPlaylist(favSongs,track1);
            playlistManager.addTrackToPlaylist(favSongs,track2);
            playlistManager.addTrackToPlaylist(topSongs,track3);
            playlistManager.addTrackToPlaylist(topSongs,track4);
        }catch (DuplicateTrackException e) {
            System.out.println(e.getMessage());
        }

        boolean ruuning = true;

        while (ruuning) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add Track to Playlist");
            System.out.println("2. Remove Track from Playlist");
            System.out.println("3. Display Tracks in Playlist");
//            System.out.println("4. Search Track");
//            System.out.println("5. Sort Tracks by Duration");
//            System.out.println("6. Sort Tracks by Title");
//            System.out.println("7. Shuffle Tracks in Playlist");
//            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Paylist Name");
                    String playlistName = scanner.nextLine();
                    Playlist playlistToAdd = playlistManager.getPlaylist(playlistName);
                    if(playlistToAdd == null){
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
                    try{
                        playlistManager.addTrackToPlaylist(playlistToAdd,newTrack);
                        System.out.println("Added track to playlist");
                    }catch (DuplicateTrackException e) {
                        System.out.println("Error"+e.getMessage());
                    }
                    break;
                    case 2:
                        System.out.println("Enter playlist name: ");
                        String playlistToRemoveFrom = scanner.nextLine();
                        Playlist playlistToRemove = playlistManager.getPlaylist(playlistToRemoveFrom);
                        if(playlistToRemove == null){
                            System.out.println("Playlist does not exist");
                        }else{
                            System.out.println("Enter Track ID to remove: ");
                            String trackToRemove = scanner.nextLine();
                            try{
                                playlistManager.removeTrackFromPlaylist(playlistToRemove,trackToRemove);
                                System.out.println("Removed track from playlist");
                            }catch (NoSuchElementException e){
                                System.out.println("Error"+e.getMessage());
                            }
                        }
                        break;
                        case 3:
                            System.out.println("Enter playlist name to display tracks ");
                            String playlistToDisplay = scanner.nextLine();
                            Playlist playlistDisplay = playlistManager.getPlaylist(playlistToDisplay);
                            if(playlistDisplay != null){
                                playlistManager.displayTracks(playlistDisplay);
                            }else{
                                System.out.println("Playlist does not exist");
                            }
                            break;
            }

        }



    }
}
