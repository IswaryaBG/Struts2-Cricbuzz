package com.cricbuzz.services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.cricbuzz.dao.DAOUtil;
import com.cricbuzz.model.BattingStyle;
import com.cricbuzz.model.Team;

public class BattingStyleService {
	BattingStyle battingStyle;
	List<BattingStyle> BattingStyleList;
	Session session;
	
	public BattingStyleService() {
		session = DAOUtil.getSession();
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public List<BattingStyle> getBattingStyles() {
		
		Query query=session.createQuery("from BattingStyle");
		BattingStyleList=query.list();
		return BattingStyleList;
	}
	public BattingStyle getBattingStyle(int battingStyleId) {
		Session session = DAOUtil.getSession();
		battingStyle = session.get(BattingStyle.class, battingStyleId);
		return battingStyle;
	}
}
