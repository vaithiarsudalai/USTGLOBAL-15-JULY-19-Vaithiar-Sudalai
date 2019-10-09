package com.ustglobal.mysongapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.bean.Song;

public class SongDaoImplementation implements SongDao {
	Scanner sc = new Scanner(System.in);
	Song song = new Song();

	public Song insertSong() {
		System.out.println("Enter Song Id : ");
		song.setSongId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Song Nmae : ");
		song.setSongName(sc.nextLine());
		System.out.println("Enter Album name : ");
		song.setAlbumName(sc.nextLine());
		System.out.println("Enter Artist Name : ");
		song.setArtistName(sc.nextLine());
		System.out.println("Enter Song Location : ");
		song.setSongLocation(sc.nextLine());
		System.out.println("Enter Description");
		song.setDescription(sc.nextLine());
		return song;
	}

	public Song updateSong() {
		System.out.println("Enter Song Id : ");
		song.setSongId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter New Song Nmae : ");
		song.setSongName(sc.nextLine());
		return song;
	}

	public int songId() {
		System.out.println("Enter Song Id : ");
		int songId = Integer.parseInt(sc.nextLine());
		return songId;
	}

	public void displaySong(Song song) {
		System.out.println("Song Id : "+song.getSongId());
		System.out.println("Song Name : "+song.getSongName());
		System.out.println("Artist Name  : "+song.getArtistName());
		System.out.println("Album Name : "+song.getAlbumName());
		System.out.println("Song Location : "+song.getSongLocation());
		System.out.println("Song Description : "+song.getDescription());
		System.out.println("**************************************************");
	}

	public void allSongDisplay(List<Song> song) {
		for (Song song2 : song) {
			System.out.println("Song Id : "+song2.getSongId());
			System.out.println("Song Name : "+song2.getSongName());
			System.out.println("Artist Name  : "+song2.getArtistName());
			System.out.println("Album Name : "+song2.getAlbumName());
			System.out.println("Song Location : "+song2.getSongLocation());
			System.out.println("Song Description : "+song2.getDescription());
			System.out.println("**************************************************");
		}
		
	}

	public void randomSongDisplay(List<String> song) {
		for (String string : song) {
			System.out.println("Song Name : "+string);
			System.out.println("**************************************************");
		}
		
	}

}
