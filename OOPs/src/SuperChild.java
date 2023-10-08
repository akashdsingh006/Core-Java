import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class SuperParent {

	public void m(Object c)
	{
		System.out.println("Collection");
	}

}

class SuperChild extends SuperParent
{
	public void m(String l)
	{
		System.out.println("List");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperParent s=new SuperChild();
		
		s.m(null);
		
	}
}
