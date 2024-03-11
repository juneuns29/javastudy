package proj.sql;

public class BoardSQL {
	public static final int SEL_ALL_LIST = 1001;
	
	public static String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_ALL_LIST:
			buff.append("SELECT ");
			buff.append("	bno, title, id, wdate, views ");
			buff.append("FROM ");
			buff.append("	board, member ");
			buff.append("WHERE ");
			buff.append("	writer = mno ");
			buff.append("	AND isshow = 'Y' ");
			break;
		}
		
		return buff.toString();
	}
}
