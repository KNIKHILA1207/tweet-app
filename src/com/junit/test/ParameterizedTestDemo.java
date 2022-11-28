package com.junit.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
	

	@ParameterizedTest(name ="{index} - Run with args = {0}")
	@ValueSource(ints = {1,5,3,7})
	public void valueSourceTest(int args) {
		System.out.println(args);
	}
	
	enum TV{
		LG,Samsung,Toshiba;
	}
	@ParameterizedTest
	@EnumSource(TV.class)
	public void enumSourceTest(TV tv) {
		System.out.println(tv);
	}
	
	private static String[] cars() {
		return new String[] {"Maruthi","Honda","Hyundai"};
	}
	
	@ParameterizedTest
	@MethodSource("cars")
	public void methodSourceTest(String cars) {
		System.out.println(cars);
	}
	
	@ParameterizedTest
	@CsvSource({"Nithin","Nikhila","Vinusha","Vinaya"})
	public void csvSourceTest(String name) {
		System.out.println(name);
	}

}
