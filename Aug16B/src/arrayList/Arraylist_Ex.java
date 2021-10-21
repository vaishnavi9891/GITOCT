package arrayList;

import java.util.ArrayList;
//import java.util.Iterator;

public class Arraylist_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list = new ArrayList<String>();//array type is string

list.add("Job 1");//adds values into array
list.add("Job 2");
list.add("Job 3");
list.add("Job 5");
list.add("Job 4");// insertion order
list.add("Job 4");// duplicate value

//one type of execution is with while loop
//Iterator iter = list.iterator();
//while (iter.hasNext())
//{ System.out.println(iter.next());
//}
//System.out.println(list.get(2));// gets the index value

//another type of execution is with for loop

//for(String name:list)
//{ System.out.println(name);
//	}

// regular for loop execution
for(int i=0; i<list.size();i++)
{System.out.println(list.get(i));}
	//append values
	list.add(2,"Job 6");
	{
		System.out.println("after appending a value in index value 2");
		}
	for(int i=0; i<list.size();i++)
	{System.out.println(list.get(i));}

	//remove values
	list.remove(6);
	{
	System.out.println("after removing a value in index value 2");
	}
	for(int i=0; i<list.size();i++)
	{System.out.println(list.get(i));}

	System.exit(0);
	
	}
}