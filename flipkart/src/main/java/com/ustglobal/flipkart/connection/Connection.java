package com.ustglobal.flipkart.connection;

import javax.persistence.EntityManager;

public interface Connection {
	public EntityManager getConnection();

}
