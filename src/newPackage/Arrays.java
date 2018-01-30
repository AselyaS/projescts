package newPackage;

import java.util.Scanner;

public class Arrays {

	// happy birthday Simon!!! smile:)
		    public static void main(String[] args){
		    	NumArray();
		    	
		    }
		    	public static void NumArray() {
		    int fixed=2;
		    int temp,i;
		    int [] array = {23,15,10,8,75,80,27,58};
		    System.out.println(array.length);
		 while(fixed==2) {
			 fixed=3;
	    for(i=0 ;i<array.length-1; i++) {
	    	if(array[i]>array[i+1]) {
	    		temp=array[i+1];
	    		array[i+1]=array[i];
	    		array[i]=temp;
	    		fixed=2;
	    	}}
	    }
	    	for( i=0;i<array.length; i++)
	    	{
	    		System.out.println("this is ordered array "+ array[i]);
	    	}
	    }
		    	}
//		    	public static void StringArray() {
//		    		String [] saraay= {"Ion","Mihail","Asseli","Roman","Kate"};
//		    		
//		    		
//		    		
//		    	}
//	    }
//		    