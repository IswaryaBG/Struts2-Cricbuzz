package com.cricbuzz.model;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cricbuzz.dao.DAOUtil;

@Entity 
public class Role {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer roleId;
 private String role;
 
 public Role() { }
 
 public Role(String role) {
  this.role = role;
 }
 
 @SuppressWarnings("unchecked")
    public static List<Role>  getRoleData() {
  try {

          return DAOUtil.getSession().createQuery("from Role").list(); 
   }
          catch (Exception e) {
              return new ArrayList<Role>();
          }

    }

 public Integer getRoleId() {
  return roleId;
 }

 public void setRoleId(Integer roleId) {
  this.roleId = roleId;
 }

 public String getRole() {
  return role;
 }

 public void setRole(String role) {
  this.role = role;
 }

}