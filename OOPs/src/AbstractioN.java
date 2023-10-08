
class Test1
{
	private int var;
	void setter(int a)
	{
		var=a;
	}
	int getter()
	{
		return var;
	}
}
public class AbstractioN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t=new Test1();
		t.setter(10);
		System.out.println(t.getter());
	}

}
