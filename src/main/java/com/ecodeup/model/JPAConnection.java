package com.ecodeup.model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAConnection {
	
	private static final String PERSISTANCE_UNIT_NAME = "PERSISTENCE";
	private static EntityManagerFactory factory;
	
	public static EntityManagerFactory getEntityFactory(){
		if (factory==null) {
			factory=Persistence.createEntityManagerFactory(PERSISTANCE_UNIT_NAME);
		}
		return factory;		
	}
	
	public static void close(){
		if (factory!=null) {
			factory.close();
		}
	}

}
