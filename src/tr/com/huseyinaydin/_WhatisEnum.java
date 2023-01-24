package tr.com.huseyinaydin;

/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/
enum Status{
	Running, Failed, Pending, Success;
}

public class _WhatisEnum {
    public static void main(String[] args) {

    	int i=5;
//    	Status s= Status.Running;
//    	Status s= Status.Failed;
//    	Status s= Status.NoIdea;
//    	Status s= Status.Success;
    	
//    	System.out.println(s);
//    	System.out.println(s.ordinal());
    	
    	Status[] ss=Status.values();
    	System.out.println(ss);
    	
    	for(Status s:ss)
    	{
    		System.out.println(s);
    		System.out.println(s+" : "+s.ordinal());
    	}
    	
    	
        
    }
}/**
*
@author Huseyin_Aydin
@since 1994
@category Java SE(Java Standart Edition) 17
*
**/

