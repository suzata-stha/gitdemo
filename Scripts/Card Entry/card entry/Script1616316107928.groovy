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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.13.194.177:84/login')

WebUI.setText(findTestObject('Object Repository/card entry/Page_Login  Card Center Management System  CCMS/input_Login__username'), 
    'superadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/card entry/Page_Login  Card Center Management System  CCMS/input_Login__password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/card entry/Page_Login  Card Center Management System  CCMS/button_Login'))

WebUI.click(findTestObject('Object Repository/card entry/Page_Card Center Management System  CCMS/span_Card Entry'))

WebUI.click(findTestObject('Object Repository/card entry/Page_Card Center Management System  CCMS/a_New Card'))

WebUI.setText(findTestObject('Object Repository/card entry/Page_Card Center Management System  CCMS/input_Designated AC Number_accountNo'), 
    '002000000219')

WebUI.click(findTestObject('Object Repository/card entry/Page_Card Center Management System  CCMS/i_Designated AC Number_fa fa-search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/card entry/Page_Card Center Management System  CCMS/select_Select Product TypeThis is a product_e921e4'), 
    '004', true)

WebUI.click(findTestObject('Object Repository/card entry/Page_Card Center Management System  CCMS/input_Yes_cardautoRenew'))

WebUI.click(findTestObject('Object Repository/card entry/Page_Card Center Management System  CCMS/input_Paper Pin_cardpinOptions'))

WebUI.selectOptionByValue(findTestObject('Object Repository/card entry/Page_Card Center Management System  CCMS/select_Select ProfileitstestPartial ChargeP_37a5eb'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/card entry/Page_Card Center Management System  CCMS/button_Create'))

WebUI.closeBrowser()

