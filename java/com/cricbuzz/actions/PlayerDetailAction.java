package com.cricbuzz.actions;

import java.util.List;

import com.cricbuzz.model.Player;
import com.cricbuzz.services.PlayerService;
import com.opensymphony.xwork2.ActionSupport;

public class PlayerDetailAction extends ActionSupport {
	 
	 private static final long serialVersionUID = 1L;
	 private PlayerService PlayerService;
	 private List<Player> PlayerList;
	 private int playerId;
	 public PlayerDetailAction() {
	  PlayerService = new PlayerService();
	 }
	 
	 public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String execute() {
	  setPlayerList(PlayerService.getPlayerDetail(playerId));
	  System.out.println("pl id in execute of playerdetailaction : "+playerId);
	  return SUCCESS;
	 }

	 
	 public List<Player> getPlayerList() {
	  return PlayerList;
	 }

	 public void setPlayerList(List<Player> PlayerList) {
	  this.PlayerList = PlayerList;
	 }

}
