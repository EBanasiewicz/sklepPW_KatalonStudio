//Przypadek testowy nr 1 ("Wyszukanie produktu na stronie — produkt istniejący")

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
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.sklep.pw.edu.pl/')

WebUI.setText(findTestObject('Object Repository/Page_sklep.pw.edu.pl  Politechnika Warszaws_cad922/input_Szukaj_s'), 'bluza')

WebUI.sendKeys(findTestObject('Object Repository/Page_sklep.pw.edu.pl  Politechnika Warszaws_cad922/input_Szukaj_s'), Keys.chord(
        Keys.ENTER))

List<WebElement> listOfElements = WebUI.findWebElements(findTestObject('Object Repository/Page_Wyniki wyszukiwania dla bluza  sklep.p_9f5294/SearchResult'), 
    1)

String testWord = 'bluza'

int numberOfRelevantSearchResults = 0

int numberOfIrrelevantSearchResults = 0

for (WebElement element : listOfElements) {
    String elementText = element.getText()

    String lowercaseElementText = elementText.toLowerCase()

    if (lowercaseElementText.contains(testWord)) {
        numberOfRelevantSearchResults++
    } else {
        numberOfIrrelevantSearchResults++
    }
}

// Asercja - liczba prawidłowych wyników równa liczbie wyników wyszukiwania
WebUI.verifyEqual(listOfElements.size(), numberOfRelevantSearchResults)

//Asercja - liczba nieprawidłowych wyników = 0
WebUI.verifyEqual(0, numberOfIrrelevantSearchResults)

WebUI.closeBrowser()

