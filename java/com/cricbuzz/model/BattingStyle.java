package com.cricbuzz.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cricbuzz.dao.DAOUtil;

@Entity 
public class BattingStyle {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer battingStyleId;
 private String battingStyle;
 
 public BattingStyle() { }
 
 public BattingStyle(String battingStyle) {
  this.battingStyle = battingStyle;
 }
 
 @SuppressWarnings("unchecked")
    public static List<BattingStyle>  getBattingStyleData() {

  try {

          return DAOUtil.getSession().createQuery("from BattingStyle").list(); 
   }
          catch (Exception e) {
              return new ArrayList<BattingStyle>();
          }
    }

 public Integer getBattingStyleId() {
  return battingStyleId;
 }

 public void setBattingStyleId(Integer battingStyleId) {
  this.battingStyleId = battingStyleId;
 }

 public String getBattingStyle() {
  return battingStyle;
 }

 public void setBattingStyle(String battingStyle) {
  this.battingStyle = battingStyle;
 }
 
 

}