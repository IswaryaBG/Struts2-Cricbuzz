package com.cricbuzz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Team {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer teamId;
	 private String teamName;
	 
	 public Team() { }
	 
	 public Team(String teamName) {
	  this.teamName = teamName;
	 }
	 
	 public Integer getTeamId() {
	  return teamId;
	 }

	 public void setTeamId(Integer teamId) {
	  this.teamId = teamId;
	 }

	 public String getTeamName() {
	  return teamName;
	 }

	 public void setTeamName(String teamName) {
	  this.teamName = teamName;
	 }

	 @Override
	 public String toString() {
	  return "Team [teamId=" + teamId + ", teamName=" + teamName + "]";
	 }
	 
	 
	 

	}
