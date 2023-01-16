package com.jdbcpreparedstatment.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jdbcpreparedstatment.util.JdbcUtil;

public class InsertApp {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pstmt = null;

		try {
			connection = JdbcUtil.getJdbcConnection();

			String sqlInsertQuery = "insert into student(`sname`,`sage`,`saddress`,`sgender`)values(?,?,?,?)";
			if (connection != null)
				pstmt = connection.prepareStatement(sqlInsertQuery);

			if (pstmt != null) {

				// use precompiled query to set the values
				pstmt.setString(1, "Ravi");
				pstmt.setInt(2, 24);
				pstmt.setString(3, "Bilara");
				pstmt.setString(4, "M");

				System.out.println(sqlInsertQuery);

				// execute the query
				int rowCount = pstmt.executeUpdate();
				System.out.println("No of rows updated is :: " + rowCount);
			}

		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JdbcUtil.cleanUp(connection, pstmt, null);
				System.out.println("Closing the resource...");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
