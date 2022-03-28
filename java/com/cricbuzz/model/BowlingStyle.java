package com.cricbuzz.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cricbuzz.dao.DAOUtil;

@Entity 
public class BowlingStyle {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer bowlingStyleId;
 private String bowlingStyle;
 
 public BowlingStyle() { }
 
 public BowlingStyle(String bowlingStyle) {
  this.bowlingStyle = bowlingStyle;
 }
 
 @SuppressWarnings("unchecked")
    public static List<BowlingStyle>  getBowlingStyleData() {

  try {

          return DAOUtil.getSession().createQuery("from BowlingStyle").list(); 
   }
          catch (Exception e) {
              return new ArrayList<BowlingStyle>();
          }
    }

 public Integer getBowlingStyleId() {
  return bowlingStyleId;
 }

 public void setBowlingStyleId(Integer bowlingStyleId) {
  this.bowlingStyleId = bowlingStyleId;
 }

 public String getBowlingStyle() {
  return bowlingStyle;
 }

 public void setBowlingStyle(String bowlingStyle) {
  this.bowlingStyle = bowlingStyle;
 }
 
 

}