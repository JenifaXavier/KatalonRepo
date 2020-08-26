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

WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/a_Featured'))

WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/img_Featured_card-img-top'))

WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/button_View Cart'))

WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/button_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/button_Checkout as Guest'))

WebUI.setText(findTestObject('Object Repository/Page_Retail Demo Store/input_First name_firstName'), 'guest')

WebUI.setText(findTestObject('Object Repository/Page_Retail Demo Store/input_Last name_lastName'), 'guest')

WebUI.setText(findTestObject('Object Repository/Page_Retail Demo Store/input_(Optional)_email'), 'guest@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Retail Demo Store/input_Address_address'), 'guest')

WebUI.setText(findTestObject('Object Repository/Page_Retail Demo Store/input_(Optional)_address2'), 'guest')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Retail Demo Store/select_ChooseIndia'), 'IN', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Retail Demo Store/select_ChooseKarnatakaMumbaiNew DelhiTamil _e950d4'), 
    'KA', true)

WebUI.setText(findTestObject('Object Repository/Page_Retail Demo Store/input_Zip_zip'), '123456')

WebUI.setText(findTestObject('Object Repository/Page_Retail Demo Store/input_Name on card_cc-name'), 'guest')

WebUI.setText(findTestObject('Object Repository/Page_Retail Demo Store/input_Credit card number_cc-number'), '1111222244445555')

WebUI.setText(findTestObject('Object Repository/Page_Retail Demo Store/input_Expiration_cc-expiration'), '01/02')

WebUI.setText(findTestObject('Object Repository/Page_Retail Demo Store/input_CVV_cc-cvv'), '555')

WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/button_Confirm Order'))

WebUI.closeBrowser()

