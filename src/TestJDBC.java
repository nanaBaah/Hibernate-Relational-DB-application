import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:db2://vsisls4.informatik.uni-hamburg.de:50001/VSISP";
		String user = "vsisp18";
		String pw = "9fjfNoij";

		try {
			System.out.println("Connecting to database: " + url);
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			Connection con = DriverManager.getConnection(url, user, pw);

			System.out.println("Connection passed");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
