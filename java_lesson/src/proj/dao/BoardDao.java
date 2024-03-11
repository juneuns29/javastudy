package proj.dao;

import db.*;
import proj.sql.BoardSQL;
import proj.vo.BoardVO;

import java.sql.*;
import java.util.ArrayList;
public class BoardDao {
	private HJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	public BoardDao() {
		db = new HJDBC();
	}
	
	// 게시글 리스트 가져오는 함수
	public ArrayList<BoardVO> getBoardList(){
		String sql = BoardSQL.getSQL(BoardSQL.SEL_ALL_LIST);
		
		ArrayList<BoardVO> list = null;
		
//		데이터베이스 조회
		// 커넥션
		con = db.getCon();
		// stmt
		stmt = db.getStmt(con);
		
		try {
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return list;
	}
}
