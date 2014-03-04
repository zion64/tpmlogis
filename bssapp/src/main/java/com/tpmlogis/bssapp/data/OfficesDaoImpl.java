package com.tpmlogis.bssapp.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tpmlogis.bssapp.model.Offices;

@Repository
@Transactional
public class OfficesDaoImpl implements OfficesDao {
	
	Logger logger = LoggerFactory.getLogger(OfficesDaoImpl.class);
	
    @Autowired
    private EntityManager em;
    
	@Override
	public List<Offices> findAllOrderedByOfficeCode() {
		// TODO Auto-generated method stub
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Offices> criteria = cb.createQuery(Offices.class);
        Root<Offices> offices = criteria.from(Offices.class);

        /*
         * Swap criteria statements if you would like to try out type-safe criteria queries, a new
         * feature in JPA 2.0 criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
         */

        logger.info("검색 준비 입니다.");
        criteria.select(offices).orderBy(cb.asc(offices.get("officecode")));
        logger.info("검색이 준비가 완료되었습니다.");
        List<Offices> ofs = em.createQuery(criteria).getResultList();
        logger.info("검색이 완료되었습니다. 가져온 레코드 수는 {}입니다.", ofs.size());
        return ofs;
	}

}
