package com.tpmlogis.bssapp.util;

import org.hibernate.cfg.reveng.dialect.JDBCMetaDataDialect;
import org.hibernate.cfg.reveng.dialect.MetaDataDialect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostgreSQLMetaDialect extends JDBCMetaDataDialect {
	private static final Logger log = LoggerFactory.getLogger(PostgreSQLMetaDialect.class);
	 
	/*
	 * (non-Javadoc)
	 * @see org.hibernate.cfg.reveng.dialect.AbstractMetaDataDialect#needQuote(java.lang.String)
	 */
	public boolean needQuote(String name) {		
		log.debug("needQuote(" + name +")");
		if(null != name && 0 != name.compareTo(name.toUpperCase())) {
			return true;
		} else {
			return super.needQuote(name);
		}
	}
}
