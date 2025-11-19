package com.coverFox.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	//getScreenshot
	public static void getScreenshot(WebDriver driver, String fileName) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir");
		String timeStamp = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss").format(new Date());
		File dest = new File(path + "\\screenShot\\" + fileName + "_" + timeStamp + ".png");
		FileHandler.copy(src, dest);
	}
	
	//scrollIntoView
	public static void scrollIntoView(WebDriver driver, WebElement element) {
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	//waitForElementExplicitly => Explicit Wait
	public static void waitForElementExplicitly(WebDriver driver, WebElement element, long duration) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(duration));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	//readDataFromExcel
	public static String readDataFromExcel(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream myfile = new FileInputStream("C:\\Users\\sai\\eclipse-workspace\\31st-evening-\\src\\main\\resources\\testData\\testData.xlsx");
		Sheet mySheet = WorkbookFactory.create(myfile).getSheet(sheetName);
		String data = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
	//readDataFromPropertiesFile
	public static String readDataFromPropertiesFile(String key) throws IOException {
		FileInputStream myFile = new FileInputStream("C:\\Users\\sai\\eclipse-workspace\\31st-evening-\\src\\main\\resources\\config\\config.properties");
		Properties properties = new Properties();
		properties.load(myFile);
		String data=properties.getProperty(key);
		//System.out.println(data);
		return data;
	}
	
	//dropdown
	public static void handleDropDownUsingVisibleText(WebElement element, String visibleText ) {
		Select select = new Select(element);
		select.selectByContainsVisibleText(visibleText);
		System.out.println("handling dropdown value is "+ visibleText);
	}

}
