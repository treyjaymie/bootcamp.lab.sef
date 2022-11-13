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
	
	private static final int EMPLOYEE_COLUMN_ID = 1;
	private static final int EMPLOYEE_COLUMN_FIRSTNAME = 2;
	private static final int EMPLOYEE_COLUMN_LASTNAME = 3;
	private static final int EMPLOYEE_COLUMN_EMAIL = 4;
	
	private PreparedStatement statement;
	private ResultSet rows;
	
	public AccountDAOImpl(Connection conn) {
		this.conn = conn;
	}

	public List<Account> findAccount(String firstName, String lastName)
			throws AccountDAOException {
		
		try {
			statement = this.conn.prepareStatement(SELECT_BY_NAME);
	        statement.setString(1, firstName);
	        statement.setString(2, lastName);
	        rows = statement.executeQuery();
	           
	        List<Account> employees = new ArrayList<>();
	        while (rows.next()) {
	        	Account account = toAccount();
	        	employees.add(account);
	        }
	           
	        return employees;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return null;
	}

	private void close() {
		try {
			if (statement != null)
				statement.close();
			if (rows != null)
				rows.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Account toAccount() throws SQLException {
		Account account = new AccountImpl(
				   rows.getInt(EMPLOYEE_COLUMN_ID),
				   rows.getString(EMPLOYEE_COLUMN_FIRSTNAME),
				   rows.getString(EMPLOYEE_COLUMN_LASTNAME),
				   rows.getString(EMPLOYEE_COLUMN_EMAIL)
				   );
		return account;
	}

	public Account findAccount(int id) throws AccountDAOException {
		try {
			statement = this.conn.prepareStatement(SELECT_BY_ID);
			statement.setInt(1, id);
			rows = statement.executeQuery();
			
			Account account = null;
			while (rows.next()) {
	        	account = toAccount();
	        }
			return account;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
        
		
		return null;
	}


	public boolean insertAccount(String firstName, String lastName, String email)
			throws AccountDAOException {

		
		return false;
	}

}
