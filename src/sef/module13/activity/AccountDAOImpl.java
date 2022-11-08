package sef.module13.activity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {

	private Connection conn;
	private static final String SELECT_ALL_EMPLOYEES = "SELECT id, first_name, last_name, email FROM account";
	private static final String SELECT_BY_ID = SELECT_ALL_EMPLOYEES + " WHERE employee_id = ?";
	private static final String SELECT_BY_NAME = SELECT_ALL_EMPLOYEES + " WHERE first_name = ? AND last_name = ?";
	private static final String INSERT_ACCOUNT = "INSERT INTO account VALUES (?, ?, ?, ?)";
	
	public AccountDAOImpl(Connection conn) {
		this.conn = conn;
	}

	public List<Account> findAccount(String firstName, String lastName)
			throws AccountDAOException {
		
		return null;
	}

	public Account findAccount(int id) throws AccountDAOException {

		
		return null;
	}


	public boolean insertAccount(String firstName, String lastName, String email)
			throws AccountDAOException {

		
		return false;
	}

}
