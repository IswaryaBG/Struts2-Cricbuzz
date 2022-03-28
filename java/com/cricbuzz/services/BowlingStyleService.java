package com.cricbuzz.services;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.cricbuzz.dao.DAOUtil;
import com.cricbuzz.model.BattingStyle;
import com.cricbuzz.model.BowlingStyle;

public class BowlingStyleService {
	
	BowlingStyle bowlingStyle;
	List<BowlingStyle> BowlingStyleList;
	Session session;
	
	public BowlingStyleService() {
		session = DAOUtil.getSession();
	}
	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public List<BowlingStyle> getBowlingStyles() {
		
		Query query=session.createQuery("from BowlingStyle");
		BowlingStyleList=query.list();
		return BowlingStyleList;
	}
	public BowlingStyle getBowlingStyle(int bowlingStyleId) {
		Session session = DAOUtil.getSession();
		bowlingStyle = session.get(BowlingStyle.class, bowlingStyleId);
		return bowlingStyle;
	}
}
