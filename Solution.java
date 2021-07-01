package javaprogram ;

class Library{

	int total_books=0;
	 String a[]=new String[100];

	void addbook(String book) {
		this.a[total_books]=book;
		total_books++;
	}
	void avilable_books() {
		System.out.println("available books:");

		for( String element:this.a) {
			if(element==null) {
				continue;
			
		
			}
			System.out.println("*"+element);
		}	
	}
	void issue_book(String book) {
		
		for(int i=0;i<this.a.length;i++) {
		   if(this.a[i].equals(book)) {
				System.out.println(book+" book is issue");
				  this.a[i]=null;
				  break;
		   }
		 
		}
		
		
	}
	void return_book(String book) {
		
		for(int i=0;i<this.a.length;i++) {
		   if(this.a[i]==null) {
				
				  this.a[i]=book;
				  System.out.println("your book is returned");
                  break;
		      } 
		 
		   } 
		}
	}
class Solution {
	
    public static void main(String[] args)  {
		
	Library a=new Library() ;
	a.addbook("MPMC");
	a.addbook("DSD");
	a.addbook("MATH");
	a.addbook("PHY");
	a.addbook("IC");
	
	a.avilable_books();
	
	a.issue_book("DSD");
	a.avilable_books();
	
	a.return_book("DSD");
	a.avilable_books();
		
	}
}


