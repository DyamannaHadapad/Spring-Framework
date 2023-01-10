package com.xworkz.web.reposiory;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.web.dto.IceCreamDTO;

@Component
public class IceCreamRepositoryImpl implements IceCreamRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(IceCreamDTO dto) {
		System.out.println("running save method ...");
		System.out.println("factory  :" + factory);
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
	public Optional<List<IceCreamDTO>> findByBrand(String brand) {
		System.out.println("running findByBrand in rep...." + brand);
		EntityManager entityManager = this.factory.createEntityManager();
		List list;
		try {
			Query query = entityManager.createNamedQuery("findByBrand");
			query.setParameter("bd", brand);
			list = query.getResultList();
			return Optional.ofNullable(list);
		} finally {
			System.out.println("closing entitymanager.....");
			entityManager.close();
		}

	}

}
