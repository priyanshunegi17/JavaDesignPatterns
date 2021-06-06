
public class DBConn {

	static private DBConn instance = new DBConn();

	private DBConn() {

	}

	public static DBConn getInstance() {
		return instance;
//		return new DBConn();
	}

}
