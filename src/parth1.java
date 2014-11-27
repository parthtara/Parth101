
public class parth1 {
	public static void main(String[] args){
		//System.out.println("Hi");
		parth1.hiParth();
parth1	x=	new parth1();
		String y=x.hikaku();
		System.out.println(y);
		Person person = new Person(11, "parth", "11 meabane");
		Person person2 = new Person();
		person2.setAge(34);
		System.out.println(person2.getAge());
		String str= person.getAddress();
		System.out.println(str);
		Manager manager= new Manager();
		manager.setAddress("123");
		manager.setAge(12);
		manager.setSsn(23);
		Person[] persons = new Person[2];
		
		
		
	}
	public static  void hiParth(){
		System.out.println("hi");
	}
	
	public String hikaku(){
		return "kaku";
		
	}

}
