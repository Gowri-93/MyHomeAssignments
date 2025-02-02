package week2.day4;

public class JavaConnection extends MysqlConnection {

	@Override
	public void connect() {
		System.out.println("Connected to Java");
	}

	@Override
	public void disconnect() {
		System.out.println("Disonnected to Java");
		
	}

	@Override
	public void extecuteUpdate() {
		System.out.println("Java update Executed");
	}

	@Override
	public void executeQuery() {
		System.out.println("Query Executed");
		
	}
public static void main(String[] args) {
	JavaConnection Obj1=new JavaConnection();
	Obj1.connect();
	Obj1.disconnect();
	Obj1.extecuteUpdate();
	Obj1.executeQuery();
}
}
