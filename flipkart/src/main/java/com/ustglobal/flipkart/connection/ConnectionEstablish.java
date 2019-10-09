package com.ustglobal.flipkart.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionEstablish implements Connection {
	EntityManagerFactory factory = null;
	EntityManager manager = null;

	public EntityManager getConnection() {
		factory = Persistence.createEntityManagerFactory("TestPersistence");
		manager = factory.createEntityManager();
		return manager;
	}

}
