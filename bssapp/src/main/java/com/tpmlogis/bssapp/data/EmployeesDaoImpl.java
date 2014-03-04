package com.tpmlogis.bssapp.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tpmlogis.bssapp.domain.Employees;
import com.tpmlogis.bssapp.model.Member;

@Repository
@Transactional
public class EmployeesDaoImpl implements EmployeesDao {
    @Autowired
    private EntityManager em;
    
	@Override
	public List<Employees> findAllOrderedByName() {
		// TODO Auto-generated method stub
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Employees> criteria = cb.createQuery(Employees.class);
        Root<Employees> employees = criteria.from(Employees.class);

        /*
         * Swap criteria statements if you would like to try out type-safe criteria queries, a new
         * feature in JPA 2.0 criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
         */

        criteria.select(employees).orderBy(cb.asc(employees.get("firstName")));
        return em.createQuery(criteria).getResultList();
	}

}
