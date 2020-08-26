package com.retail
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class checkout {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Login to the (.*)")
	def I_want_to_write_a_step_with_name(String name) {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('http://d2z0ae8zpwnvki.cloudfront.net/#/')
	}

	@When("click on the (.*) menu")
	def I_check_for_the_value_in_step(String menu) {
		WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/a_Featured'))
	}

	@Then("click on the (.*) icon")
	def Click_shoe(String item) {
		
		WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/img_Featured_card-img-top'))
	}
	
	@Then("add the item to the cart")
	def Dd_to_cart() {
		WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/button_Add to Cart'))
	}
	
	@Then("view the cart")
	def View_cart() {
		WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/button_View Cart'))
	}
	
	@Then("select to checkout")
	def Select_checkout() {
		WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/button_Checkout'))
	}
	
	@Then("select as checkout as guest")
	def Guest_chekcout() {
		WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/button_Checkout as Guest'))

	}
	
	@Then("enter the guest details for checkout")
	def guest_details() {
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
	}
	
	@Then("confirm order")
	def I_verify_the_status_in_step(String item) {
		WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/a_Featured'))
		WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/img_Featured_card-img-top'))
	}
	
	@Then("assert if the item name and price are correct")
	def assertname(String item) {
		/*WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/a_Featured'))
		WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/img_Featured_card-img-top'))*/
	}
}