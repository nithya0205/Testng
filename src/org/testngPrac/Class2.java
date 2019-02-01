package org.testngPrac;

import java.awt.image.RescaleOp;

import org.testng.annotations.Test;

public class Class2 {
		@Test(dataProvider = "res" , dataProviderClass = Class1.class,groups= {"Smoke"})
		private void test11(String txt1 , String Text2,String txt3) {
			System.out.println(txt1+","+Text2+","+txt3);
		}
		@Test
		private void test12() {
			System.out.println("test12");
		}
		@Test
		private void test13() {
			System.out.println("test13");
		}
		@Test
		private void test14() {
			System.out.println("test14");
		}
}

