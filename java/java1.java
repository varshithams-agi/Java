---------------7/12---------------------

//array

package demo;
import java.util.*;

public class demo {
	public static void main(String args[]) {
		
//integer array		
		 int numbers[]= {23,287,2,89,2792};

		    for(int i=0;i<numbers.length;i++)
		    {
		        System.out.println(numbers[i]);
		    }
		    System.out.println("\n");
//character array		    
		    char vowels[]= {'a','e','i','o','u'};

		    for(int i=0;i<vowels.length;i++)
		    {
		        System.out.println(vowels[i]);
		    }
		    System.out.println("\n");
		    
//string array
		    
		    String vowel[]= {"a,A","e,E","i,I","o,O","u,U"};

		    for(int i=0;i<vowel.length;i++)
		    {
		        System.out.println(vowel[i]);
		    }
		    System.out.println("\n");

//taking user input	
		Scanner sc=new Scanner(System.in);    
		System.out.println("Enter size of array");
	    int size=sc.nextInt();

	    int number[]= new int[size];
	    System.out.println("Enter the elements of array : ");
	    for(int i=0;i<size;i++)
	    {
	    number[i]=sc.nextInt();
	    }      

	    System.out.println("Printing all the entered elements of array");
	    for(int i=0;i<number.length;i++)
	    {
	        System.out.println(number[i]);
	    }
	    
//sum of  array elements	
	 int sum=0;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter size of array");
        
    int sizes=s.nextInt();

    int num[]= new int[sizes];
    System.out.println("Enter the elements of array : ");
    for(int i=0;i<sizes;i++)
    {
    num[i]=s.nextInt();
    }      

    System.out.println("Printing all the entered elements of array");
    for(int i=0;i<num.length;i++)
    {

    sum=sum+num[i];
    }
    System.out.println(sum);
    }
    
}

// opearations on array
package demo;
import java.util.*;

public class demo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(" array elements are");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
//average of array elements		
		float avg;
		int sum=0;
		for(int i=0;i<size;i++) {
			sum+=arr[i];
		}
		avg=(sum/size);
		System.out.println(" average array elements is"+avg);
		
//Smallest and greatest element in an array
		int temp;  
		for (int i = 0; i < size; i++)   
		{  
			for (int j = i + 1; j < size; j++)   
		    {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        } 
		System.out.println(" smallest array elements is"+arr[0]);
		System.out.println(" greatest array elements is"+arr[size-1]);
		
//find vowels and vowels count
		System.out.println("enter the array size");
		int s=sc.nextInt();
		char a[]=new char[s];
		System.out.println("enter array elements");
		for(int i=0;i<s;i++) {
			a[i]=sc.next().charAt(0);
			
		}
		int count=0;
		System.out.println("vowels in array elements");
		for(int i=0;i<s;i++) {
			if(a[i]=='a'||a[i]=='A'||a[i]=='e'||a[i]=='E'||a[i]=='i'||a[i]=='I'||a[i]=='o'||a[i]=='O'||a[i]=='u'||a[i]=='U') {
				System.out.println(a[i]);
				count++;
			}
			      
			
		}
		System.out.println("vowels count in array elements " +count);
		
    }
    
}

//search of element
package demo;
import java.util.*;

public class demo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(" array elements are");
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(" enter the number to search");
		int num=sc.nextInt();
		int count=0;
		for(int i=0;i<size;i++) {
			if(num==arr[i]) {
				count++;
			}
		}
		System.out.println("number of occurance of "+num+" is "+count);
		
    }
    
}

-------------------------------------------------------------------------------
------------------------------8/12------------------------------------------------
//collection framework
package demo;
import java.util.*;

public class demo {
	public static void main(String args[]) {
	//String arraylist 
		ArrayList<String> list=new ArrayList<>();//Object
	    list.add("java");
        list.add("php");
        list.add("python");

        for(String x  : list)
        {
        	System.out.println(x);    
        }
       //integer arraylist
        ArrayList<Integer> l=new ArrayList<>();//Object
        l.add(567);
        l.add(67890);
        l.add(14);

        for(int  x  : l)
        {
	        System.out.println(x);    
        }
	        
    }
    
}

//to store multiple value

package demo;
import java.util.*;

public class demo {
	public static void main(String args[]) {
		ArrayList<Studentt> list=new ArrayList<>();//Object
        Studentt s1=new Studentt("sakshi", "Present");
        Studentt s2=new Studentt("xyz", "Present");
        Studentt s3=new Studentt("abc", "Present");    
        Studentt s4=new Studentt("xy", "Present");

          list.add(s1);
          list.add(s2);
          list.add(s3);
          list.add(s4);
          for( Studentt s:list)
          {
              System.out.println(s.name+"  "+s.attendence);
          }
	}
	 
	}
	 

	class Studentt
	{
	    String name;
	    String attendence;
	    public Studentt(String name, String attendence) {
	       
	        this.name = name;
	        this.attendence = attendence;
	    }    
	}
	
	
----------------
package demo;
import java.util.*;

public class Pattern {
	public static void main(String args[]) {

		
//2.student marks
		System.out.println("book           id    price    author\n");
		ArrayList<Books> list=new ArrayList<>();//Object
		Books b1=new Books("The overstory", 4, 380, "Richard");
		list.add(b1);
       for( Books b:list)
          {
              System.out.println(b.bname+"   "+b.id+"    "+b.price+"      "+b.author);
          }
                   
	}
	 
}
	class Books{
		String bname;
		int id;
		int price;
		String author;
		public Books(String bname, int id,int price, String author) {
			this.bname=bname;
			this.id=id;
			this.price=price;
			this.author=author;
			
		}
		
	}
----------------------
package demo;
import java.util.*;

public class demo {
	public static void main(String args[]) {

		
//1.language marks
		System.out.println("Language  Marks\n");
		ArrayList<Language> list=new ArrayList<>();//Object
		Language l1=new Language(" Java    ", 9);
		Language l2=new Language(" Android ",9);
		Language l3=new Language(" C       ", 10);    
		list.add(l1);
        list.add(l2);
        list.add(l3);
        
          for( Language l:list)
          {
              System.out.println(l.subject+"  "+l.mark);
          }
                   
	}
	 
}
	class Language{
		String subject;
		int mark;
		public Language(String subject, int mark) {
			this.subject=subject;
			this.mark=mark;
			
		}
		
	}
-----------
package demo;
import java.util.*;

public class Task {
	public static void main(String args[]) {

		
//2.student marks
		System.out.println("Student  Mark1  Mark2  Mark3\n");
		ArrayList<Studentt> list=new ArrayList<>();//Object
		Studentt s1=new Studentt(" varsha", 400, 380, 480);
		list.add(s1);
       for( Studentt s:list)
          {
              System.out.println(s.name+"   "+s.mark1+"    "+s.mark2+"   "+s.mark3);
          }
                   
	}
	 
}
	class Studentt{
		String name;
		int mark1;
		int mark2;
		int mark3;
		public Studentt(String name, int mark1,int mark2, int mark3) {
			this.name=name;
			this.mark1=mark1;
			this.mark2=mark2;
			this.mark3=mark3;
			
		}
		
	}
-------------	
//claer()
//get(index)
//add()
//isEmpty()
//remove(index)	
//removeall()
//addall()
---------
package demo;
import java.util.*;

public class demo {
	public static void main(String args[]) {
//add()
		 ArrayList<String> list=new ArrayList<String>(); 
		 list.add("varshitha");
		 list.add("Eshanya");
		 list.add("sahana");
		 
		 System.out.println("arraylist1 is: "+list);    
		 
// add element at particular index using add() 
		 list.add(1, "Nisha");
		 list.add(4, "Disha");
		 System.out.println("arraylist1 is: "+list);
		 
		
		 
//addAll()
		 ArrayList<String> name=new ArrayList<String>();
		 name.addAll(list);
		 name.add("roshini");
		 name.add("rachana");
		 System.out.println("arraylist2 is: "+name);
		 
 //remove()
		 list.remove(2);
		 list.remove("sahana");
		 System.out.println("after removing element arraylist1 is: "+list);
		 
//removeAll()
		 name.removeAll(list);
		 System.out.println("arraylist2 is: "+name);
		 
//clear()
		 list.clear();
		 
//isEmpty()
		 System.out.println("arraylist1 is empty: "+list.isEmpty());
		 
		 System.out.println("arraylist2 is empty: "+name.isEmpty());
		 
//get()
		 System.out.println("element is: "+name.get(2));
		 
	}
	 
}
---------------
package demo;
import java.util.*;

public class demo {
	public static void main(String args[]) {
//friend name nickname and contact		
		ArrayList<Friend> list=new ArrayList<>();
		Friend f1=new Friend("Varshitha","Varsha",5678909); 
		Friend f2=new Friend("Eshanya","Eshu",890956);
		list.add(f1);
		list.add(f2);
		for(Friend f: list)
		{
			System.out.println("name is: "+f.name+"\nnick name is: "+f.nickName+"\ncontact is: "+f.contact);
			System.out.println("\n");
		}
		
//languages
		ArrayList<String> l=new ArrayList<>();
		l.add("java");
		l.add("python");
		l.add("php");
		l.add("dbms");
		l.add("ml");
		l.add("c#");
		System.out.println("the language list is:"+l);
		l.remove("python");
		System.out.println("after removing 'python' the language list is:"+l);
	}
	 
}

class Friend{
	String name;
	String nickName;
	int contact;
	public Friend(String name, String nickName, int contact) {
		this.name=name;
		this.nickName=nickName;
		this.contact=contact;
	}
}

-------------------------------------------------------------
--------------------------10/12-------------------------------

//hashmap

package demo;
import java.util.*;

public class demo {
	public static void main(String args[]) {
// example 1		
		HashMap<String, String> hm=new HashMap<>();
		hm.put("color1", "Red");
		hm.put("color2", "Black");
		hm.put("color3", "Pink");
		for(Map.Entry<String, String> en : hm.entrySet()) {
			System.out.println(en.getKey()+ " : "+en.getValue());
		}
		System.out.println("\n");
//example 2		
		HashMap<String, Integer> map=new HashMap<>();
		map.put("Java", 79);
		map.put("PHP", 60);
		map.put("Android", 90);
		for(Map.Entry<String, Integer> en : map.entrySet()) {
			System.out.println(en.getKey()+ " : "+en.getValue());
		}
		System.out.println("\n");
//example 3		
		HashMap<Integer,String> mp=new HashMap<>();
		mp.put(1,"varsha");
		mp.put(2,"robot");
		mp.put(3,"tesla");
		for(Map.Entry<Integer,String> en : mp.entrySet()) {
			System.out.println(en.getKey()+ " : "+en.getValue());
		}

	}
}	

--------------

package demo;
import java.util.*;

public class demo {
	public static void main(String args[]) {
//Books details		
		HashMap<String, Book> map= new HashMap<>();
		Book b1=new Book("ABC",1,200);
		Book b2=new Book("XYZ",2,250);
		Book b3=new Book("EFG",4,150);
		map.put("Book1", b1);
		map.put("Book2", b2);
		map.put("Book3", b3);
		for(Map.Entry<String, Book> e:map.entrySet()) {
			System.out.println(e.getKey()+ " : " +e.getValue());
		}
		System.out.println("\n");
//Employee details
		HashMap<String, Employee> mp= new HashMap<>();
		Employee e1=new Employee("varsha",11,24500);
		Employee e2=new Employee("priya",21,25500);
		Employee e3=new Employee("ramya",41,31550);
		mp.put("Employee1", e1);
		mp.put("Employee2", e2);
		mp.put("Employee3", e3);
		for(Map.Entry<String, Employee> e:mp.entrySet()) {
			System.out.println(e.getKey()+ " : " +e.getValue());
		}	
		System.out.println("\n");
//Teachers details
		HashMap<String, Teacher> mp1= new HashMap<>();
		Teacher t1=new Teacher("Soumya",01,"Enlish");
		Teacher t2=new Teacher("Kayva",03,"Maths");
		Teacher t3=new Teacher("Krishna",05,"Science");
		mp1.put("Teacher1", t1);
		mp1.put("Teacher2", t2);
		mp1.put("Teacher3", t3);
		for(Map.Entry<String, Teacher> e:mp1.entrySet()) {
			System.out.println(e.getKey()+ " : " +e.getValue());
		}			

		
	}
}

class Book{
	String name;
	int id;
	int price;
	
	public Book(String name,int id,int price) {
		this.name=name;
		this.id=id;
		this.price=price;
	}
	public String toString() {
		return "Name: "+name+ " id: "+id+" price:"+price;
	}
}

class Employee{
	String name;
	int id;
	int salary;
	
	public Employee(String name,int id,int salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public String toString() {
		return "Name: "+name+ " id: "+id+" salary:"+salary;
	}
}
class Teacher{
	String name;
	int id;
	String clas;
	
	public Teacher(String name,int id,String clas) {
		this.name=name;
		this.id=id;
		this.clas=clas;
	}
	public String toString() {
		return "Name: "+name+ " id: "+id+" Class:"+clas;
	}
}

----------------
//arraylist of arraylist
ArrayList<ArrayList<Integer>> outer = new ArrayList<ArrayList<Integer>>();
ArrayList<Integer> inner = new ArrayList<Integer>();
ArrayList<Integer> inner1 = new ArrayList<Integer>();
inner.add(100);
inner.add(200);
inner1.add(300);
inner1.add(400);
outer.add(inner);
outer.add(inner1);
System.out.println(outer);

----------------------------
//hashmap methods
package demo;
import java.util.*;

public class Task {
	public static void main(String args[]) {

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		List<Integer> al = new ArrayList<>();
//add()
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);
		System.out.println(al);
//remove()		
		al.remove(1);
		al.remove(1);
		System.out.println(al);


//put()

		hash_map.put(10, "Hi");
		hash_map.put(15, "4");
		hash_map.put(20, "Hi");
		hash_map.put(25, "Welcomes");
		hash_map.put(30, "You");

//clear()

		hash_map.clear();
		System.out.println(hash_map);
//keySet()
		System.out.println("Initial Mappings are: " + hash_map);
		System.out.println("The set is: " + hash_map.keySet());
//containsKey()
		System.out.println("Is the key '20' present? " + hash_map.containsKey(20));
//size()
		System.out.println("The size of the map is " + hash_map.size());
//putAll()
		HashMap<Integer, String> new_hash_map = new HashMap<Integer, String>();
		new_hash_map.putAll(hash_map);
		System.out.println("The new map looks like this: " + new_hash_map);

//equal()
		System.out.println("First Map: "+ hash_map);
		System.out.println("Second Map: "+ hash_map);
		System.out.println("Equality: " + hash_map.equals(hash_map));

//get()
		System.out.println("The Value is: " + hash_map.get(25));


			
		}
		
	}
-----------------
//even or odd or prime
Scanner sc=new Scanner(System.in);
		ArrayList<Integer> main = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> prime = new ArrayList<Integer>();
		int a;
		System.out.println("enter arraylist elements");
		for(int i=1;i<=20;i++) {
			a=sc.nextInt();
			main.add(a);
		}
		System.out.println(main);
		int flag=0;
		for(int l:main) {
			boolean even1 = false;
	        boolean prime1 = true;
	        
	 
	        if(l % 2 == 0){
	            even1 = true;
	            prime1 = false;
	        }
	        else {
	            for(int i=3; i*i<=l; i+=2) {
	                if(l % i == 0) {
	                    prime1 = false;
	                }
	            }
	        }
	 
	        if(even1){
	            even.add(l);
	        }
	        else {
	            if(prime1){
	                prime.add(l);
	            }
	            else {
	               odd.add(l);
	            }
	        }
		}
		System.out.println("even arraylist is: "+even);
		System.out.println("odd arraylist is: "+odd);
		
		System.out.println("prime arraylist is: "+prime);
-------------------
//even or odd or prime

Scanner sc=new Scanner(System.in);
		ArrayList<Integer> main = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> prime = new ArrayList<Integer>();
		int a;
		System.out.println("enter arraylist elements");
		for(int i=1;i<=10;i++) {
			a=sc.nextInt();
			main.add(a);
		}
		System.out.println(main);
		int flag=0;
		for(int l:main) {
			if(l%2==0) {
				even.add(l);
			}
			else {
				odd.add(l);
			
				for(int i=2;i<=l/2;i++){      
					if(l%i==0){      
						flag=1;
						break;      
						      
					}  
				}
				if(flag==0){ 
					prime.add(l);
				}
			}
			
		}
		
		System.out.println("even arraylist is: "+even);
		System.out.println("odd arraylist is: "+odd);
		
		System.out.println("prime arraylist is: "+prime);
		