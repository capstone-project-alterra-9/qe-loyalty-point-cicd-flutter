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

Mobile.startApplication('D:\\Alterra2\\Folder Baru\\app-release (11).apk', true)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/redeem/android.widget.ImageView (3)'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/redeem/android.widget.ImageView (4)'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/redeem/android.widget.EditText - 62823 2222 3333'), 0, 0)

Mobile.setText(findTestObject('Object Repository/redeem/android.widget.EditText - 62823 2222 3333 (1)'), '81260973422', 
    0)

Mobile.tapAndHold(findTestObject('Object Repository/redeem/android.widget.ImageView (5)'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/redeem/android.widget.Button (3)'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/redeem/android.widget.Button (4)'), 0, 0)

Mobile.closeApplication()

