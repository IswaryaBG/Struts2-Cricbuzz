package com.cricbuzz.actions;

import java.util.List;

import com.cricbuzz.model.Role;
import com.cricbuzz.services.RoleService;
import com.opensymphony.xwork2.ActionSupport;

public class RoleAction extends ActionSupport {
	 
	 private static final long serialVersionUID = 1L;
	 private RoleService RoleService;
	 private List<Role> RoleList;
	 
	 public RoleAction() {
	  RoleService = new RoleService();
	 }
	 
	 public String execute() {
	  setRoleList(RoleService.getRoles());
	  System.out.println(RoleService.getRoles());
	  return SUCCESS;
	 }

	 public List<Role> getRoleList() {
	  return RoleList;
	 }

	 public void setRoleList(List<Role> RoleList) {
	  this.RoleList = RoleList;
	 }
	 

	}
