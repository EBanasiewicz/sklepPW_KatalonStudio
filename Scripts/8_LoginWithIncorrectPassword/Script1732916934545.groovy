//Przypadek testowy nr 8 ("Logowanie — z niepoprawnymi danymi")

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

WebUI.click(findTestObject('Object Repository/Page_sklep.pw.edu.pl  Politechnika Warszaws_cad922/a_Moje konto'))

WebUI.setText(findTestObject('Object Repository/Page_Moje konto  sklep.pw.edu.pl/input__username'), 'konto_test_do_pracy_inz@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Moje konto  sklep.pw.edu.pl/input__password'), 'P9ET2sDE0SE=')

WebUI.click(findTestObject('Object Repository/Page_Moje konto  sklep.pw.edu.pl/button_Zaloguj si'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Moje konto  sklep.pw.edu.pl/li_BD wpisana nazwa uytkownika lub haso jes_0d61b6'), 
    'BŁĄD: wpisana nazwa użytkownika lub hasło jest nieprawidłowe. Nie pamiętasz hasła?')

WebUI.closeBrowser()

