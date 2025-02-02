package week2.day4;

public class ConcreteClass implements DatabaseConnection {

	

	@Override
	public void connect() {
		System.out.println("Connected to the network");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from the network");
		
	}

	@Override
	public void extecuteUpdate() {
		System.out.println("Execution updated");
		
	}
public static void main(String[] args) {
	
	ConcreteClass Obj=new ConcreteClass();
	Obj.connect();
	Obj.disconnect();
	Obj.extecuteUpdate();
		

	}
}
