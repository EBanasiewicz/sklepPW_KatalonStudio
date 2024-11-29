//Przypadek testowy nr 6 ("Sprawdzenie zawartości minikoszyka")

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

WebUI.navigateToUrl('https://www.sklep.pw.edu.pl/')

WebUI.setText(findTestObject('Object Repository/Page_sklep.pw.edu.pl  Politechnika Warszaws_cad922/input_Szukaj_s'), 'kubek')

WebUI.sendKeys(findTestObject('Object Repository/Page_sklep.pw.edu.pl  Politechnika Warszaws_cad922/input_Szukaj_s'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Wyniki wyszukiwania dla kubek  sklep.p_05c576/a_Dodaj do koszyka'))

WebUI.executeJavaScript('window.scrollTo(0, 0);', null)

WebUI.mouseOver(findTestObject('Object Repository/Page_sklep.pw.edu.pl  Politechnika Warszawska  oficjalny sklep internetowy/a_0,00z'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_sklep.pw.edu.pl  Politechnika Warszawska  oficjalny sklep internetowy/ShoppingCartWidget'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Wyniki wyszukiwania dla kubek  sklep.p_05c576/a_Kubek PW'), 
    'Kubek PW')

WebUI.closeBrowser()

