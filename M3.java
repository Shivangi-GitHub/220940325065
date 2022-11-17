class shape
{
	void draw()
	{
		System.out.println("this is drawing of shape");
	}
	void erase()
	{
		System.out.println("this is earser of shape");
	}
	
}
class Circle extends shape{
	void draw()
	{
		System.out.println("this is drawing of Circle");
	}
	void erase()
	{
		System.out.println("this is erase of circle");
	}
}
	class Triangle extends shape
	{
		void draw()
		{
			System.out.println("this is drawing of triangle");
		}
		void erase()
		{
			System.out.println("this is eraser of triangle");
		}
	}
		
		class Square extends shape{
			void draw()
			{
				System.out.println("this is drawing of square");
			}
			void erase()
			{
				System.out.println("this is eraser of square");
			}
		}
		
		class Demo1
		{
			public static void main(String args[])
			{
				shape s=new shape();
				Circle c=new Circle();
				Triangle t=new Triangle();
				Square sq=new Square();
				s.draw();
				s.erase();
				c.draw();
				c.erase();
				t.draw();
				t.erase();
				sq.draw();
				sq.erase();
			}
		}
				
		
	