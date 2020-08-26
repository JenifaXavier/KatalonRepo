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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://d2z0ae8zpwnvki.cloudfront.net/#/')

WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/div_No Results'))

WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/div_Apparel'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Retail Demo Store/div_Apparel'))

WebUI.click(findTestObject('Page_Retail Demo Store/a_Apparel'))

WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/a_Details'))

WebUI.click(findTestObject('Page_Retail Demo Store/button_Add to Cart'))

WebUI.click(findTestObject('Page_Retail Demo Store/button_View Cart'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Retail Demo Store/i_Blue Wind Breaker Jacket_fas fa-plus text_3c6f59'))

WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/i_Blue Wind Breaker Jacket_fas fa-plus text_3c6f59'))

WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/i_Blue Wind Breaker Jacket_fas fa-plus text_3c6f59'))

WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/i_Blue Wind Breaker Jacket_fas fa-plus text_3c6f59'))

WebUI.closeBrowser()

