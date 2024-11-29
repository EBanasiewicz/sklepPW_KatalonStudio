//Przypadek testowy nr 4 ("Dodanie produktu do koszyka — produkt z opcjami — rozmiar, rodzaj")

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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.sklep.pw.edu.pl/')

WebUI.setText(findTestObject('Object Repository/Page_sklep.pw.edu.pl  Politechnika Warszaws_cad922/input_Szukaj_s'), 'Bluza bejsbolówka')

WebUI.sendKeys(findTestObject('Object Repository/Page_sklep.pw.edu.pl  Politechnika Warszaws_cad922/input_Szukaj_s'), Keys.chord(
        Keys.ENTER))

String script_picktypefromlist = 'document.getElementById("pa_rodzaj").value = \'damska\';'

WebUI.executeJavaScript(script_picktypefromlist, null)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bluza bejsbolwka  sklep.pw.edu.pl/select_Wybierz opcjMLXL'), 
    'xl', true)

String script_quantity = 'document.querySelector("input[name=\'quantity\']").value = 2;'

WebUI.executeJavaScript(script_quantity, null)

WebUI.click(findTestObject('Object Repository/Page_Bluza bejsbolwka  sklep.pw.edu.pl/button_Dodaj do koszyka'))


String fullText = WebUI.getText(findTestObject('Object Repository/Page_Bluza bejsbolwka  sklep.pw.edu.pl/div_Zobacz koszyk 2  Bluza bejsbolwka zosta_2e3c02'))

WebUI.verifyMatch(fullText, '.*Zobacz koszyk.*2 × „Bluza bejsbolówka” zostało dodanych do koszyka.*', true)

WebUI.click(findTestObject('Object Repository/Page_Bluza bejsbolwka  sklep.pw.edu.pl/a_Zobacz koszyk'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Koszyk  sklep.pw.edu.pl/a_Bluza bejsbolwka - Damska, XL'), 
    'Bluza bejsbolówka - Damska, XL')

WebUI.closeBrowser()

