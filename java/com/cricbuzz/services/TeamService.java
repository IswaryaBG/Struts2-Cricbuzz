package com.cricbuzz.services;

import java.util.List;

import javax.persistence.RollbackException;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.cricbuzz.dao.DAOUtil;
import com.cricbuzz.model.Player;
import com.cricbuzz.model.Team;

public class TeamService {
	Team team;
	List<Team> teamList;
	Session session;
	
	public TeamService() {
		session = DAOUtil.getSession();
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public List<Team> getTeams() {
		
		Query query=session.createQuery("from Team");
		teamList=query.list();
		return teamList;
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public List<Team> getTeamDetailByTeamId(int teamId) {
		
		SQLQuery query=session.createSQLQuery("select teamName,pr.name,pl.playerId from Team t\n" + 
			    "join Player pl on pl.teamName_teamId=t.teamId\n" + 
			    "join Person pr on pr.personId=pl.person_personId\n" + 
			    "where t.teamId="+teamId);
		 query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		teamList=query.list();
		
		return teamList;
	}
	public void saveTeam(Team team) {
	
		try {
			Session session=DAOUtil.getSession();
			Transaction transaction=session.beginTransaction();
			session.save(team);
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
	
	public Team getTeam(int teamId) {
		Session session = DAOUtil.getSession();
		team = session.get(Team.class, teamId);
		return team;
	}
	
	public void deleteTeam(Team team) {
		try {
		Session session=DAOUtil.getSession();
		Transaction transaction=session.beginTransaction();
		session.delete(team);
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
