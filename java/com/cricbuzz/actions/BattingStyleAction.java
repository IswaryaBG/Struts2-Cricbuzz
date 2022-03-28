package com.cricbuzz.actions;

import java.util.List;

import com.cricbuzz.model.BattingStyle;
import com.cricbuzz.services.BattingStyleService;
import com.opensymphony.xwork2.ActionSupport;

public class BattingStyleAction extends ActionSupport {
	 
	 private static final long serialVersionUID = 1L;
	 private BattingStyleService BattingStyleService;
	 private List<BattingStyle> BattingStyleList;
	 
	 public BattingStyleAction() {
	  BattingStyleService = new BattingStyleService();
	 }
	 
	 public String execute() {
	  setBattingStyleList(BattingStyleService.getBattingStyles());
	  System.out.println(BattingStyleService.getBattingStyles());
	  return SUCCESS;
	 }

	 public List<BattingStyle> getBattingStyleList() {
	  return BattingStyleList;
	 }

	 public void setBattingStyleList(List<BattingStyle> BattingStyleList) {
	  this.BattingStyleList = BattingStyleList;
	 }
	 

	}
