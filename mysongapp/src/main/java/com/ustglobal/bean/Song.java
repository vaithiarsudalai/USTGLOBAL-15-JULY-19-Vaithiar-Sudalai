package com.ustglobal.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "musicfiles")
public class Song {
	@Override
	public String toString() {
		return "Song [songId=" + songId + ", songName=" + songName + ", artistName=" + artistName + ", albumName="
				+ albumName + ", songLocation=" + songLocation + ", description=" + description + "]";
	}

	@Id
	@Column(name = "song_id")
	private int songId;
	@Column(name = "song_title")
	private String songName;
	@Column(name = "artist_name")
	private String artistName;
	@Column(name = "album_name")
	private String albumName;
	@Column(name = "song_location")
	private String songLocation;
	@Column(name = "Descriprion")
	private String description;

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getSongLocation() {
		return songLocation;
	}

	public void setSongLocation(String songLocation) {
		this.songLocation = songLocation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
