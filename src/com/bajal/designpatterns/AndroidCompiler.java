package com.bajal.designpatterns;

public class AndroidCompiler extends CrossCompiler {
	
	@Override
	protected void collectSource() {
		System.out.println("Android CollectSource");
	}

	@Override
	protected void compileToTarget() {
		System.out.println("Android compileToTarget");
	}
	
}