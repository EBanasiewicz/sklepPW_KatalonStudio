//Przypadek testowy nr 9 ("Przejście do ekranu płatności")

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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.sklep.pw.edu.pl/')

WebUI.setText(findTestObject('Object Repository/Page_sklep.pw.edu.pl  Politechnika Warszaws_cad922/input_Szukaj_s'), 'Kubek PW')

WebUI.sendKeys(findTestObject('Object Repository/Page_sklep.pw.edu.pl  Politechnika Warszaws_cad922/input_Szukaj_s'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Kubek PW  sklep.pw.edu.pl/button_Dodaj do koszyka'))

WebUI.click(findTestObject('Object Repository/Page_Kubek PW  sklep.pw.edu.pl/a_Zobacz koszyk'))

WebUI.click(findTestObject('Object Repository/Page_Koszyk  sklep.pw.edu.pl/a_Przejd do patnoci'))

String currentURL = DriverFactory.getWebDriver().getCurrentUrl()

WebUI.verifyMatch(currentURL, 'https://www.sklep.pw.edu.pl/zamowienie', true)

WebUI.closeBrowser()

