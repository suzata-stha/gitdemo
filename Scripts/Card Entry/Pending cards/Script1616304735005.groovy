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

WebUI.callTestCase(findTestCase('Login/login Entry'), [:], FailureHandling.STOP_ON_FAILURE)


WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/pending cards/Page_Card Center Management System  CCMS/a_Card Request'))

WebUI.click(findTestObject('Object Repository/pending cards/Page_Card Center Management System  CCMS/span_Pending Card(s) Approval'))

WebUI.scrollToElement(findTestObject('Object Repository/pending cards/Page_Card Center Management System  CCMS/scroll'), 
    1)

WebUI.delay(3)

//WebUI.click(findTestObject('Object Repository/pending cards/Page_Card Center Management System  CCMS/input_Actions_cards'))
WebUI.click(findTestObject('Object Repository/pending cards/Page_Card Center Management System  CCMS/xpath for account'))

WebUI.selectOptionByValue(findTestObject('Object Repository/pending cards/Page_Card Center Management System  CCMS/select_Select Action                       _6ea349'), 
    'approve', true)

WebUI.click(findTestObject('Object Repository/pending cards/Page_Card Center Management System  CCMS/button_Approve'))

WebUI.closeBrowser()

