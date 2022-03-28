package com.cricbuzz.services;

import java.util.List;

import javax.persistence.RollbackException;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cricbuzz.dao.DAOUtil;
import com.cricbuzz.model.Player;
import com.cricbuzz.model.Team;

public class PlayerService {
	Player player;
	List<Player> playerList;
	Session session;
	
	public PlayerService() {
		session = DAOUtil.getSession();
	}
	
	@SuppressWarnings("rawtypes")
	 public List<Player> getPlayers() {
	  Session session = DAOUtil.getSession();
	  //System.out.println("Enter Player Id to Get Details : ");
	  //int playerId=sc.nextInt();
	  SQLQuery query=session.createSQLQuery("select playerId,name,dateOfBirth,age,homeTown,teamName,role,battingStyle,bowlingStyle,iccRanking\n" + 
	    "from Player pl\n" + 
	    "left join Person ps on pl.person_personId = ps.personId\n" + 
	    "left join Team t on t.teamId = pl.teamName_teamId\n" + 
	    "left join Role r on pl.role_roleId = r.roleId\n" + 
	    "left join BattingStyle bt on pl.battingStyle_battingStyleId = bt.battingStyleId\n" + 
	    "left join BowlingStyle bw on pl.bowlingStyle_bowlingStyleId = bw.bowlingStyleId\n"
	    );
	  query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
	  List playerList=query.list();

	  return playerList;
	  
	 }
	
	@SuppressWarnings("rawtypes")
	 public List<Player> getPlayerDetail(int playerId) {
	  Session session = DAOUtil.getSession();
	  System.out.println("Player id in getPlayerDetail : "+playerId);
	  //int playerId=sc.nextInt();
	  SQLQuery query=session.createSQLQuery("select playerId,name,dateOfBirth,age,homeTown,teamName,role,battingStyle,bowlingStyle,iccRanking\n" + 
	    "from Player pl\n" + 
	    "left join Person ps on pl.person_personId = ps.personId\n" + 
	    "left join Team t on t.teamId = pl.teamName_teamId\n" + 
	    "left join Role r on pl.role_roleId = r.roleId\n" + 
	    "left join BattingStyle bt on pl.battingStyle_battingStyleId = bt.battingStyleId\n" + 
	    "left join BowlingStyle bw on pl.bowlingStyle_bowlingStyleId = bw.bowlingStyleId\n"
	    +"where playerId="+playerId);
	  query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
	  List playerList=query.list();

	  return playerList;
	  
	 }
	
	public List<Player> getPlayersByTeamId(int selectedTeamId){
		Session session = DAOUtil.getSession();
		  System.out.println("Player id in getPlayerDetail : "+selectedTeamId);
		  //int playerId=sc.nextInt();
		  SQLQuery query=session.createSQLQuery("select playerId,name,dateOfBirth,age,homeTown,teamName,role,battingStyle,bowlingStyle,iccRanking\n" + 
		    "from Player pl\n" + 
		    "left join Person ps on pl.person_personId = ps.personId\n" + 
		    "left join Team t on t.teamId = pl.teamName_teamId\n" + 
		    "left join Role r on pl.role_roleId = r.roleId\n" + 
		    "left join BattingStyle bt on pl.battingStyle_battingStyleId = bt.battingStyleId\n" + 
		    "left join BowlingStyle bw on pl.bowlingStyle_bowlingStyleId = bw.bowlingStyleId\n"
		    +"where teamId="+selectedTeamId);
		  query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		  List playerList=query.list();
		return playerList;
	}
	
	public void savePlayer(Player player) {
		try {
			Session session=DAOUtil.getSession();
			Transaction transaction=session.beginTransaction();
			session.save(player);
			transaction.commit();
			session.close();
			}
			catch(IllegalStateException e) {
				System.out.println(e);
			}
			catch(RollbackException e) {
				System.out.println(e);
			}
		
	}
	
	public void deletePlayer(Player player) {
		try {
		Session session=DAOUtil.getSession();
		Transaction transaction=session.beginTransaction();
		session.delete(player);
		transaction.commit();
		session.close();
		}
		catch(IllegalStateException e) {
			System.out.println(e);
		}
		catch(RollbackException e) {
			System.out.println(e);
		}
	}
	
}
