package week2.day3;

public class APIClientClass {

	public void sendRequest(String Endpoint) {
		
		System.out.println("Endpoint value" +Endpoint);

	}
	
	public void sendRequest(String Endpoint, String RequestBody,Boolean RequestStatus)
	{
		System.out.println("Endpoint value" +Endpoint);
		
		System.out.println("RequestBody" + RequestBody);
		
		System.out.println("RequestStatus" + RequestStatus);
	}
	public static void main(String[] args) {
		APIClientClass Obj=new APIClientClass();
		Obj.sendRequest("TestLeaf");
		Obj.sendRequest("TestLeaf", "SeleniumLearning",true);
				

	}

}
