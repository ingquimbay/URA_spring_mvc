package com.accenture.UserRegistration.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.accenture.UserRegistration.entity.Address;
import com.accenture.UserRegistration.entity.User;

@Repository
public class UserDAOImplement implements UserDAO {

	private EntityManager em;

	// constructor injection
	@Autowired
	public UserDAOImplement(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public List<User> findAll() {
		// get session
		Session currentSession = em.unwrap(Session.class);

		// create query
		Query<User> query = currentSession.createQuery("FROM User", User.class);

		// execute query and get result list
		List<User> users = query.getResultList();
		return users;
	}

	@Override
	public User findById(int id) {
		// get session
		Session currentSession = em.unwrap(Session.class);

		// create query
		User user = currentSession.get(User.class, id);
		// execute query and get result
		return user;
	}

	@Override
	public void save(User user) {
		// get session
		Session currentSession = em.unwrap(Session.class);

		// create execute query
		saveAddress(user.getAddress());
		// user.setAddress(a);
		currentSession.saveOrUpdate(user);

	}

	private void saveAddress(Address address) {
		// get session
		Session currentSession = em.unwrap(Session.class);
		currentSession.saveOrUpdate(address);
	}

	@Override
	public void delete(int id) {
		// create execute query
		em.remove(this.findById(id));

	}

	@Override
	public List<User> findByName(String name) {
		// get session
		Session currentSession = em.unwrap(Session.class);

		// create query
		Criteria criteria = currentSession.createCriteria(User.class);
		criteria.add(Restrictions.like("first_name", name + "%"));

		// execute query and get result list
		return criteria.list();

	}

	@Override
	public List<User> findByLastName(String name) {
		// get session
		Session currentSession = em.unwrap(Session.class);

		// create query
		Criteria criteria = currentSession.createCriteria(User.class);
		criteria.add(Restrictions.like("last_name", name + "%"));

		// execute query and get result list
		return criteria.list();

	}

	@Override
	public List<User> findByEmail(String email) {
		// get session
		Session currentSession = em.unwrap(Session.class);

		// create query
		Criteria criteria = currentSession.createCriteria(User.class);
		criteria.add(Restrictions.like("email", email + "%"));

		// execute query and get result list
		return criteria.list();
	}

	@Override
	public List<User> findByPhone(String phone_number) {
		// get session
		Session currentSession = em.unwrap(Session.class);

		// create query
		Criteria criteria = currentSession.createCriteria(User.class);
		criteria.add(Restrictions.like("phone_number", phone_number + "%"));

		// execute query and get result list
		return criteria.list();
	}
}
