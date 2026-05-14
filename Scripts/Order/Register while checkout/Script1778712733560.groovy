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

WebUI.openBrowser('http://automationexercise.com')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/h2_Full-Fledged practice website for Automa_49aaf4'))

WebUI.scrollToElement(findTestObject('Page_Automation Exercise/div_Rs. 500Blue TopAdd to cart'), 0)

WebUI.mouseOver(findTestObject('Page_Automation Exercise/div_Rs. 500Blue TopAdd to cart'))

WebUI.click(findTestObject('Page_Automation Exercise/a_Add to cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Automation Exercise - Product Details/button_Continue Shopping'))

WebUI.waitForElementClickable(findTestObject('Page_Automation Exercise/a_Cart'), 1)

WebUI.click(findTestObject('Page_Automation Exercise/a_Cart'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Checkout/div_Home  Shopping CartProceed To CheckoutCheckout'))

WebUI.click(findTestObject('Page_Automation Exercise - Checkout/a_Proceed To Checkout'))

WebUI.click(findTestObject('Page_Automation Exercise - Checkout/u_Register  Login'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Signup  Login/h2_New User Signup'))

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_New User Signup_name'), 'John')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup  Login/input_New User Signup_email'), 'johndoeeeee@mail.com')

WebUI.click(findTestObject('Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Signup/b_Enter Account Information'))

WebUI.check(findTestObject('Page_Automation Exercise - Signup/label_Mr'))

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input__name'), 'John')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input__password'), 'Securepass!5')

WebUI.selectOptionByLabel(findTestObject('Page_Automation Exercise - Signup/select_Day123456789101112131415161718192021_40ab5b'), 
    '12', false)

WebUI.selectOptionByLabel(findTestObject('Page_Automation Exercise - Signup/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    'January', false)

WebUI.check(findTestObject('Page_Automation Exercise - Signup/input_Date of Birth_newsletter'))

WebUI.check(findTestObject('Page_Automation Exercise - Signup/input_Sign up for our newsletter_optin'))

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input__first_name'), 'John')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input__last_name'), 'Doe')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Company_company'), 'Acme')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_(Street address, P.O. Box, Company na_957d3e'), 'St Louis street 233')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input_Address 2_address2'), 'St Francis 43')

WebUI.selectOptionByLabel(findTestObject('Page_Automation Exercise - Signup/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'), 
    'United States', false)

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input__state'), 'Oregon')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input__city'), 'Bend')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input__zipcode'), '97701')

WebUI.setText(findTestObject('Page_Automation Exercise - Signup/input__mobile_number'), '(541) 472-8394')

WebUI.click(findTestObject('Page_Automation Exercise - Signup/button_Create Account'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Account Created/b_Account Created'))

WebUI.click(findTestObject('Page_Automation Exercise - Account Created/a_Continue'))

WebUI.refresh()

WebUI.click(findTestObject('Page_Automation Exercise - Account Created/a_Continue'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise/i_Logged in as_fa fa-user'))

WebUI.click(findTestObject('Page_Automation Exercise/a_Cart'))

WebUI.click(findTestObject('Page_Automation Exercise - Checkout/a_Proceed To Checkout'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Payment/div_Home  PaymentPayment'))

WebUI.setText(findTestObject('Page_Automation Exercise - Checkout/textarea_If you would like t'), 'Nice!')

WebUI.click(findTestObject('Page_Automation Exercise - Checkout/a_Place Order'))

WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_Name on Card_name_on_card'), 'Jonh Doe')

WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_Card Number_card_number'), '4567 6743 2124 4567')

WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_CVC_cvc'), '777')

WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_Expiration_expiry_month'), '12')

WebUI.setText(findTestObject('Page_Automation Exercise - Payment/input_Expiration_expiry_year'), '2030')

WebUI.click(findTestObject('Page_Automation Exercise - Payment/button_Pay and Confirm Order'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Order Placed/b_Order Placed'))

WebUI.click(findTestObject('Page_Automation Exercise - Order Placed/a_Continue'))

WebUI.click(findTestObject('Page_Automation Exercise/a_Delete Account'))

WebUI.verifyElementVisible(findTestObject('Page_Automation Exercise - Account Created/b_Account Deleted'))

WebUI.click(findTestObject('Page_Automation Exercise - Account Created/a_Continue'))

WebUI.closeBrowser()

