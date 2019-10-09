package com.ustglobal.mysongapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.bean.Song;

public class App {
	public static void main(String[] args) {
		SongOperationImplementaion operation = new SongOperationImplementaion();
		Song song = new Song();
		List<Song> songList = null;
		SongDaoImplementation dao = new SongDaoImplementation();
		int songId;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");
		System.out.println("1.Play a Song");
		System.out.println("2.Search a Song");
		System.out.println("3.Show all Song");
		System.out.println("4.Operate a Song");
		int choice = Integer.parseInt(sc.nextLine());

		while (choice > 0 && choice < 5) {
			switch (choice) {
			case 1:
				System.out.println("Enter your Choice");
				System.out.println("1.Play All Song");
				System.out.println("2.Play Random Song");
				System.out.println("3.Play Particular Song");
				String choice1 = sc.nextLine();
				switch (choice1) {
				case "A":
					songList = operation.getSongAll();
					dao.allSongDisplay(songList);
					break;
				case "B":
					List<String> randomList = operation.getRandomSong();
					dao.randomSongDisplay(randomList);
					break;
				case "C":
					songId = dao.songId();
					song = operation.getSong(songId);
					dao.displaySong(song);
					break;

				default:
					System.out.println("Invalid Choice");
					break;
				}

				break;
			case 2:
				songId = dao.songId();
				song = operation.getSong(songId);
				dao.displaySong(song);
				break;
			case 3:
				songList = operation.getSongAll();
				dao.allSongDisplay(songList);
				break;
			case 4:
				System.out.println("Enter your Choice");
				System.out.println("1.Insert a Song");
				System.out.println("2.Edit a Song");
				System.out.println("3.Delete Song");
				String choice2 = sc.nextLine();
				switch (choice2) {
				case "A":
					song = dao.insertSong();
					operation.storeSong(song);
					break;
				case "B":
					song = dao.updateSong();
					operation.updateSong(song);
					break;
				case "C":
					songId = dao.songId();
					operation.deleteSong(songId);
					break;

				default:
					System.out.println("Invalid Choice");
					break;
				}

				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}
		}

	}
}
