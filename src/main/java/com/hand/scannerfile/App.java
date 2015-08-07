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
        System.out.println( "Hello World!" );
    }
    public void printfile(File F){
    	if(F.isDirectory()){
    		File next[] = F.listFiles();
    		for (int i = 0; i < next.length; i++) {
				if(next[i].isFile()){
					System.out.println(next[i].getName());
				}
			}
    	}
    }
}
