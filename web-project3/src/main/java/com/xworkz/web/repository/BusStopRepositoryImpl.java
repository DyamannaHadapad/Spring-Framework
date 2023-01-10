package com.xworkz.web.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.web.dto.BusStopDTO;

@Component
public class BusStopRepositoryImpl implements BusStopRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(BusStopDTO dto) {
		System.out.println("running save method in BusStopRepositoryImpl");
		EntityManager entityManager = this.factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(dto);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			entityManager.close();
		}
		return true;
	}

	@Override
	public Optional<List<BusStopDTO>> findByStateName(String stateName) {
		System.out.println("Running findByStateName..." + stateName);
		EntityManager createEntityManager = this.factory.createEntityManager();
		Query query = createEntityManager.createNamedQuery("findByStateName");
		List list  ;
		try {
			query.setParameter("sn", stateName);
			return Optional.ofNullable(query.getResultList());
		} finally {
			System.out.println("closing createEntityManager");
			createEntityManager.close();
		}
	}

}
