package HR_application_Test;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Employee_Application_Pages.CustomEx_Page;
import HR_Application_Pages.*;

public class HR_Test {

	@BeforeTest
	public static void Login() throws InterruptedException, IOException
	{
		Driver_Page.Driver();
		Login_Page.login();
		CustomEx_Page.loader(180);
	}
	
	@Test(priority=01)
	public static void Profile() throws InterruptedException
	{
		Home_Page.ClickOnProfileIcon();
		Thread.sleep(3000);
		Home_Page.ClickOnMyprofile();
		CustomEx_Page.loader(180);
		Home_Page.ClickOnChangePassword();
		Driver_Page.Scroldown();
		Home_Page.EnterOldPassword();
		Home_Page.EnterNewPassword();
		Home_Page.ClickOnSubmitButton();
		Driver_Page.Scroldown();
		Home_Page.ClickonMenuIcon();
		Home_Page.ClickOnDashboard();
		CustomEx_Page.loader(180);
		Home_Page.ClickonMenuIcon();
		Home_Page.ClickOnGMCPolicy();
		CustomEx_Page.loader(180);
	}
	
	@Test(priority=02)
	public static void GMCPolicy() throws InterruptedException
	{
		GMCPolicy_Page.ClickOnGMCCard();
		CustomEx_Page.loader(120);
		GMCPolicy_Page.ClickonPolicyDownload();
		CustomEx_Page.loader(120);
		GMCPolicy_Page.ClickonFeaturesDownload();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnDashboard();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnGMCPolicy();
		CustomEx_Page.loader(120);
		GMCPolicy_Page.ClickonMembersCard();
		CustomEx_Page.loader(120);
		GMCPolicy_Page.ClickOnMenu();
		GMCPolicy_Page.ClickOnView();
		CustomEx_Page.loader(120);
		GMCPolicy_Page.ClickOnEcardDownload();
		CustomEx_Page.loader(120);
		Menu_Page.CLickonMembers();
		CustomEx_Page.loader(120);
		GMCPolicy_Page.ClickOnMenu();
		GMCPolicy_Page.ClickOnEcard();
		CustomEx_Page.loader(120);
		GMCPolicy_Page.ClickOnMenu2();
		GMCPolicy_Page.ClickOnViewDetails();
		CustomEx_Page.loader(120);
		GMCPolicy_Page.ClickOnecardDownload();
		CustomEx_Page.loader(120);
		Menu_Page.CLickonMembers();
		CustomEx_Page.loader(120);
		GMCPolicy_Page.ClickOnMenu();
		GMCPolicy_Page.ClickOnE_card();
		Home_Page.ClickOnDashboard();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnGMCPolicy();
		CustomEx_Page.loader(120);
		GMCPolicy_Page.ClickOnClaimsCard();
		CustomEx_Page.loader(120);
		GMCPolicy_Page.ClickOnClaimsRequest();
		CustomEx_Page.loader(120);
		GMCPolicy_Page.ClickOnPrint();
		GMCPolicy_Page.PrintButtonUsingEnter();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnDashboard();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnGMCPolicy();
		CustomEx_Page.loader(120);
		GMCPolicy_Page.ClickOnPremiumIcon();
		CustomEx_Page.loader(120);
		GMCPolicy_Page.ClickOnDownloadLink();
		CustomEx_Page.loader(120);	
		Home_Page.ClickOnDashboard();
		CustomEx_Page.loader(120);
	}
	
	@Test(priority=03)
	public static void Members() throws InterruptedException
	{
		Members_Page.ClickOnManageText();
		CustomEx_Page.loader(120);
		Members_Page.ClickOnMenu();
		Members_Page.ClickOnView();
		CustomEx_Page.loader(120);
		Menu_Page.CLickonManageMembers();
		CustomEx_Page.loader(120);
		Members_Page.ClickOnMenu();
		Members_Page.CLickOnEdit();
		CustomEx_Page.loader(120);
		Members_Page.ClickOnSave();
		Menu_Page.CLickonManageMembers();
		CustomEx_Page.loader(120);
		Members_Page.ClickOnMenu();
		Members_Page.ClickOnEcard();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnDashboard();
		CustomEx_Page.loader(120);
	}
	
	@Test(priority=04)
	public static void Add_Employee() throws InterruptedException 
	{
		AddEmployee_Page.ClickOnAddText();
		CustomEx_Page.loader(120);
		AddEmployee_Page.ClickOnEmployeeId();
		AddEmployee_Page.ClickOnMemberId();
		AddEmployee_Page.ClickOnName();
		AddEmployee_Page.ClickOnDesignation();
		AddEmployee_Page.CLickOnDateOnJoining();
		AddEmployee_Page.SelectDepartment();
		AddEmployee_Page.SelectGender();
		Driver_Page.Scroldown();
		AddEmployee_Page.SelectMaritalStatus();
		AddEmployee_Page.ClickOnDateOfBirth();
		AddEmployee_Page.ClickOnEmail();
		AddEmployee_Page.ClickOnMobileNumber();
		AddEmployee_Page.SelectLocation();
		AddEmployee_Page.SelectRole();
		AddEmployee_Page.ClickOnSaveButton();
		CustomEx_Page.loader(120);
		Members_AddEmplee_Page.ClickOnMenu();
		Members_AddEmplee_Page.ClickOnViewText();
		CustomEx_Page.loader(120);
		Members_AddEmplee_Page.ClickOnManageMembers();
		CustomEx_Page.loader(120);
		Members_AddEmplee_Page.ClickOnMenu();
		Members_AddEmplee_Page.ClickOnEditText();
		CustomEx_Page.loader(120);
		Members_AddEmplee_Page.ClickOnManageMembers();
		CustomEx_Page.loader(120);
		Members_AddEmplee_Page.ClickOnMenu();
		Members_AddEmplee_Page.ClickOnEcardText();
	}
	
	@Test(priority=05)
	public static void Bulk_Upload() throws InterruptedException, IOException
	{
		BulkUploads_Page.ClickOnBulkUploads();
		CustomEx_Page.loader(120);
		BulkUploads_Page.ClickOnDownloadOfaddition();
		CustomEx_Page.loader(120);
		Excel_Page.ExcelHandling();
		CustomEx_Page.loader(120);
		BulkUploads_Page.UploadExcelFile();
	}
	
	@Test(priority=06)
	public static void Enrolment() throws InterruptedException
	{
		Home_Page.ClickOnDashboard();
		CustomEx_Page.loader(120);
		Enrolment_Page.ClickOnEnrolment();
		CustomEx_Page.loader(120);
		Enrolment_Page.ClickOnDeletion();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnDashboard();
		CustomEx_Page.loader(120);
	}
	
	@Test(priority=07)
	public static void Endorsement() throws InterruptedException
	{
		Home_Page.ClickOnGMCPolicy();
		CustomEx_Page.loader(120);
		Menu_Page.CLickonEndorsement();
		CustomEx_Page.loader(120);
		Endorsement_Page.ClickonEndorse();
		CustomEx_Page.loader(120);
		Endorsement_Page.ClickonCheckBox();
		Endorsement_Page.ClickonSubmit();
		CustomEx_Page.loader(120);
		Endorsement_Page.ClickonContinue();
		CustomEx_Page.loader(120);
		//Endorsement_Page.ClickonCancle();
	}
	
	@AfterTest
	public static void Logout()
	{
		Logout_Page.ClickOnLogoutButton();
	}
}
