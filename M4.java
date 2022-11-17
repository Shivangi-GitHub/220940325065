class GrandParent
{
	String grandFatherName;
	String grandMotherName;
	
	GrandParent(String f, String m)
	{
		grandFatherName=f;
		grandMotherName=m;
		System.out.println(grandFatherName);
		System.out.println(grandMotherName);
	}
}
	class Parent extends GrandParent{
		String fatherName;
		String MotherName;
		
		Parent(String a, String b,String c,String d)
		{
			super(a,b);
			fatherName=c;
			MotherName=d;
			System.out.println(fatherName);
			System.out.println(MotherName);
		}
	}
	class Child extends Parent{
		Child(String a, String b, String c, String d)
		{
			super(a,b,c,d);
		}
		
		public static void main(String args[])
		{
			Child c=new Child("Ram","Sita","Luv","Kush");
		}
	}
		