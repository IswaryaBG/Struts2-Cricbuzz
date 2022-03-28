package com.cricbuzz.actions;

import java.util.List;

import com.cricbuzz.model.BowlingStyle;
import com.cricbuzz.services.BowlingStyleService;
import com.opensymphony.xwork2.ActionSupport;

public class BowlingStyleAction extends ActionSupport {
	 
	 private static final long serialVersionUID = 1L;
	 private BowlingStyleService BowlingStyleService;
	 private List<BowlingStyle> BowlingStyleList;
	 
	 public BowlingStyleAction() {
	  BowlingStyleService = new BowlingStyleService();
	 }
	 
	 public String execute() {
	  setBowlingStyleList(BowlingStyleService.getBowlingStyles());
	  System.out.println(BowlingStyleService.getBowlingStyles());
	  return SUCCESS;
	 }

	 public List<BowlingStyle> getBowlingStyleList() {
	  return BowlingStyleList;
	 }

	 public void setBowlingStyleList(List<BowlingStyle> BowlingStyleList) {
	  this.BowlingStyleList = BowlingStyleList;
	 }
	 

	}
