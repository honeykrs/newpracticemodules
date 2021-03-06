package com.resources.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

	/*
	 * Utility class for defining all methods
	 */

	public class Utility 
	{
		static Scanner sc = new Scanner(System.in);
		static Random rand = new Random();
		  static int count1=1;
		  static int count2=0;

		
		public static void main(String[] args)
		{
			
	  Utility.findAnaPrime(100, 200);
			
		}
		
		
		public static char getChar()
		{
		  char ch = sc.next().charAt(0);
		  return ch;
		}
		
		/**
		 * Method to get a word from User
		 * @return
		 */
		public static String getStringAsWord()
		{
			String st = sc.next();
			return st;
		}
		
		/**
		 * Method to get a line from User
		 * @return
		 */
		public static String getStringAsLine()
		{
			String st = sc.nextLine();
			return st;
		}
		
		
		
		/**
		 * A Method to take Int type as an input
		 * @return
		 */
		
		public static int getInt()
		{
		    int	i = sc.nextInt();
			return i;	
		}
		
		public static double getDouble()
		{
		    double	i = sc.nextDouble();
			return i;	
		}
		
		/**
		 * Method to take number of elements for an 1D array
		 * @return
		 */
	   
		public static int noOfInputs()
		{
			int i = sc.nextInt();
			return i;
		}
		
		public static int[] createArray(int n)
		{
			int i;
			int[] arr = new int[n];
			System.out.println("Enter "+ n + " Elements: ");
			for(i=0 ; i<n ; i++)
			{
				arr[i] = getInt();
			}
			return arr;
			
		}
		
		public static String[] createStringArray(String line) 
		{
			String[] words = line.split(" ");
			
			return words;
		}
		
		/**
		 * Method to store Elements of an 1D array
		 * @param array
		 * @return
		 */
		
		public static int[] arrayElements(int[] array)
		{
			int i;
			for(i=0 ; i<array.length;i++)
			{
			  array[i] = sc.nextInt();
			}
			return array;	
		}
		
		/**
		 * Method to Add elements to 2-D array
		 * @param array
		 * @param rowLimit
		 * @param colmLimit
		 * @return
		 */
		
		public static int[][] twoDArrayElements(int[][] array,int rowLimit,int colmLimit)
		{
			int i,j;
			System.out.print("Enter Elements: ");
			for(i=0 ; i<rowLimit ; i++)
			{
				for(j=0 ; j<colmLimit ; j++)
				{
					array[i][j] = sc.nextInt();
				}
			}
			return array;	
		}
		
		/**
		 *Method to print elements of 2-D array 
		 * @param matrix
		 * @param rowLimit
		 * @param colmLimit
		 */
		public static void display2DElements(int[][] matrix,int rowLimit,int colmLimit)
		{
		 System.out.print("Elements in array is: ");
		 System.out.println("");
		 int i,j;
			for(i=0 ; i<rowLimit ; i++)
			{
				for(j=0 ; j<colmLimit ; j++)
				{
				System.out.print(matrix[i][j]+" ");	
				}
				System.out.println();
			}	
	     
		}
		
		/**
		 * Method to display elements of 1D array
		 * @param array
		 */
		
		public static void displayElements(int[] array)
		{
			System.out.print("Elements in array is: ");
			for(int i=0 ; i<array.length ; i++)
			{
				System.out.print(array[i]+ " ");
			}
			System.out.println(" ");
		}
		
		/**
		 * Method to find triplet with sum 0
		 * @param array
		 */
		
		public static void findTriplets(int[] array)
		{
			int i,j,k;
			boolean find = false;
			
			for(i=0;i<array.length-2;i++)
			{
				for(j=i+1;j<array.length-1;j++)
				{
					for(k=j+1;k<array.length;k++)
					{
						if(array[i] + array[j] + array[k] == 0)
						{
							find = true;
							System.out.println("[" + array[i] + "," + array[j] + "," + array[k] + "]");
						}
					}

				}

			}
			if(find==false)
				System.out.println("not found");
				
		}
		
		/**
		 * Method to find permutations of a String
		 * @param st
		 * @param first
		 * @param last
		 */
		
		public static void findPermutations(String st, int first , int last)
		{
		  
		  if(first == last)
		  {
			  System.out.println(count1 + " "+ st);
			  count1++;
		  }
		  else
		  {
			  for(int i = first ; i <= last ;i++)
			  {
				  st = swap(st,first,i);
				  findPermutations(st,first+1,last);
				  st = swap(st,first,i);
			  }
		  }
			
		}
		/**
		 * Method to swap character in a String
		 * @param st
		 * @param i
		 * @param j
		 * @return
		 */
		
		public static String swap(String st,int i,int j)
		{
			 char temp; 
		        char[] charArray = st.toCharArray(); 
		        temp = charArray[i] ; 
		        charArray[i] = charArray[j]; 
		        charArray[j] = temp; 
		        return String.valueOf(charArray);
		}
		
		/**
		 * Method to represent an Quadratic Equation
		 * @param a
		 * @param b
		 * @param c
		 */
		
		public static void representQuadratic(int a , int b , int c)
		{
			System.out.println(a+"x`2 "+"+ "+b+"x "+"+ "+c);
		}
		
		public static int[] findRoots(int a , int b , int c)
		{
			double delta = b*b + 4*a*c;
			int root1 = (int)(-b + Math.sqrt(delta))/(2*a);
			int root2 = (int)(-b - Math.sqrt(delta))/(2*a);
			
			return new int[] {root1,root2};
		}
		
		/**
		 * Method to calculate number of wins
		 * @param stack
		 * @param target
		 * @param bet
		 * @return
		 */
		
		
		public static int calWins(int stack,int target,int bet)
		{
			int loss=0,win=0,turns=0;
			
			while(stack>=0 && stack<=target)
			{

				int flag = rand.nextInt(2);
				if(flag==0)
				{
				  stack = stack - bet;
				  ++loss;	  
				}
				else
				{
					stack = stack + bet;
					++win;
				}	
			}
			
			turns = loss + win;
			
			calPercentage(win,loss,turns);
			
			return win;
		}
		
		/**
		 * Method to calculate percentage
		 * @param win
		 * @param loss
		 * @param turns
		 */
		public static void calPercentage(int win,int loss,int turns)
		{
			double winPercent = (double)(win*100/turns);
			double lossPercent = (double)(loss*100/turns);
			
			System.out.println("WIN Percentage: "+ winPercent);
			System.out.println("LOSS Percentage: "+ lossPercent);
		}
		
		/**
		 * Method to check if two strings are Anagrams
		 * @param st1
		 * @param st2
		 * @return
		 */
		
		public static boolean checkAnagram(String st1 , String st2)
		{   
			int[] charValueStore1 = new int[26];
			int[] charValueStore2 = new int[26];
			int i;
			boolean flag = false;
			for(i=0 ; i<st1.length() ; i++)
			{
				charValueStore1[(int)st1.charAt(i)-97]++;
				charValueStore2[(int)st1.charAt(i)-97]++;
				
			}
			
			for(i=0 ; i<charValueStore1.length;i++)
			{
				if(charValueStore1[i]== charValueStore2[i])
				{
			      flag = true;		
		     	}
			}
			if(flag)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		
		/**
		 * Method to print all prime numbers in a range
		 * @param range
		 */
		
		public static void printAllPrimes1(int range)
		{
		 int index=3,i=1;	
		 boolean flag = true;
		  while(index!=range)
		  {
			  for(i=2; i<index ; i++)
			  {
				  if(index%i == 0)
				  {
					  flag = false;
				  }
				 
				  
			  }
			  if(flag)
			  {
				  System.out.println(index);
			  }
			  flag = true;
			  index++;
		  }
		}
		  
		  public static void printAllPrimes2(int n)
		  {   
			  String[] primes = new String[n];
		      int ncounter = 0;
		      int isPrime = 2;
		      while( ncounter < n){
		        boolean prime = true;
		        for (int j=2; j<isPrime; j++){
		          if (isPrime%j ==0){
		            prime = false;
		            break;
		          }
		        }
		        if (prime){
		          primes[ncounter] = ""+isPrime;
		          ncounter++;
		        } 
		        isPrime++;
		       }
			 
			  printAnaPalinNums(primes);
		  }
		  
		  /**
		   * Method to check Prime number
		   * @param num
		   * @return
		   */
		  public static boolean checkPrime(int num)
		  {
			  int i;
			  for(i=2 ; i<num ;i++)
			  {
				  if(num%i==0)
					  return false;
			  }
			  
			  return true;
		  }
		  
		  /**
		   * Method to check  Print numbers which are Prime , Palindrome and Anagram
		   * @param st
		   */
			
		 public static void printAnaPalinNums(String[] st)
		 {
			 boolean flag = false;
			 for(int i=0 ; i<st.length-1 ; i++)
			 {
				 for(int j=i+1 ; j<st.length ; j++)
				 {
					 if(checkAnagrams(st[i],st[j]) && checkPalindrome(st[i],st[j]))
					 {
						 System.out.println("["+st[i]+","+st[j]+"]");
						 flag = true;
						 
					 }
				 }
			 }
			 if(flag==false)
			 {
				 System.out.println("not found");
			 }
		 }
		  /**
		   * Method to check palindrome
		   * @param st1
		   * @param st2
		   * @return
		   */
		 public static boolean checkPalindrome(String st1, String st2)
			{
			 int length1 = st1.length();
				int length2 = st2.length();
				
				if(length1 != length2)
					return false;
				
				int length = length1;
				
				char[] ch1 = st1.toCharArray();
				char[] ch2 = st2.toCharArray();
				int length3 = length-1;
				 if(length%2 != 0)
				 {
					 if(ch1[(length/2)] == ch2[(length/2)])
							 {
						       for(int i=0 ; i<length ; i++)
						       {
						    	   if(ch1[i] == ch2[length3--])
						    		   return true;
						       }
							 }
				 }
					 else
					      {
						 for(int i=0 ; i<length ; i++)
					       {
					    	   if(ch1[i] == ch2[length3--])
					    		   return true;
					       }
						 
					      }
					 
					return false;
					
			}
		 
		 /**
		  * Method to check Anagram when your string is number type
		  * @param st1
		  * @param st2
		  * @return
		  */
		 
		 public static boolean checkAnagrams(String st1 , String st2)
			{   
			  if(st1.length() != st2.length())
			  {
				  return false;
			  }
				st1=sort(st1);
				st2=sort(st2);
				
				boolean t=check(st1,st2);
				if(t==true)
				{
				 return true;
		     	}
				 else
					 return false;
			}
		    
			/**
			 * Method to sort a string	
			 * @param s
			 * @return
			 */
			static String sort(String s)
			{
			 char ch[]=s.toCharArray();
			 for(int i=0;i<s.length();i++)
			 {
			   for (int j =i+1;j<ch.length; j++)
			    {
				 if(ch[i]>ch[j])
			      {
			       char t=ch[i];
			       ch[i]=ch[j];
			       ch[j]=t;
			      }
			    }
			 }
			  String s1=new String(ch);
			  return s1;
			}
			
			/**
			 * Method to check palindrome
			 * @param s1
			 * @param s2
			 * @return
			 */
			static boolean check(String s1, String s2)
			{
			  for(int i=0;i<s1.length();i++)
			   {
			    if(s1.charAt(i)!=s2.charAt(i))
			     {
			      return false;
			     }
			   }
			   return true;
			}


		 /**
		  * Method to check Anagram if your string is number type
		  * @param st1
		  * @param st2
		  * @return
		  */
		 public static boolean checkAnagramNumsxxxx(String st1 , String st2)
		 {
			 int[] charValueStore1 = new int[10];
				int[] charValueStore2 = new int[10];
				int i;
				boolean flag = false;
				for(i=0 ; i<st1.length() ; i++)
				{
					charValueStore1[(int)st1.charAt(i)-48]++;
					charValueStore2[(int)st1.charAt(i)-48]++;
					
				}
				
				for(i=0 ; i<charValueStore1.length;i++)
				{
					if(charValueStore1[i]== charValueStore2[i])
					{
				      flag = true;		
			     	}
				}
				if(flag)
				{
					return true;
				}
				else
				{
					return false;
				}
				
		 }
		 
		 /**
		  * Method to calculate number of notes
		  * @param amount
		  */
		 public static void numberOfNotes(int amount)
		 {
			 int i,count = 0,countnotes=0,countChange=0;
			 int[] notes = new int[] {1000,500,100,50,10,5,2,1};
			 int[] countNotes = new int[8];
			 
			 for(i=0 ; i<countNotes.length ; i++)
			 {
				 if(amount > notes[i])
				 {
					 countNotes[i] = amount/notes[i];
					 amount = amount - notes[i]*countNotes[i];
					 
					 if(notes[i] > 5 && countNotes[i]!=0)
					 {
						countnotes = countnotes + countNotes[i]; 
						
					 }
					 
					 if(notes[i]<10 && countNotes[i]!=0)
					 {
						 countChange = countChange + countNotes[i]; 	 
					 }
				 }
			 }
			 printNoOfNotes(notes,countNotes);
			 System.out.println("Minimum number of notes is "+ minimumNotes(countnotes));
			 System.out.println("Change which you get is "+ getChange(countChange));

		 }
		 
		 /**
		  * Method to return change amount
		  * @param countChange
		  * @return
		  */

		public static int getChange(int countChange)
		{
		  return countChange;	
		}
        
		/**
		 * Method to print number of notes
		 * @param notes
		 * @param countNotes
		 */
		public static void printNoOfNotes(int[] notes, int[] countNotes) 
		{
		  int i;
		  for(i=0 ; i < countNotes.length ; i++)
		  {
			  if(countNotes[i] != 0)
			  {
				  System.out.println(notes[i] + "  Rupees notes : " + countNotes[i]);
			  }
		  }
			
		}
		
		/**
		 * Method to return minimum number of notes
		 * @param count
		 * @return
		 */
		
		public static int minimumNotes(int count)
		{
			return count;
		}
		
		/**
		 * Method to find the day of the week for a given date
		 * @param day
		 * @param month
		 * @param year
		 * @return
		 */
		
		public static int findDay(int day,int month,String year)
		{
			int result = 0;
			String YearLastTwo = extractYearLastTwo(year);
			int newIntYearL = Integer.parseInt(YearLastTwo);
			
			String YearFirstTwo = extractYearLastTwo(year);
			int newIntYearF = Integer.parseInt(YearFirstTwo);
			
			if(month>0 && month<3)
			{
				month = month+10;
			}else
				if(month>2 && month<13)
				{
					month = month - 2;
				}
			
            int x = (13*month - 1/5);
            int y = (newIntYearL/4);
            int z = (newIntYearF/4);
            
           result = ((day + x + newIntYearL + y + z + 2 * newIntYearF) % 7) ;
           
           return result;
			
		}
		
		/**
		 * Method to extract last two indices of the year
		 * @param year
		 * @return
		 */
	    
		public static String extractYearLastTwo(String year)
		{
			String remain = "";
			remain = year.substring(2, year.length());
			
			return remain;
		}
		
		/**
		 * Method to extract first two indices of the year
		 * @param year
		 * @return
		 */
		
		public static String extractYearFirstTwo(String year)
		{
			String remain = "";
			remain = year.substring(0,3);
			
			return remain;
		}
        
		/**
		 * Method to decide day of the week
		 * @param res
		 * @return
		 */
		public static String decideDay(int res) 
		{
          switch(res)
          {
          case 0: return "Sunday"; 
          
          case 1: return "Monday"; 
          
          case 2: return "Tuesday"; 
          
          case 3: return "Wednesday"; 
          
          case 4: return "Thrusday"; 
          
          case 5: return "Friday"; 
          
          case 6: return "Saturday"; 
          }
		return "Wrong Data";
		}
		
		/**
		 * Method to print instructions for Temperature conversion 
		 */

        public static void printInstructions1()
        {
        	System.out.println("Enter a temperature scale ");
            System.out.println("You have two choices : Celcius and Fahrenheit ");
            System.out.println(" ");
            System.out.println("Enter C if you want to convert celsius to Fahrenheit or F for vice-versa: ");
        }
        
        /**
         * Method for Temperature Conversion
         * @param ch
         * @param temp
         */
		public static void convertTemp(char ch,int temp)
		{  
			//Celsius to Fahrenheit
			if(ch == 'C')
			{
			  int fahrenheit = (temp * 9/5) + 32 ;
			  System.out.println("Temperature in Fahrenheit: "+ fahrenheit + " F*"); 
			}
			else
			{   
				//Fahrenheit to Celsius
				int celsius = (temp - 32) * 5/9;
				System.out.println("Temperature in Celsius: "+ celsius + " C*"); 

			}
			
		}


		public static int[] insertionSort(int[] arr)
		{
		  int i,value=0,index=0;
		  
		  for(i=1 ; i< arr.length ; i++)
		  {
			  value = arr[i];
			  index = i-1;
			  
			  while(index>=0 && arr[index]>value)
			  {
				  
				  arr[index+1] = arr[index];
				  index--;
			  }
			  arr[index+1] = value;
		  }
          
			displayElements(arr);
			return arr;
		}


		public static String[] insertSortSentence(String[] arr)
		{
			int i;
			String value="";
			int index=0;
			  
			  for(i=1 ; i< arr.length ; i++)
			  {
				  value = arr[i];
				  index = i-1;
				  
				  while(index>=0 && arr[index].compareToIgnoreCase(value)>0)
				  {
					  
					  arr[index+1] = arr[index];
					  index--;
				  }
				  arr[index+1] = value;
			  }
	          
				displayStrArrEle(arr);
			    
				return arr;
		}
        
		/**
		 * Display String a
		 * @param arr
		 */

		 public static void displayStrArrEle(String[] arr)
		{
			int i;
			System.out.println("Your sorted String elements are: ");
			for(i=0 ; i< arr.length ; i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println(" ");
			
		}
         
		 /**
		  * Method to find total Attempts to find all coupon numbers
		  * @param coupans
		  * @return
		  */

		public static int findTotalAttempts(int[] coupans)
		{
			
			int i,count=0;
			int last = coupans.length;
			while(last>0)
			{
				int x = rand.nextInt(10);
			  for(i=0 ; i<last ; i++)
			  {
				  count++;
				 
				 if(x == coupans[i])
				 {   
					 
					 coupans[i] = coupans[last-1];
					 last--;
			         break;
				 }
				 
			  }
			 
			}
			return count;
			
		}
        
		/**
		 * Binary Search for String type
		 * @param array
		 * @param low
		 * @param high
		 * @param word
		 * @return
		 */

		public static int binarySearchS(String[] array, int low, int high, String word) 
		{
			
			if(low>high)
			{
				return -1;
			}
			int mid = (low+high)/2;
			
			if(array[mid].equalsIgnoreCase(word))
			{
				return mid;
			}
			
			if(word.compareToIgnoreCase(array[mid]) <0)
			{
				return binarySearchS(array , low , mid-1 , word);
			}
			else
			{
				return binarySearchS(array , mid+1 ,high , word);
			}
			
		}
         
		/**
		 * Binary Search method for Integer type
		 * @param nums
		 * @param low
		 * @param high
		 * @param find
		 * @return
		 */

		public static int binarySearch(int[] nums, int low, int high, int find)
		{
			if(low>high)
			{
				return -1;
			}
			
			int mid = (low+high)/2;
			
			if(nums[mid]==find)
			{
				return mid;
			}
			
			if(find < nums[mid])
			{
				return binarySearch(nums,low,mid-1,find);
			}
			else
			{
				return binarySearch(nums,mid+1,high,find);
			}
		}

        /**
         * Find missing deadline time and completion time for 3 tasks
         * @param sortedDeadLines
         */
		public static void findCompletionTime(int[] sortedDeadLines)
		{
			int i , count = 0,c1=0,c2=0,c3=0;
			int[] temp = new int[sortedDeadLines.length];
			
			for(i=0 ;i< sortedDeadLines.length ; i++)
			{
				temp[i] = sortedDeadLines[i];
			}
			
			while(true)
			{   
				
				if(sortedDeadLines[0] != 0)
				{

					if(sortedDeadLines[0] == 1)
					{
						c1 = count;
					}
					sortedDeadLines[0]--;
					c1++;
					count++;
					
				}
				
				
				
				if(sortedDeadLines[1] != 0)
				{
					if(sortedDeadLines[1] == 1)
					{
						c2 = count;
					}
					
					sortedDeadLines[1]--;
					c2++;
					count++;
					
					
				}
				
				
				
				if(sortedDeadLines[2] != 0)
				{
					if(sortedDeadLines[2] == 1)
					{
						c3 = count;
					}
					sortedDeadLines[2]--;
					c3++;
					count++;
					
					
				}
				
				
				
				if(sortedDeadLines[0] == sortedDeadLines[1] && sortedDeadLines[1] == sortedDeadLines[2] && sortedDeadLines[0]== 0)
				{
					break;
				}
			}
			System.out.println("count: "+count);
			System.out.println("Completion time for Task 1: "+c1);
			System.out.println("Completion time for Task 2: "+c2);
			System.out.println("Completion time for Task 3: "+c3);
			System.out.println(" ");
			System.out.println("Deadline missed by  Task 1: "+ (c1-temp[0]));
			System.out.println("Deadline missed by  Task 2: "+ (c2-temp[1]));
			System.out.println("Deadline missed by  Task 3: "+ (c3-temp[2]));

			
		}
		
		/**
		 * Method to convert Decimal to binary
		 * @param n
		 * @return
		 */
		
		public static String toBinary(int n)
		{
			String bin="";
			
			while(n>0)
			{
			  int r=n%2;
			  bin=r+bin;
			  n=n/2;
			}
			return bin;
		}

        /**
         * Method to find a new number using a number
         * @param num
         * @return
         */
		public static int createNew(int num)
		{
			return ((num & 0x0F) << 4 | (num & 0xF0) >> 4);
			
		}

        /**
         * Method to calculate monthly payment
         * @param P
         * @param Y
         * @param R
         * @return
         */
		public static int calPayment(int P, int Y, int R) 
		{
			int payment = 0;
			payment = (P*R*Y)/100;
			
			int months = Y*12;
			
			int monPay = P/months;
			int monPayWithIn = monPay + (payment/months);
			
			return monPayWithIn;
		}

        /**
         * Method to calculate power
         * @param i
         * @param n
         * @return
         */
		public static int power(int i, int n) 
		{
			int pow = 1;
			
			do {
				
				pow = pow*i;
				n--;
			}while(n!=0);
			
			return pow;
		}
		
		/**
		 * Method to calculate Square Root using Newton Method
		 * @param c
		 * @return
		 */
		public static double calNewtonSqrt(double c)
		{
			// relative error tolerance
			double epsilon = 1e-15; 
			 // estimate of the square root of c
	        double t = c;             

	        // repeatedly apply Newton update step until desired precision is achieved
	        while (Math.abs(t - c/t) > epsilon*t) {
	            t = (c/t + t) / 2.0;
	        }
	        return t;
		}

         /**
          * Method to search element
          * @param low
          * @param high
          * @return
          */
		 public static int search(int low, int high)
		 {
			 
		  if ((high - low) == 1) 
		   {
		     return low;
		   }
		  
		   int mid = low + (high - low) / 2;
		     
		   System.out.println("Is it less than " + mid );
		  
		   if (sc.nextBoolean()) 
		   {
		     return search(low, mid);
		   }
		   else
		   {
		      return search(mid, high);
		   }
		 }


		public static int[] stringToNumArray(String[] st) 
		{
			int n = st.length;
			int[] num = new int[n];
			for(int i = 0 ; i < st.length ; i++)
			{
				num[i] = Integer.parseInt(st[i]);
			}
			
			return num;
		}


		public static void validate(int customers) 
		{
			if(customers<1)
			{
				System.out.println("Customers can never be 0 or less. Try again !!");
			}
		}
		 
		 
		 
		 
		 
		public static int[] findPrime(int s1 , int s2)
		{
			 int count=0, flag = 0, i, j,k=0;
			 int[] prime = new int[30];
	         Scanner s = new Scanner(System.in);
	         
	         
	         for(i = s1; i <= s2; i++)
	         {
	             for( j = 2; j < i; j++)
	             {
	                 if(i % j == 0)
	                 {
	                     flag = 0;
	                     count++;
	                     break;
	                 }
	                 else
	                 {
	                     flag = 1;
	                 }
	             }
	             if(flag == 1)
	             {
	                 prime[k++] = i;
	             }
	             
	            
	         }
	         int[] allPrimes = new int[countPrime(s1,s2)];
             
             for(i=0 ; i < countPrime(s1,s2) ; i++)
             {
            	 if(prime[i]!=0)
            	 {
            		 allPrimes[i] = prime[i];
            	 }
             }
	         return allPrimes;
	    }
		
		public static int countPrime(int s1 , int s2)
		{
			 int count=0, flag = 0, i, j,k=0;
			 int[] prime = new int[30];
	         Scanner s = new Scanner(System.in);
	         
	         
	         for(i = s1; i <= s2; i++)
	         {
	             for( j = 2; j < i; j++)
	             {
	                 if(i % j == 0)
	                 {
	                     flag = 0;
	                     
	                     break;
	                 }
	                 else
	                 {
	                     flag = 1;
	                 }
	             }
	             if(flag == 1)
	             {
	            	 count++;
	                 prime[k++] = i;
	             }
	         }
	         return count;
	    }


		public static int[] findAnaPrime(int ii, int jj) 
		{
			int[] primes = Utility.findPrime(ii, jj);
			int n = primes.length;
			
			String[] newPrimes = new String[n];
			for(int k = 0 ; k < primes.length ; k++)
			{   
			  	newPrimes[k] = ""+ primes[k];
			}
			
			String[] anaPrimes = new String[n];
			int h = 0;

			for(int i = 0 ; i< newPrimes.length-1 ; i++)

			{
				for(int j=i+1 ; j< newPrimes.length-1; j++)
				{ 
				   if(Utility.checkAnagrams(newPrimes[i] ,newPrimes[j]))
				   {
					   anaPrimes[h++] = newPrimes[i];
					   anaPrimes[h++] = newPrimes[j];

				   }
				 
			    }
			}
			int[] converted = new int[anaPrimes.length];
			
			for(int g=0 ; g<anaPrimes.length ; g++)
			{
				if(anaPrimes[g] != null)
				 converted[g] = Integer.parseInt(anaPrimes[g]);
			}
			
			return converted;
			
			
		}


		public static int findDay(int month, int day, int year)
        {
			 int y = year - (14 - month) / 12;
		        int x = y + y/4 - y/100 + y/400;
		        int m = month + 12 * ((14 - month) / 12) - 2;
		        int d = (day + x + (31*m)/12) % 7;
		        return d;
		}
	     
		 public static boolean isLeapYear(int year) 
		 {
		        if  ((year % 4 == 0) && (year % 100 != 0)) 
		        {
		        	return true;
		        }
		        if  (year % 400 == 0)
		        {
		        	return true;
		        }
		        return false;
		    }


		public static void bubbleSort(int[] num) 
		{
		  
			int i , j;
			
			for(j=0 ; j < num.length-1 ; j++)
			{
				for(i=0 ; i< num.length-1 ; i++)
				{
					if(num[i] > num[i+1])
					{
						int temp = num[i];
						num[i] = num[i+1];
						num[i+1] = temp;
					}
				}
			}
			for(i=0 ; i<num.length ; i++)
				System.out.print(num[i]+" ");
		}
		
		public static void getNewString(String INPUT)
		{
			String REGEX1 = "<<name>>";
			 String REGEX2 = "<<full name>>";
			 String REPLACE1 = "Honey";
			 String REPLACE2 = "Honey Kumar Singh";
			 
			 String REGEX3 = "91­xxxxxxxxxx";
			 String REPLACE3 = "6376743232";
			 String REGEX4 = "01/01/2016";

		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		   LocalDateTime now = LocalDateTime.now(); 
		   String REPLACE4 = String.valueOf(dtf.format(now));
            

	      Pattern p = Pattern.compile(REGEX1);
	      //get a matcher object
	      Matcher m = p.matcher(INPUT);
	      INPUT = m.replaceAll(REPLACE1);
	     
	     
	      Pattern p2 = Pattern.compile(REGEX2);
	      Matcher m2 = p2.matcher(INPUT);
	      INPUT = m2.replaceAll(REPLACE2);
	      
	      

	      Pattern p3 = Pattern.compile(REGEX3);
	      Matcher m3 = p3.matcher(INPUT);
	      INPUT = m3.replaceAll(REPLACE3);
	     
	      
	      
	      Pattern p4 = Pattern.compile(REGEX4);
	      Matcher m4 = p4.matcher(INPUT);
	      INPUT = m4.replaceAll(REPLACE4);
	      System.out.println(INPUT);
		}


		public static void getStockData(int n) 
		{
			String[] name = new String[n];
			 int[] noOfShare = new int[n];
			 int[] price = new int[n];
			 
			 for(int i = 0 ; i < n ; i++)
			 {   
				 System.out.println("Enter name: ");
				 name[i] = sc.next();
				 System.out.println("Enter number of shares you own: ");
				 noOfShare[i] = sc.nextInt();
				 System.out.println("Enter Price of one share: ");
				 price[i] = sc.nextInt();
				 
				 System.out.println();
			 }
			 
			 long total = 0;
			 System.out.println("***STOCK  REPORT***");
			 for(int i = 0 ; i< n ; i++)
			 {
				 System.out.println(name[i]+" owns shares of amount "+(noOfShare[i]*price[i])+ " Rs");
				 total += (noOfShare[i]*price[i]);
			 }
			System.out.println("Total Price: "+total+" Rs");
		}
	}
		
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

