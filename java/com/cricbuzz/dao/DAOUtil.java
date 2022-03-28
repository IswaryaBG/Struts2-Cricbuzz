package com.cricbuzz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cricbuzz.model.BattingStyle;
import com.cricbuzz.model.BowlingStyle;
import com.cricbuzz.model.Person;
import com.cricbuzz.model.Player;
import com.cricbuzz.model.Role;
import com.cricbuzz.model.Team;

public class DAOUtil {
	public static Session getSession() {

		Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Team.class).addAnnotatedClass(Person.class)
				.addAnnotatedClass(Role.class).addAnnotatedClass(BattingStyle.class).addAnnotatedClass(BowlingStyle.class).addAnnotatedClass(Player.class);
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
}
