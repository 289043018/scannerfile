package com.hand.scannerfile;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        printfile(new File("../scannerfile"),1);
    }
    public static void printfile(File F,int tab){
    	if(F.isDirectory()){
    		File next[] = F.listFiles();
    		for (int i = 0; i < next.length; i++) {
    			for (int j = 0; j < tab; j++) {
					System.out.print("|--");
				}
    			System.out.println(next[i].getName());
				if(next[i].isDirectory()){
					printfile(next[i],tab++);
				}
			}
    	}
    }
}
