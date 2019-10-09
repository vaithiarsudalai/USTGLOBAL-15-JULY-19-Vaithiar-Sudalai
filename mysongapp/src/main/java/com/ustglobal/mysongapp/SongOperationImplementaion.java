package com.ustglobal.mysongapp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ustglobal.bean.Song;

public class SongOperationImplementaion implements SongOperations {

	ConnectionEst con = new ConnectionEst();

	public boolean storeSong(Song song) {
		try {
			EntityManager em = ConnectionEst.getConnection();
			ConnectionEst.transaction = em.getTransaction();
			ConnectionEst.transaction.begin();
			em.persist(song);
			ConnectionEst.transaction.commit();
			System.out.println("Saved");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	public Song searchSong(int id) {

		EntityManager em = ConnectionEst.getConnection();
		Song song = em.find(Song.class, id);
		System.out.println("Found");
		return song;
	}

	public List<Song> getSongAll() {
		EntityManager em = ConnectionEst.getConnection();
		String jpql1 = "from Song";
		Query query1 = em.createQuery(jpql1);
		List<Song> resultList1 = query1.getResultList();
		return resultList1;
	}

	public Song getSong(int id) {
		EntityManager em = ConnectionEst.getConnection();
		Song song = em.find(Song.class, id);
		System.out.println("Found");
		return song;
	}

	public boolean deleteSong(int i) {
		EntityManager em = ConnectionEst.getConnection();
		ConnectionEst.transaction = em.getTransaction();
		ConnectionEst.transaction.begin();
		String jpql = "delete from Song where songId = :id ";
		Query query = em.createQuery(jpql);
		query.setParameter("id", i);
		int count = query.executeUpdate();
		ConnectionEst.transaction.commit();
		System.out.println("Deleted");
		return true;
	}

	public boolean updateSong(Song song) {
		EntityManager em = ConnectionEst.getConnection();
		ConnectionEst.transaction = em.getTransaction();
		String jpql3 = "update Song set songName = :name where songId = :id";
		ConnectionEst.transaction.begin();
		Query query2 = em.createQuery(jpql3);
		query2.setParameter("name", song.getSongName());
		query2.setParameter("id", song.getSongId());
		query2.executeUpdate();
		ConnectionEst.transaction.commit();
		return true;
	}

	public List<String> getRandomSong() {
		EntityManager em = ConnectionEst.getConnection();
		String jpql3 = "select songName from Song Order By rand()";
		Query query1 = em.createQuery(jpql3);
		List<String> resultList1 = query1.getResultList();
		return resultList1;

	}

}
