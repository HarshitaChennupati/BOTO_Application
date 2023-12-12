package User_Appliacation_Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import User_Application_Pages.*;

public class User_Test {
	@BeforeTest
	public static void Login() throws InterruptedException
	{
		Driver_Page.Driver();
		Login_Page.login();
		CustomEx_Page.loader(120);
	}
	
	@Test(priority=01)
	public static void Clients() throws InterruptedException
	{
		CustomEx_Page.loader(120);
		Home_Page.ClickOnAction();
	}
	
	@AfterMethod
	public static void Home() throws InterruptedException
	{
		CustomEx_Page.loader(220);
		Home_Page.ClickOnGMCpolicy();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnGMCCard();
		CustomEx_Page.loader(120);
		Home_Page.ClickonPolicyDownload();
		CustomEx_Page.loader(120);
		Home_Page.ClickonFeaturesDownload();
		CustomEx_Page.loader(120);
		Menu_Page.CLickonDashBoard();
		CustomEx_Page.loader(120);
		try 
		{
		Home_Page.ClickOnGMCpolicy();
		}
		catch(Exception e)
		{
			CustomEx_Page.loader(120);
			Menu_Page.ClickonDashboardBOTO();
			CustomEx_Page.loader(120);
			Home_Page.ClickOnAction();
			CustomEx_Page.loader(120);
			Home_Page.ClickOnGMCpolicy();
		}
		CustomEx_Page.loader(120);
		Home_Page.ClickonMembersCard();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnMenu();
		Home_Page.ClickOnView();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnEcardDownload();
		CustomEx_Page.loader(120);
		Menu_Page.CLickonMembers();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnMenu();
		Home_Page.ClickOnEcard();
		CustomEx_Page.loader(120);
		Menu_Page.CLickonDashBoard();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnGMCpolicy();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnClaimsCard();
		CustomEx_Page.loader(120);
		Home_Page.ClickonView();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnPrintButton();
		Home_Page.PrintButtonUsingEnter();
		Menu_Page.CLickonDashBoard();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnGMCpolicy();
		CustomEx_Page.loader(120);
		Home_Page.ClickOnPremium();
		CustomEx_Page.loader(120);
		Home_Page.CLickOnDownload();
		CustomEx_Page.loader(120);
		Menu_Page.CLickonDashBoard();
		CustomEx_Page.loader(120);
	}
	
	@Test(priority=02)
	public static void Members() throws InterruptedException
	{
		Manage_Page.ClickOnManageText();
		CustomEx_Page.loader(120);
		Manage_Page.ClickOnMenu();
		Manage_Page.ClickOnView();
		CustomEx_Page.loader(120);
		Menu_Page.CLickonDashBoard();
		CustomEx_Page.loader(120);
		Manage_Page.ClickOnManageText();
		CustomEx_Page.loader(120);
		Manage_Page.ClickOnMenu();
		Manage_Page.CLickOnEdit();
		CustomEx_Page.loader(120);
		Menu_Page.CLickonDashBoard();
		CustomEx_Page.loader(120);
		Manage_Page.ClickOnManageText();
		CustomEx_Page.loader(120);
		Manage_Page.ClickOnMenu();
		Manage_Page.ClickOnEcard();
		CustomEx_Page.loader(120);
	}
	
	@Test(priority=03)
	public static void Add() throws InterruptedException
	{
		Add_Employee_Page.ClickOnManageText();
		CustomEx_Page.loader(120);
		Menu_Page.CLickonDashBoard();
		CustomEx_Page.loader(120);
	}
	
	@Test(priority=04)
	public static void BulkUploads() throws InterruptedException
	{
		Bulk_Upload_Page.ClickOnBulkUploads();
		CustomEx_Page.loader(120);
		Menu_Page.CLickonDashBoard();
		CustomEx_Page.loader(120);
	}
	
	@Test(priority=05)
	public static void Enrolment() throws InterruptedException
	{
		Enrolment_Page.ClickOnEnrolment();
		CustomEx_Page.loader(120);
		Menu_Page.CLickonDashBoard();
		CustomEx_Page.loader(120);
		Menu_Page.ClickonDashboardBOTO();
		CustomEx_Page.loader(120);
	}
	
	@Test(priority=06)
	public static void Premium() throws InterruptedException
	{
		UserHome_Page.ClickOnPremium();
		CustomEx_Page.loader(120);
		Menu_Page.ClickonDashboardBOTO();
		CustomEx_Page.loader(120);
	}
	
	@Test(priority=07)
	public static void Claims() throws InterruptedException
	{
		UserHome_Page.ClickOnClaims();
		CustomEx_Page.loader(120);
		Menu_Page.ClickonDashboardBOTO();
		CustomEx_Page.loader(120);
	}
	
	@Test(priority=8)
	public static void Endorsement() throws InterruptedException
	{
		UserHome_Page.ClickOnEndorsement();
		CustomEx_Page.loader(120);
		Menu_Page.ClickonDashboardBOTO();
		CustomEx_Page.loader(120);
	}
	
	public static void Upload() throws InterruptedException
	{
		Menu_Page.ClickonUpload();
		CustomEx_Page.loader(120);
	}
}
