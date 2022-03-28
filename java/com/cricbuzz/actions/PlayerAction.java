package com.cricbuzz.actions;

import java.util.List;

import org.hibernate.Session;

import com.cricbuzz.dao.DAOUtil;
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

public class PlayerAction extends ActionSupport {
	 
	 private static final long serialVersionUID = 1L;
	 private Player player;
	 private Person person;
	 private Team teamName;
	 private Role role;
	 private BattingStyle battingStyle;
	 private BowlingStyle bowlingStyle;
	 
	 private PlayerService playerService;
	 private PersonService personService;
	 private TeamService teamService;
	 private RoleService roleService;
	 private BattingStyleService battingStyleService;
	 private BowlingStyleService bowlingStyleService;
	 
	 private int iccRanking;
	 private int selectedTeamId;
	 private int selectedRoleId;
	 private int selectedBattingStyleId;
	 private int selectedBowlingStyleId;
	 private int selectedPlayerId;
	 
	 private List<Player> PlayerList;
	
	 public PlayerAction() {
		 player=new Player();
		 teamName=new Team();
		 role=new Role();
		 battingStyle=new BattingStyle();
		 bowlingStyle=new BowlingStyle();
	  personService = new PersonService();
	  playerService = new PlayerService();
	  teamService = new TeamService();
	  roleService = new RoleService();
	  battingStyleService = new BattingStyleService();
	  bowlingStyleService = new BowlingStyleService();
	 }
	 
	 public String execute() {
	  setPlayerList(playerService.getPlayers());
	  return SUCCESS;
	 }
	 
	 public String addPlayer() {
		    personService.addPerson(person);
			System.out.println("Person added successfully");
			player.setPerson(person);
			player.setIccRanking(iccRanking);
			teamName=teamService.getTeam(selectedTeamId);
			player.setTeamName(teamName);
			role=roleService.getRole(selectedRoleId);
			player.setRole(role);
			battingStyle=battingStyleService.getBattingStyle(selectedBattingStyleId);
			player.setBattingStyle(battingStyle);
			bowlingStyle=bowlingStyleService.getBowlingStyle(selectedBowlingStyleId);
			player.setBowlingStyle(bowlingStyle);
			playerService.savePlayer(player);
			System.out.println("Player added successfully");
			return SUCCESS;
	    }
	 public String deletePlayer() {
		 Session session = DAOUtil.getSession();
		 Player player = session.get(Player.class, selectedPlayerId);
		 playerService.deletePlayer(player);
		 return SUCCESS;
	 }
	 
	 public int getSelectedTeamId() {
		return selectedTeamId;
	}

	public void setSelectedTeamId(int selectedTeamId) {
		this.selectedTeamId = selectedTeamId;
	}

	public int getSelectedRoleId() {
		return selectedRoleId;
	}

	public void setSelectedRoleId(int selectedRoleId) {
		this.selectedRoleId = selectedRoleId;
	}

	public int getSelectedBattingStyleId() {
		return selectedBattingStyleId;
	}

	public void setSelectedBattingStyleId(int selectedBattingStyleId) {
		this.selectedBattingStyleId = selectedBattingStyleId;
	}

	public int getSelectedBowlingStyleId() {
		return selectedBowlingStyleId;
	}

	public void setSelectedBowlingStyleId(int selectedBowlingStyleId) {
		this.selectedBowlingStyleId = selectedBowlingStyleId;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
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

	public void setTeam(Team teamName) {
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

	public int getIccRanking() {
		return iccRanking;
	}

	public void setIccRanking(int iccRanking) {
		this.iccRanking = iccRanking;
	}

	public List<Player> getPlayerList() {
	  return PlayerList;
	 }

	 public void setPlayerList(List<Player> PlayerList) {
	  this.PlayerList = PlayerList;
	 }

	public int getSelectedPlayerId() {
		return selectedPlayerId;
	}

	public void setSelectedPlayerId(int selectedPlayerId) {
		this.selectedPlayerId = selectedPlayerId;
	}
	 
	 
}
