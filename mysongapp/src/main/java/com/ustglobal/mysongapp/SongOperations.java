package com.ustglobal.mysongapp;

import java.util.List;

import com.ustglobal.bean.Song;

public interface SongOperations {
	public boolean storeSong(Song song);
	public Song searchSong(int id);
	public List<Song> getSongAll();
	public Song getSong(int i);
	public boolean deleteSong(int i);
	public boolean updateSong(Song song);
	public List<String> getRandomSong();

}
