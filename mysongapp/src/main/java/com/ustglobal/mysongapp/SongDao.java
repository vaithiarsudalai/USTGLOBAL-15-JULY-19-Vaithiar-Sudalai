package com.ustglobal.mysongapp;

import java.util.List;

import com.ustglobal.bean.Song;

public interface SongDao {
	public Song insertSong();
	public Song updateSong();
	public int songId();
	public void displaySong(Song song);
	public void allSongDisplay(List<Song> song);
	public void randomSongDisplay(List<String> song);

}
