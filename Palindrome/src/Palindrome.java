import java.util.Scanner;


interface intlength {
	void getlength(int numberlength); 	
	boolean Palindrometest();
	void rotation(int base);
	double komath(int x , int y);
	}
	
//-----------------------------------------------------------------------------------------------------	 END OF INTLENGTH (INTERFACE)
	class job implements intlength{
		
		int numberlength ;
		int base;
		int rotaited = 0;
		
		// a block for get length
		public void getlength(int base) {                                                                          // a method for getting lengt by dividing by 10
		
			int lengthcounter = 0 ;
			
			while(base>=1) {
				base = base/10 ;
				lengthcounter++;			}
			
			this.numberlength = lengthcounter;	}
		
		
		
		
		// just polindrom test
		public boolean Palindrometest() {                                                                          // telling about its polindrom or not
			
			if (rotaited == base ) {			return true;
			}else {		return false;	}
		}

		
		
		
			// a block fpr rotation
		public void rotation(int base){                                                                           // getting number as input and giving its rotation
			int mlength = numberlength * -1 + 1;
			int test ;
			int counter  = 0;
			int dead = 0 ;
			
			while(mlength != 1  ) {	                                                                             // loops gone be here (length-1) times
				
			test = (int)((double)(base) * komath(10,mlength));	                                                 // getting number bit by bit from left
			
			if (counter > 0 ) {    	                                                                             // first round is off because test - dead should be 0 logicaly  at round 1
				
				dead = dead * 10;                                                                                // dead from last loop *10 so be equaly in bits with test
				
				test = test - dead ;                                                                             // all bits gone be off and bit at 10^0 will stand alone
				
				test = test * (int)(komath(10,counter)); }                                                       // test is one bit we drove it to get its normal bits it had at first
			
			rotaited = rotaited +test ;                                                                          // we apply the bits one by one each round
			
			dead = (int)((double)(base) * komath(10,mlength));                                                 // dead get the orginal value of test at begin of loop
			mlength++;                                                                                           // bits get off
			counter++;      }                                                                                    // bits get on
			
			
		System.out.println("your numbers rotation is=> " + rotaited);                                            // simple user friendly 
		}





		// a block for power
		public double komath(int x, int y) {
			double sum = 1 ;
			
			if (y>0) {		for(;y != 0 ; y--) {		sum = x * sum;		}
			
			}else {	for(;y != 0 ; y++) {		sum =sum /x;	}	}
			return sum;
		}	
	}
//---------------------------------------------------------------------------------------------------------------------------------   END OF JOB (CLASS) HAS BEEN EXTENDED BY WORKING
	class working extends job{                                   									             // class working 
	
	Scanner koko = new Scanner(System.in);
	
	working() { // input a number
		System.out.print("please enter a integer number:");
		base = koko.nextInt();
	}
	
	
	
	void length(int length) {                                                                                    // getting numbers length method
		getlength(length);         																		         // code block in job class
		System.out.println("its length is :" + numberlength);                                                    // simple user friendly 
	}


		
	}
//---------------------------------------------------------------------------------------------------------------------------------    END OF WORKING
	public class Palindrome {
		
		public static void main(String[] args) {
			
			System.out.println("welcome to Palindrome test application \n--------------------------------------------------------------------------------------" );
			
			
			working ko = new working();                                                                          // getting a number
			System.out.println("your number is:" + ko.base);                                                     // simple user friendly 
			
			ko.length(ko.base);                                                                                  // getting length of the number
			ko.rotation(ko.base);                                                                                // getting your numbers rotation and save it with you object
			
			if(ko.Palindrometest()) {                                                                            // if its polindrome its rue and else its false
				System.out.println("the number you its POLINDROME.");
				System.out.println(":)");
			}else {
				System.out.println("the number you its not  POLINDROME.");
				System.out.println(":(");
			}
		}
		
	}