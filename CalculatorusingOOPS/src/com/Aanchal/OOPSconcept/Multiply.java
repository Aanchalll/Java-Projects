package com.Aanchal.OOPSconcept;

public class Multiply implements Operate {

	@Override
	public Double getResult(Double... numbers) {
		Double res=1.0;
		for(Double num:numbers) {
			res*=num;
		}
		return res;
	}

}
