//Przypadek testowy nr 5 ("Dodanie produktu do koszyka — produkt z opcjami — bez wybrania opcji")

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

'Go to the shop webpage'
WebUI.navigateToUrl('https://www.sklep.pw.edu.pl/')

'Enter the query into the search bar'
WebUI.setText(findTestObject('Object Repository/Page_sklep.pw.edu.pl  Politechnika Warszaws_cad922/input_Szukaj_s'), 'Bluza bejsbolówka')

'Press enter'
WebUI.sendKeys(findTestObject('Object Repository/Page_sklep.pw.edu.pl  Politechnika Warszaws_cad922/input_Szukaj_s'), Keys.chord(
        Keys.ENTER))

'Use \'Add to cart\' button'
WebUI.click(findTestObject('Object Repository/Page_Bluza bejsbolwka  sklep.pw.edu.pl/button_Dodaj do koszyka'))

'Verify that the alert is present'
WebUI.verifyAlertPresent(1)

'Get text alert on the alert when it\'s shown'
alertText = WebUI.getAlertText()

'Verify text alert is correct or not'
WebUI.verifyMatch(alertText, 'Wybierz opcje produktu przed dodaniem go do koszyka.', false)

'Accept alert, IF its still present'
if (WebUI.verifyAlertPresent(1, FailureHandling.OPTIONAL)) {
    WebUI.acceptAlert()
} else {
    WebUI.comment('Alert is already closed')
}

WebUI.closeBrowser()



