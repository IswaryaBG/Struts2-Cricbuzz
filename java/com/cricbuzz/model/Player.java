package com.cricbuzz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class Player {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer playerId;
 private Integer iccRanking;
    @OneToOne
 private Person person;
    @OneToOne
 private Team teamName;
    @OneToOne
 private Role role;
    @OneToOne
 private BattingStyle battingStyle;
    @OneToOne
 private BowlingStyle bowlingStyle;

 public Player(Integer iccRanking, Person person, Team teamName, Role role, BattingStyle battingStyle, BowlingStyle bowlingStyle) {
  super();
  this.iccRanking = iccRanking;
  this.person = person;
  this.teamName = teamName;
  this.role = role;
  this.battingStyle = battingStyle;
  this.bowlingStyle = bowlingStyle;
 }

 public Player() {
  // TODO Auto-generated constructor stub
 }

 public Integer getPlayerId() {
  return playerId;
 }

 public void setPlayerId(Integer playerId) {
  this.playerId = playerId;
 }

 public Integer getIccRanking() {
  return iccRanking;
 }

 public void setIccRanking(Integer iccRanking) {
  this.iccRanking = iccRanking;
 }

 public Person getPerson() {
  return person;
 }

 public void setPerson(Person person) {
  this.person = person;
 }

 public Team getTeamName() {
  return teamName;
 }

 public void setTeamName(Team teamName) {
  this.teamName = teamName;
 }

 public Role getRole() {
  return role;
 }

 public void setRole(Role role) {
  this.role = role;
 }

 public BattingStyle getBattingStyle() {
  return battingStyle;
 }

 public void setBattingStyle(BattingStyle battingStyle) {
  this.battingStyle = battingStyle;
 }

 public BowlingStyle getBowlingStyle() {
  return bowlingStyle;
 }

 public void setBowlingStyle(BowlingStyle bowlingStyle) {
  this.bowlingStyle = bowlingStyle;
 }
 
 

}