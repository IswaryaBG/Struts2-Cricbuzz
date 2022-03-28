package com.cricbuzz.actions;

import java.util.List;

import com.cricbuzz.model.BattingStyle;
import com.cricbuzz.model.BowlingStyle;
import com.cricbuzz.model.Person;
import com.cricbuzz.model.Player;
import com.cricbuzz.model.Role;
import com.cricbuzz.model.Team;
import com.cricbuzz.services.BattingStyleService;
import com.cricbuzz.services.BowlingStyleService;
import com.cricbuzz.services.PersonService;
import com.cricbuzz.services.PlayerService;
import com.cricbuzz.services.RoleService;
import com.cricbuzz.services.TeamService;
import com.opensymphony.xwork2.ActionSupport;

public class GetListActions extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private TeamService teamService;
	private List<Team> teamList;
	
	private RoleService roleService;
	private List<Role> roleList;
	
	private BattingStyleService battingStyleService;
	private List<BattingStyle> battingStyleList;
	
	private BowlingStyleService bowlingStyleService;
	private List<BowlingStyle> bowlingStyleList;
	
	private PlayerService playerService;
	private List<Player> playerList;
	
	public GetListActions() {
		teamService = new TeamService();
		roleService=new RoleService();
		battingStyleService=new BattingStyleService();
		bowlingStyleService=new BowlingStyleService();
	}
	
	public String execute() {
		setTeamList(teamService.getTeams());
		setRoleList(roleService.getRoles());
		setBattingStyleList(battingStyleService.getBattingStyles());
		setBowlingStyleList(bowlingStyleService.getBowlingStyles());
		return SUCCESS;
	}
	
	public String getListOfPlayers() {
		setPlayerList(playerService.getPlayers());
		return SUCCESS;
	}
	
	public List<Team> getTeamList() {
		return teamList;
	}
	public void setTeamList(List<Team> teamList) {
		this.teamList = teamList;
	}

	
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	
	
	public List<BattingStyle> getBattingStyleList() {
		return battingStyleList;
	}
	public void setBattingStyleList(List<BattingStyle> battingStyleServiceList) {
		this.battingStyleList = battingStyleServiceList;
	}
	
	
	public List<BowlingStyle> getBowlingStyleList() {
		return bowlingStyleList;
	}
	public void setBowlingStyleList(List<BowlingStyle> bowlingStyleServiceList) {
		this.bowlingStyleList = bowlingStyleServiceList;
	}

	
	public List<Player> getPlayerList() {
		return playerList;
	}
	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
}
