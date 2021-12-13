package application;

import java.sql.Connection;

import db.DB;
import model.dao.DaoFactory;

public class TesteJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaoFactory dao = new DaoFactory();
		
		Connection connection = DB.getConnection();
	}

}
