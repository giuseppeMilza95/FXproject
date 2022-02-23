package com.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String title;
    private String artist;
    ArrayList<Song> songs;


    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }


    public boolean addSong(String name, Double duration){
        if (findSong(name) == null){
            songs.add(new Song(name, duration));
            return true;
        }

        return false;


    }


    private Song findSong(String title){
        for (Song checkedSong : this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }

        }

        return null;
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber -1;
        if ((index >=0) && (index <= songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }


    public boolean addToPlayList(String title, LinkedList <Song> playlist){
        if(findSong(title) != null){
            playlist.add(findSong(title));
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;

    }

}
