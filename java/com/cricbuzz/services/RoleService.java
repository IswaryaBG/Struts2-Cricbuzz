package com.cricbuzz.services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.cricbuzz.dao.DAOUtil;
import com.cricbuzz.model.Role;
import com.cricbuzz.model.Team;

public class RoleService {
	
	Role role;
	List<Role> RoleList;
	Session session;
	
	public RoleService() {
		session = DAOUtil.getSession();
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public List<Role> getRoles() {
		
		Query query=session.createQuery("from Role");
		RoleList=query.list();
		return RoleList;
	}
	public Role getRole(int roleId) {
		Session session = DAOUtil.getSession();
		role = session.get(Role.class, roleId);
		return role;
	}
}
