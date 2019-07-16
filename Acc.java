package pac;

public class Acc {
	String name;
	double accbal;
	Acc(String name,double accbal)
{
	this.name=name;
	this.accbal=accbal;
}
	void deposit(double amt)
	{
		System.out.println("depositing RS "+amt);
		accbal=accbal+amt;
	}
	void withdraw(double amt)
	{
		System.out.println("withdraw RS "+amt);
		if(amt>accbal)
		{
			throw new IsuffBalExcep("current bal is "+accbal);
			
		}
		else
			accbal=accbal-amt;
	}

void checkbal()
{
	System.out.println("balance is "+accbal);
}
}
