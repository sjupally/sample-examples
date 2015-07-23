package com.example;

public class TryCatch {
	public static void main(String[] args) {
		TryCatch tryCatch = new TryCatch();
		System.out.println(tryCatch.getTryCatch());
	}
	
	public int getTryCatch(){
		try {
			System.out.println("try");
			System.exit(0);
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch");
			return 1;
		}finally{
			System.out.println("finally");
			return 2;
		}
		
	}
}
