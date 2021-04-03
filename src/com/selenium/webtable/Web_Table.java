package com.selenium.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automation.practice.BaseClass;

public class Web_Table extends BaseClass{
	
	public static void main(String[] args) {
		
		toLaunchBrowser("chrome");
		
		toLaunchUrl("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		
		//toMaximize();
		
		System.out.println("*******ALL DATA******");
		
		List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for (WebElement data : alldata) {
			
			String text = data.getText();
			
			System.out.println(text);
		
		}
		
		System.out.println("******Particular data*****");
		
		WebElement data = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]"));
		System.out.println(data.getText());
			
		
		System.out.println("******Row data******");
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
		
		for (WebElement rdata : rowdata) {
			
			String value = rdata.getText();
			System.out.println(value);
			
		}
		
		System.out.println("**********Column Data********");
		List<WebElement> cdata = driver.findElements(By.xpath("//table/tbody/tr/td[5]"));
		
		for (WebElement column : cdata) {
			
			String val = column.getText();
			System.out.println(val);
			
		}
	}
	
	
	
	

}
