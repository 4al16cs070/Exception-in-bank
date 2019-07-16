package pac;

public class MMain {
	public static void main(String[] args) {
		System.out.println("main started");
		Acc a=new Acc("Raj",900.00);
		a.checkbal();
		a.deposit(90.00);
		a.checkbal();
		try
		{
			a.withdraw(6);;
		}
		catch(IsuffBalExcep e)
		{
			System.out.println("unable to widthdraw");
			System.out.println(e.getmessage());
		}
		a.checkbal();
		System.out.println("done");
	}
}
