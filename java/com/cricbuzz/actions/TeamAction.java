package com.cricbuzz.actions;

import java.util.List;

import com.cricbuzz.model.Player;
import com.cricbuzz.model.Team;
import com.cricbuzz.services.PlayerService;
import com.cricbuzz.services.TeamService;
import com.opensymphony.xwork2.ActionSupport;

public class TeamAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private TeamService teamService;
	private List<Team> teamList;
	private Team team;
	private int teamId;
	private int selectedTeamId;

	private Player player;
	private PlayerService playerService;
	private boolean nullCheck;

	public TeamAction() {
		teamService = new TeamService();
		playerService=new PlayerService();
	}

	public String execute() {
		setTeamList(teamService.getTeams());
		System.out.println(teamService.getTeams());
		System.out.println("team action execute called temaid - " + teamId);
		return SUCCESS;
	}

	public String getTeamDetailByTeamId() {
		setTeamList(teamService.getTeamDetailByTeamId(teamId));
		System.out.println("team list  :  " + teamService.getTeamDetailByTeamId(teamId));
		return SUCCESS;
	}
	
	public String addTeam() {
		teamService.saveTeam(team);
		System.out.println("Team added successfully");
		return SUCCESS;
	}
	
	public String deleteTeam() {
		nullCheck=playerService.preRemove(selectedTeamId);
		System.out.println("Checked");
		Team team=teamService.getTeam(selectedTeamId);
		teamService.deleteTeam(team);
		System.out.println("Team deleted successfully");
		return SUCCESS;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public List<Team> getTeamList() {
		return teamList;
	}

	public void setTeamList(List<Team> list) {
		this.teamList = list;
	}

	public int getSelectedTeamId() {
		return selectedTeamId;
	}

	public void setSelectedTeamId(int selectedTeamId) {
		this.selectedTeamId = selectedTeamId;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public boolean isNullCheck() {
		return nullCheck;
	}

	public void setNullCheck(boolean nullCheck) {
		this.nullCheck = nullCheck;
	}

}
