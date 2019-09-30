package org.stepdefenition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass1 {
	public static WebDriver driver;

	public static WebDriver LaunchBrowser() {
		System.out.println("Lauching the borwser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\Shop\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
//Click on Signin button
	public static void Click(WebElement e) {
		e.click();
	}

	public static void goToUrl(String url) {
		driver.get(url);
	}

	public static void insertValues(WebElement e, String u) {
		e.sendKeys(u);
	}

	public static void dropdown(WebElement e) {
		Select s = new Select(e);
		s.selectByIndex(3);
	}

	public static void dropdown1(WebElement e, String v) {
		Select s = new Select(e);
		s.selectByValue(v);
	}

	public static void dropdown2(WebElement e, String u) {
		Select s = new Select(e);
		s.selectByVisibleText(u);
	}

	public static void checkbox(WebElement e) {
		e.click();
	}
	
	public static void scrollDown(WebElement e) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("aruguments[0].scrollIntoView(true)", e);

	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(5000);
	}

	public static void screenshot(String u) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File desc = new File(u);
		//FileUtils.copyFile(src, desc);
	}

	public static void scrollup(WebElement e) {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("aruguments[0].scrollIntoView(false)", e);
	}

	public static void screenshot1() throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\Navin\\seleniumproject\\SS\\up.png");
		//FileUtils.copyFile(src, desc);
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void doubleclick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();
	}

	public static void contextclick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).perform();
	}

	public static void KeyDown(WebElement e, String p) {
		Actions a = new Actions(driver);
		a.keyDown(e, Keys.SHIFT).sendKeys(p).keyUp(e, Keys.SHIFT);
	}

	public static void crtlC(WebElement e) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void backspace () throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);


	}
	public static void enter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);


	}

	public static void Tab() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
	}

	public static void crtlV(WebElement e) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	public static void closebrowser() {
		driver.close();
	}

	public static void Maximize() {
		driver.manage().window().maximize();
	}

	public static void quit() {
		driver.quit();
	}

	public static void simpleAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void confirmAlertOk() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	public static void confirmAlertCancel() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	public static void promptAlertYes() {
		Alert a = driver.switchTo().alert();
		a.sendKeys("Yes");
		a.accept();
	}

	public static void promptAlertCancel() {
		Alert a = driver.switchTo().alert();
		a.sendKeys("No");
		a.dismiss();
	}

	public static void moveToElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	public static void dragAndDrop(WebElement src, WebElement desc) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, desc);
	}

	public static void FramesCount() {
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("No.of Frames in the WebPage :" + frames);
	}

	public static void Linkscount() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No.of Links in the WebPage :" + links);

	}

	public static void ImageCount() {
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("No.of images in the WebPage :" + images);
	}

	public static void getText(WebElement e) {
		String s = e.getText();
		System.out.println(s);
	}

	public static void getAttribute(WebElement e) {
		String s = e.getAttribute("values");
		System.out.println(s);
	}

//	public static String getData(int a, int b) throws Exception {
//		String v = null;
//		File f = new File("C:\\Users\\Navin\\FirstMavenProject\\testdata\\new.xlsx");
//		FileInputStream input = new FileInputStream(f);
//		Workbook w = new XSSFWorkbook(input);
//		Sheet s = w.getSheet("Sheet1");
//
//		Row r = s.getRow(a);
//		Cell c = r.getCell(b);
//		int type = c.getCellType();
//
//		if (type == 1) {
//			v = c.getStringCellValue();
//		} else if (type == 0) {
//			if (DateUtil.isCellDateFormatted(c)) {
//				Date datecellvalue = c.getDateCellValue();
//				SimpleDateFormat simple = new SimpleDateFormat();
//				v = simple.format(datecellvalue);
//
//			} else {
//				double numericCellValue = c.getNumericCellValue();
//
//				long l = (long) numericCellValue;
//
//				v = String.valueOf(l);
//			}
//		}
//
//		return v;
	}
