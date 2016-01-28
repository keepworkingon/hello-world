package com.spring;

import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        
    }
    
    
    public static int findAlcalde(List<Connection> input,int peopleNum){
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for(int i = 0;i < input.size();i++){
    		if(map.containsKey(input.get(i).getTo())){
    			map.put(input.get(i).getFrom(), map.get(input.get(i).getFrom()) + 1);
    		}else{
    			map.put(input.get(i).getFrom(), 1);
    		}
    	}
    	
    	//遍历map 找到被认识人为peopleNum的人
    	//验证这个人认识的人数，如果在map中找不到这个人，说名这个人复合要求，返回其编号即可！
    	
    	
    	return 0;
    }
    
    class Connection{
    	int from;
    	int to;
    	public int getFrom() {
			return from;
		}
		public void setFrom(int from) {
			this.from = from;
		}
		public int getTo() {
			return to;
		}
		public void setTo(int to) {
			this.to = to;
		}
		
    	Connection(int from,int to){
    		this.from = from;
    		this.to = to;
    	}
    }
    
    
}
