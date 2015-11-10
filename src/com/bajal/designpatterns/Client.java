package com.bajal.designpatterns;

public class Client {
	public static void main(String[] args) {
		
		CrossCompiler iphone = new IphoneCompiler();
		iphone.crossCompile();
		
		CrossCompiler android = new AndroidCompiler();
		android.crossCompile();

	}
}
