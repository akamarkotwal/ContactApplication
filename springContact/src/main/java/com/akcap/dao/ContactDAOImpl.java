package com.akcap.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.akcap.domain.Contact;
import com.akcap.rm.ContactRowMapper;
@Repository
public class ContactDAOImpl extends BaseDAO implements ContactDAO {

	public void save(Contact c) {
		String sql="INSERT INTO `contact`(userId ,name ,phone ,email ,address ,remarks)" + "VALUES(:userId,:name,:phone,:email,:address,:remarks)";
		Map m=new HashMap();
		m.put("userId", c.getUserId());
		m.put("name", c.getName());
		m.put("phone", c.getPhone());
		m.put("email", c.getEmail());
		m.put("address", c.getAddress());
		m.put("remarks", c.getRemarks());
		SqlParameterSource ps=new MapSqlParameterSource(m);
		KeyHolder kh=new GeneratedKeyHolder();
		getNamedParameterJdbcTemplate().update(sql, ps,kh);
		Integer contactId=kh.getKey().intValue();
		c.setContactId(contactId);
	}

	public void update(Contact c) {
		String sql="UPDATE  contact set name=:name ,phone=:phone ,email=:email ,address=:address ,remarks=:remarks  WHERE contactId=:contactId";
		Map m=new HashMap();
		m.put("contactId", c.getContactId());
		m.put("name", c.getName());
		m.put("phone", c.getPhone());
		m.put("email", c.getEmail());
		m.put("address", c.getAddress());
		m.put("remarks", c.getRemarks());
		getNamedParameterJdbcTemplate().update(sql,m);
		
	}

	public void delete(Contact c) {
		this.delete(c.getContactId());
		
	}

	public void delete(Integer contactId) {
		String sql="DELETE FROM contact WHERE contactId=?";
		getJdbcTemplate().update(sql,contactId);
		
	}

	public Contact findById(Integer contactId) {
		String sql="SELECT contactId,userId,name,phone,email,address,remarks  from contact where contactId=?";
		return getJdbcTemplate().queryForObject(sql, new ContactRowMapper(),contactId);
	}

	public List<Contact> findAll() {
		String sql="SELECT contactId,userId,name,phone,email,address,remarks  from contact ORDER BY name";
		return getJdbcTemplate().query(sql, new ContactRowMapper());
	}

	public List<Contact> findByProperty(String propName, Object propValue) {
	    String sql="SELECT contactId,userId,name,phone,email,address,remarks  from contact where "+propName+"=?";
	
		return getJdbcTemplate().query(sql, new ContactRowMapper(),propValue);
	}

}
