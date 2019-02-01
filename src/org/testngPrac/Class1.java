package org.testngPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {

@Test(dataProvider = "res", groups={"Smoke"})
private void test1(String s1[]) 
{System.out.println("method1");
	System.out.println(s1[0]);
	System.out.println(s1[1]);
	System.out.println(s1[2]);
}
@DataProvider(name = "res")
public Object[][] data(){
return new Object[][] {{"nits","hi","a"},{"subbu","hello","b"},{"bha","bye","c"}};
}
@Test(groups= {"Smoke"})
private void test2() {
	System.out.println("Test2");

}
@Test(groups= {"Reg","Smoke"})
private void test3() {
	System.out.println("Test3");

}
}


