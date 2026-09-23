package com.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.book.dbconnection.DC;
import com.book.pojo.book;

public class bookDaoimp implements bookDao {


	@Override
	public void addbook(book item) {

		String sql = "INSERT INTO book(name,author,price,quantity,category) VALUES(?,?,?,?,?)";

		try {

			Connection conn = DC.getDC();

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, item.getbName());
			ps.setString(2, item.getAuthor());
			ps.setDouble(3, item.getPrice());
			ps.setInt(4, item.getQuantity());
			ps.setString(5, item.getCategory());

			ps.executeUpdate();

			System.out.println("book added successfully");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}



	@Override
	public List<book> getAllBook() {

		List<book> books = new ArrayList<>();

		String sql = "SELECT * FROM book";

		try {

			Connection conn = DC.getDC();

			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				book item = new book();

				item.setBookId(rs.getInt("id"));
				item.setbName(rs.getString("name"));
				item.setAuthor(rs.getString("author"));
				item.setPrice(rs.getDouble("price"));
				item.setQuantity(rs.getInt("quantity"));
				item.setCategory(rs.getString("category"));

				books.add(item);
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return books;
	}



	@Override
	public void updateBook(book item) {

		String sql = "UPDATE book SET name=?, author=?, price=?, quantity=?, category=? WHERE id=?";

		try {

			Connection conn = DC.getDC();

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, item.getbName());
			ps.setString(2, item.getAuthor());
			ps.setDouble(3, item.getPrice());
			ps.setInt(4, item.getQuantity());
			ps.setString(5, item.getCategory());
			ps.setInt(6, item.getBookId());

			ps.executeUpdate();

			System.out.println("book updated successfully");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}



	@Override
	public void deleteBook(int id) {

		String sql = "DELETE FROM book WHERE id=?";

		try {

			Connection conn = DC.getDC();

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setInt(1, id);

			ps.executeUpdate();

			System.out.println("book deleted successfully");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
