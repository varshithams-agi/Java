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