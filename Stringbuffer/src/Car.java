



public class Car {
	String carname;
	int carprice;
	int carcapacity;
	Car(String name,int price,int capacity)
	{
		carname=name;
		carprice=price;
		carcapacity=capacity;
	}
	void display()
	{
		System.out.println(carname);
	       System.out.println(carprice);
	       System.out.println(carcapacity);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Car obj=new Car("Verna",900000,5);
       obj.display();
	}

}
