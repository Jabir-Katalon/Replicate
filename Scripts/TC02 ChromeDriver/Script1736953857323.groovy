import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver

// Define the path to your ChromeDriver executable
//String chromedriverPath = "mohammedjabir@Mohammeds-MacBook-Air chromedriver-mac-arm64" // Replace with your actual path


WebUI.openBrowser('')

//ChromeOptions co = new ChromeOptions();
//co.addArguments("--remote-allow-origins=*")
//
//System.setProperty('webdriver.chrome.driver', DriverFactory.getChromeDriverPath())
//
//WebDriver driver = new ChromeDriver(co);
//driver.get(url)
//
//DriverFactory.changeWebDriver(driver)
//ChromeDevToolsService cdts = CdpUtils.getService()


WebUI.navigateToUrl('http://demoaut.katalon.com/')



WebUI.delay(1)

WebUI.closeBrowser()