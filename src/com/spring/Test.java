package com.spring;

import java.io.*;

public class Test {

	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int num = Integer.valueOf(bf.readLine());
			for(int i= 0;i < num;i++ ){
				System.out.println(findFirstChar(bf.readLine()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bf != null){
				try {
					bf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static char findFirstChar(String input){
		int[] myHashMap = new int[265];
		for(int i = 0;i < input.length();i++){
			myHashMap[(input.charAt(i)) - '0']++;
		}
		
		for(int i = 0;i < input.length();i++){
			if(myHashMap[(input.charAt(i)) - '0'] == 1){
				return input.charAt(i);
			}
		}
		return '0';
	}
	
	
	

}
