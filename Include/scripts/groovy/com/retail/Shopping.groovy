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



class Shopping {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */



	@Then("click on continue shopping")
	def I_want_to_write_a_step_with_name() {
		//		println name
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/button_Continue Shopping'))

	}
	
	@Then("validate the rating feature for (.*) stars")
	def validate_rating(String rating) {
		//		println name
		assert true == false

	}

	/*@Then("enter the wrong (.*)")
	 def increase_price123(String user){
	 WebUI.delay(5)
	 }*/

	@Then("increase the quantity (.*)")
	def increase_quantiy(String time) {
		//		println name
		for(int i =0;i<=6;i++){
			WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/i_Blue Wind Breaker Jacket_fas fa-plus text_3c6f59'))
		}

	}

	@Then("validate if the authentication fails")
	def auth_fail(){
		def text  = WebUI.getText(findTestObject('Object Repository/Page_Retail Demo Store/div_User does not exist'))
//		assert text == 'User does not exist.'
		WebUI.closeBrowser()
	}

	@Then("add more item")
	def I_check_for_the_value_in_step() {
		WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/img_Details_card-img-top'))
	}

	@Then("assert if the price is above the range to waive shipping")
	def waiveshipping() {
		//		WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/img_Details_card-img-top'))
	}

	@Then("assert if the price increases accordingly")
	def assert_inc() {
		//		WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/img_Details_card-img-top'))
	}
	
	@Then("validate if the remaining products are shown in recommendations")
	def recom() {
		//		WebUI.click(findTestObject('Object Repository/Page_Retail Demo Store/img_Details_card-img-top'))
	}
	
	
	@Then("key in a value in the search field")
	def search(){
		WebUI.setText(findTestObject('Object Repository/Page_Retail Demo Store/input_Autothon Retail Demo Store - You Sele_09981a'),
			'earring')
		
		WebUI.sendKeys(findTestObject('Object Repository/Page_Retail Demo Store/input_Autothon Retail Demo Store - You Sele_09981a'),
			Keys.chord(Keys.ENTER))
	}
	
	@Then("validate if the appropriate results are returned")
	def results(){
		
	}
	




}