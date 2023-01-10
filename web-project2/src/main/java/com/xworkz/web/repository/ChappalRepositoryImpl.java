package com.xworkz.web.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.web.dto.ChappalDTO;

@Component
public class ChappalRepositoryImpl implements ChappalRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(ChappalDTO dto) {
		System.out.println("Running save method");
		EntityManager entityManager = this.factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(dto);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			entityManager.close();
		}
		return true;
	}

}
