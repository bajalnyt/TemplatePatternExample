package com.bajal.designpatterns;

public class IphoneCompiler extends CrossCompiler {
	
	@Override
	protected void collectSource() {
		System.out.println("iphone collectSource");
	}

	@Override
	protected void compileToTarget() {
		System.out.println("iphone compileToTarget");
	}
	
}