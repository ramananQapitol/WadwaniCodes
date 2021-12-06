package com.step;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pom.LoginPom;
import com.pom.LoginPomStudent;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionStudent {
	LoginPomStudent log=new LoginPomStudent();
	static WebDriver driver;


	@Given("Student is on the Learnwise Login Page")
	public void studentIsOnTheLearnwiseLoginPage() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://learnwise.wfglobal.org/#/IN/en/home/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}

	@When("Student should enter valid {string}")
	public void studentShouldEnterValid(String string) throws InterruptedException {
		Thread.sleep(1000);
		log.UserName(driver).sendKeys(string);
		Thread.sleep(1000);
		System.out.println("Entering Mail Id");

	}
	@Then("Student should verify Next Button is enabled or not")
	public void studentShouldVerifyNextButtonIsEnabledOrNot() throws InterruptedException {
		WebElement NXT_Btn= log.NextBtn(driver);
		Thread.sleep(2000);
		if(NXT_Btn.isEnabled()) {
			log.NextBtn(driver).click();
			driver.quit();
		}
		else {
			driver.quit();
		}

	}
	@Then("Student should click Next Button")
	public void studentShouldClickNextButton() throws InterruptedException {
		Thread.sleep(1000);
		log.NextBtn(driver).click();
		Thread.sleep(1000);
	}
	@Then("Student should able to enter password {string}")
	public void studentShouldAbleToEnterPassword(String string) throws InterruptedException {
		Thread.sleep(1000);
		log.Enter_Password(driver).sendKeys(string);
		System.out.println("Entered password");
	}
	@Then("Student should able to enter confirm password {string}")
	public void studentShouldAbleToEnterConfirmPassword(String string) throws InterruptedException {
		log.Confirm_Password(driver).sendKeys(string);
		Thread.sleep(1000);
		log.ClickOn_checkBox(driver).click();
		Thread.sleep(1000);
		System.out.println("Not able to click on SignIn Btn");
	}
	@When("Student should able to enter valid password {string}")
	public void studentShouldAbleToEnterValidPassword(String string) throws InterruptedException {
		Thread.sleep(1000);
		log.Enter_PassKey(driver).sendKeys(string);

	}
	@And("Student should click on signIn")
	public void studentShouldClickOnSignIn() throws InterruptedException {
		Thread.sleep(1000);
		log.ClickOn_SignIn(driver).click();
		Thread.sleep(2000);
	}
	@Then("Student should able to click on Hamburger")
	public void studentShouldAbleToClickOnHamburger() throws Exception {
		Thread.sleep(1000);
		log.ClickOn_Hamburger(driver).click();
		Thread.sleep(1000);
	}
	@Then("Student should click on start or resume button")
	public void studentShouldClickOnStartOrResumeButton() throws Exception {
		Thread.sleep(3000);
		log.ClickOn_StartOrResume(driver).click();
		Thread.sleep(1000);
	}
@Then("Student should click on Course Module")
	public void studentShouldClickOnCourseModule() throws Exception {
		log.ClickOn_Courses(driver).click();
	}
	@Then("Student should see Join Course is enabled or not")
	public void studentShouldSeeJoinCourseIsEnabledOrNot() throws Exception {
		log.ClickOn_Courses(driver).click();
		System.out.println("join Course module ");
		Thread.sleep(3000);
		WebElement Join_Btn=driver.findElement(By.xpath("//span[contains(text(),'JOIN')]"));

		if(Join_Btn.isEnabled()) {
			log.ClickOn_Join(driver).click();
			driver.quit();
		}
		else {
			driver.quit();
		}

	}
	@When("Student should enter Batch id{string}")
	public void studentShouldEnterBatchId(String string) throws InterruptedException {
		log.ClickOn_Courses(driver).click();
		Thread.sleep(1000);
		log.Enter_BatchId(driver).sendKeys(string);
	}
	@Then("Student should click on Join Course")
	public void studentShouldClickOnJoinCourse() throws Exception {
		Thread.sleep(1000);
		log.ClickOn_Join(driver).click();
	}
	@Then("Student should click o Batch Name")
	public void studentShouldClickOBatchName() throws Exception {
		log.ClickOn_Courses(driver).click();
		Thread.sleep(1000);
		log.Clicking_On_BatchName(driver).click();

	}
	@Then("Student should click on Chat Icon")
	public void studentShouldClickOnChatIcon() throws Exception {
		log.ClickOn_Courses(driver).click();
		Thread.sleep(1000);
		log.Clicking_On_ChatIcon(driver).click();
		Thread.sleep(1000);
	}
	@Then("Student should click on Quizzes")
	public void studentShouldClickOnQuizzes() throws InterruptedException {
		log.ClickOn_StartOrResume(driver).click();
		Thread.sleep(1000);
		log.Clicking_On_Quizzes(driver).click();
	}
	@Then("student is able to create to the new venture group without providing the mandatory details")
	public void studentIsAbleToCreateToTheNewVentureGroupWithoutProvidingTheMandatoryDetails() throws InterruptedException {
		log.ClickOn_Courses(driver).click();
		Thread.sleep(1000);
		log.Clicking_On_BatchName(driver).click();
		Thread.sleep(1000);
		log.ClickOn_PracticeVenture(driver).click();
		Thread.sleep(1000);
		log.Create_VentureGroup(driver).click();
		Thread.sleep(1000);


		WebElement Create_Btn= log.Create_VentureGroup(driver);
		if(Create_Btn.isEnabled()) {
			Thread.sleep(1000);
			log.Click_Create_Venture(driver).click();
			driver.quit();
		}

	}
	@When("Student should click courses")
	public void studentShouldClickCourses() throws InterruptedException {
		log.ClickOn_Courses(driver).click();
		Thread.sleep(1000);
		log.Clicking_On_BatchName(driver).click();
	}
	@Then("Student should click on Practice ventures")
	public void studentShouldClickOnPracticeVentures() throws InterruptedException {
		log.ClickOn_PracticeVenture(driver).click();
		Thread.sleep(1000);
		log.Create_VentureGroup(driver).click();
		Thread.sleep(1000);
		log.VentureGroup_Name(driver).sendKeys("Mohan");
		Thread.sleep(1000);
		log.Venture_Name(driver).sendKeys("kumar");
		Thread.sleep(1000);
		log.Venture_Description(driver).sendKeys("Welcome All");
		Thread.sleep(1000);
		log.Venture_Industry(driver).click();
		Thread.sleep(1000);
		log.Select_Venture_Industry(driver).click();
		Thread.sleep(1000);
		log.Click_Create_Venture(driver).click();
		Thread.sleep(1000);

	}
	@Then("student should click on create group")
	public void studentShouldClickOnCreateGroup() throws Exception {
		Thread.sleep(1000);
		log.ClickOn_DeleteIcon(driver).click();
		Thread.sleep(3000);
		log.ClickOn_YesToDeleteIcon(driver).click();

	}
@Then("Student should click on PV Milestones")
	public void studentShouldClickOnPVMilestones() throws Exception {
		log.ClickOn_PV_Milestones(driver).click();
		Thread.sleep(1000);
		log.PV_Milestones_assesment(driver).click();
		Thread.sleep(1000);
		log.Re_Submit_Btn(driver).click();

	}
	@Then("Student should Click on profile")
	public void studentShouldClickOnProfile() throws Exception {
		log.ClickOn_StudentProfile(driver).click();
		Thread.sleep(3000);
		log.ClickOn_Profile(driver).click();
		Thread.sleep(3000);
		log.ClickOn_EditIcon(driver).click();
		Thread.sleep(3000);
		log.ClickOn_EditFirstName(driver).click();
		Thread.sleep(3000);
		log.ClickOn_EditEmail(driver).click();
		Thread.sleep(3000);
		log.ClickOn_Edit_InstitueCode(driver).click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		log.ClickOn_Edit_ChangePassword(driver).click();
		Thread.sleep(3000);
		log.ClickOn_Edit_Cancel(driver).click();
		Thread.sleep(3000);
		log.ClickOn_EditIcon(driver).click();
		log.ClickOn_Edit_SaveChanges(driver).click();
		Thread.sleep(3000);
		log.ClickOn_2ndStudentLogout(driver).click();
		Thread.sleep(3000);
		log.ClickOn_StudentLogout(driver).click();
		Thread.sleep(5000);
	}
	@Then("Student should Click on Notification icon")
	public void studentShouldClickOnNotificationIcon() throws InterruptedException {
		Thread.sleep(1000);
		log.ClickOn_Notifications(driver).click();
		Thread.sleep(1000);
	}
	@Then("Student should view Notifications")
	public void studentShouldViewNotifications() {
		log.ClickOn_Notifications(driver).click();
	}
	@Then("Student should Click on Reports")
	public void studentShouldClickOnReports() throws InterruptedException {
		log.ClickOn_Courses(driver).click();
		Thread.sleep(1000);
		log.Clicking_On_BatchName(driver).click();
		Thread.sleep(1000);
		log.ClickOn_Reports(driver).click();
		Thread.sleep(1000);

	}

	@Then("Student should view Reports")
	public void studentShouldViewReports() throws InterruptedException {
		log.ClickOn_Courses(driver).click();
		Thread.sleep(1000);
		log.Clicking_On_BatchName(driver).click();
		Thread.sleep(1000);
		log.ClickOn_Reports(driver).click();
		Thread.sleep(1000);
	}
	@Then("Student should view Download quizz report")
	public void studentShouldViewDownloadQuizzReport() throws InterruptedException {
		log.ClickOn_Courses(driver).click();
		Thread.sleep(1000);
		log.Clicking_On_BatchName(driver).click();
		Thread.sleep(1000);
		log.ClickOn_Reports(driver).click();
		Thread.sleep(1000);
	}
	@Then("Student should Download quizz report")
	public void studentShouldDownloadQuizzReport() throws Exception {
		log.ClickOn_Courses(driver).click();
		Thread.sleep(1000);
		log.Clicking_On_BatchName(driver).click();
		Thread.sleep(1000);
		log.ClickOn_Reports(driver).click();
		Thread.sleep(1000);
		log.Download_QuizzReport(driver).click();
		Thread.sleep(1000);
	}
	@Then("Student should view final assesment report")
	public void studentShouldViewFinalAssesmentReport() throws Exception {
		log.ClickOn_Courses(driver).click();
		Thread.sleep(1000);
		log.Clicking_On_BatchName(driver).click();
		Thread.sleep(1000);
		log.ClickOn_Reports(driver).click();
		Thread.sleep(1000);
		log.ClickOn_AssesmentReports(driver).click();
	}
@Then("Student should able Click on Submit Button")
	public void studentShouldAbleClickOnSubmitButton() throws InterruptedException {
		log.ClickOn_Courses(driver).click();
		Thread.sleep(1000);
		log.Clicking_On_BatchName(driver).click();
		Thread.sleep(1000);
		log.ClickOn_PV_Milestones(driver).click();
		Thread.sleep(1000);
		log.PV_Milestones_assesment(driver).click();
		Thread.sleep(1000);
		log.ClickOn_ReSubmit_Assesment(driver).click();
	}

	@When("student should login with Random Mail Id and should verify that mail")
	public void studentShouldLoginWithRandomMailIdAndShouldVerifyThatMail() throws InterruptedException {
		WebElement Email=log.UserName(driver);
		Email.click();


		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		Email.sendKeys("Student"+ randomInt +"S@yopmail.com");
		String NewMail= Email.getAttribute("value");
		System.out.println(NewMail);

		log.NextBtn(driver).click();  
		log.ClickOn_InstituteCode(driver).sendKeys("FCV16529");

		log.ReType_EmailId(driver).sendKeys(NewMail);
		log.Enter_Password(driver).sendKeys("pass");
		log.Confirm_Password(driver).sendKeys("pass");

		Thread.sleep(3000);

		log.Click_On_DropDown_To_seeLanguage_Options(driver).click();

		log.SelectLanguage_Option_Registration(driver).click();

		log.ClickOn_checkBox(driver).click();

		log.Accept_To_SignIn(driver).click();
		log.ClickOn_SignIn(driver).click();

		driver.get("https://yopmail.com/en/");
		log.YOP_Login(driver).sendKeys(NewMail);
		log.VerifyYOP_Mail(driver).click();

		Thread.sleep(3000);

		driver.switchTo().frame("ifmail");
		WebElement element = log.Verify_YopMailId(driver);
		element.click();

	}
	@Then("Student should edit Batch Id")
	public void studentShouldEditBatchId() throws InterruptedException {
		Thread.sleep(5000);
		log.ClickOn_Edit_Batch(driver).click();
		Thread.sleep(1000);
		log.ClickOn_Edit_Batch_Name(driver).sendKeys("1");
		Thread.sleep(1000);
		log.ClickOn_Yes_Edit_Batch_Name(driver).click();
		Thread.sleep(1000);
		log.ClickOn_SaveChanges(driver).click();
		Thread.sleep(1000);
		log.ClickOn_DeleteIcon(driver).click();
		Thread.sleep(3000);
		log.ClickOn_YesToDeleteIcon(driver).click();
		Thread.sleep(1000);
	}
	@Then("Student should create Practice venture group")
	public void studentShouldCreatePracticeVentureGroup() throws InterruptedException {
		log.ClickOn_PracticeVenture(driver).click();
		Thread.sleep(1000);
		log.Create_VentureGroup(driver).click();
		Thread.sleep(1000);
		log.VentureGroup_Name(driver).sendKeys("Mohan");
		Thread.sleep(1000);
		log.Venture_Name(driver).sendKeys("kumar");
		Thread.sleep(1000);
		log.Venture_Description(driver).sendKeys("Welcome All");
		Thread.sleep(1000);
		log.Venture_Industry(driver).click();
		Thread.sleep(1000);
		log.Select_Venture_Industry(driver).click();
		Thread.sleep(1000);
		log.Click_Create_Venture(driver).click();
	}
	@Then("Student click on PV milestones Button")
	public void studentClickOnPVMilestonesButton() throws InterruptedException {
		Thread.sleep(1000);
		log.ClickOn_PV_Milestones(driver).click();
	}
	@Then("Student click on any assignment")
	public void studentClickOnAnyAssignment() throws InterruptedException {
		Thread.sleep(1000);
		log.Click_Any_Assignment(driver).click();
	}
	@Then("Student click on view submission")
	public void studentClickOnViewSubmission() throws InterruptedException {
		Thread.sleep(1000);
		log.ClickOn_view_submission(driver).click();
		
	}
@Then("Student click milestone {int}")
	public void studentClickMilestone(Integer int1) throws InterruptedException {
		Thread.sleep(1000);
		log.ClickOn_Milestone_Number(driver).click();
	}
	@Then("Student click on view submit")
	public void studentClickOnViewSubmit() throws InterruptedException {
		Thread.sleep(1000);
		log.PV_Milestones_assesment(driver).click();
	}
	@Then("Student click on attempt button")
	public void studentClickOnAttemptButton() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement Submit=log.ClickOn_Edit_Submit(driver);
		js.executeScript("arguments[0].click()",Submit);

	}
	@Then("click on pvmilestones tab and check whether the student is able to view the assignments.")
	public void clickOnPvmilestonesTabAndCheckWhetherTheStudentIsAbleToViewTheAssignments() throws InterruptedException {
		Thread.sleep(1000);
		log.ClickOn_PVmilestones(driver).click();
	}
	@Then("clik on view details button")
	public void clikOnViewDetailsButton() throws InterruptedException {
		Thread.sleep(1000);
		log.ClickOn_DetailsButton(driver).click();
	}
	@Then("click on viewsubmission  button in the selected pv milestone assignment.")
	public void clickOnViewsubmissionButtonInTheSelectedPvMilestoneAssignment() throws InterruptedException {
		Thread.sleep(1000);
		log.ClickOn_ViewsubmissionButton(driver).click();
		
	}
	@Then("click on resubmit button.")
	public void clickOnResubmitButton() throws InterruptedException {
		Thread.sleep(1000);
		log.ClickOn_Resubmit_Button(driver).click();
		
	}
	@And("student should click on submit")
	public void student_should_click_on_submit() throws InterruptedException {
		Thread.sleep(1000);
		log.ClickOn_Submit_Button(driver).click();
	}
	@And("student should click on close icon")
	public void student_should_click_on_close_icon() throws InterruptedException {
		Thread.sleep(1000);
		log.ClickOn_CloseIcon(driver).click();
	}
	@And("student should click on back button")
	public void student_should_click_on_back_button() throws InterruptedException {
		Thread.sleep(1000);
		log.ClickOn_Back_Button(driver).click();
	}
	@And("student should click on mile stone")
	public void student_should_click_on_mile_stone() throws InterruptedException {
		Thread.sleep(1000);
		log.ClickOn_Milestone(driver).click();
	}
	
	@Then("Student should able Click on Back Button")
	public void studentShouldAbleClickOnBackButton() {
		log.ClickOn_Courses(driver).click();
		log.Clicking_On_BatchName(driver).click();
		log.ClickOn_PV_Milestones(driver).click();
		log.PV_Milestones_assesment(driver).click();
		log.ClickOn_Back_Btn(driver).click();
	}
	@Then("Student should able Click any PV_Milestone")
	public void studentShouldAbleClickAnyPV_Milestone() {
		log.ClickOn_Courses(driver).click();
		log.Clicking_On_BatchName(driver).click();
		log.ClickOn_PV_Milestones(driver).click();
		log.ClickOn_PV_Milestone_Number(driver).click();
	}
	@Then("Student should able to check status")
	public void studentShouldAbleToCheckStatus() {
		log.ClickOn_Courses(driver).click();
		log.Clicking_On_BatchName(driver).click();
		log.ClickOn_PV_Milestones(driver).click();
		log.PV_Milestones_assesment(driver).click();
	}
@Then("student should click on cancel group")
	public void studentShouldClickOnCancelGroup() throws InterruptedException {
		log.ClickOn_PracticeVenture(driver).click();
		Thread.sleep(3000);
		log.Create_VentureGroup(driver).click();
		Thread.sleep(3000);
		log.VentureGroup_Name(driver).sendKeys("Mohan");
		Thread.sleep(3000);
		log.Venture_Name(driver).sendKeys("kumar");
		Thread.sleep(3000);
		log.Venture_Description(driver).sendKeys("Welcome All");
		Thread.sleep(3000);
		log.Venture_Industry(driver).click();
		Thread.sleep(3000);
		log.Select_Venture_Industry(driver).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'CANCEL')]")).click();
	}
	@Then("student should click create group")
	public void studentShouldClickCreateGroup() throws InterruptedException {
		log.ClickOn_PracticeVenture(driver).click();
		Thread.sleep(1000);
		log.Create_VentureGroup(driver).click();
		Thread.sleep(1000);
		log.VentureGroup_Name(driver).sendKeys("Mohan");
		Thread.sleep(1000);
		log.Venture_Name(driver).sendKeys("kumar");
		Thread.sleep(1000);
		log.Venture_Description(driver).sendKeys("Welcome All");
		Thread.sleep(1000);


		WebElement Create_Btn=log.Create_VentureGroup(driver);
		if(Create_Btn.isEnabled()) {
			log.Click_Create_Venture(driver).click();
			driver.quit();
		}
		else {
			Thread.sleep(3000);
			driver.quit();
		}
	}
@Then("Student should click Resume Button")
	public void studentShouldClickResumeButton() throws InterruptedException {
		log.ClickOn_StartOrResume(driver).click();
		Thread.sleep(2000);
	}	

	@Then("Student should delete the venture")
	public void studentShouldDeleteTheVenture() throws InterruptedException {

		log.Delete_VentureMember(driver).click();
		Thread.sleep(1000);

		log.ClickOn_yesToDelete_venturegroup(driver).click();
		Thread.sleep(1000);
		log.Delete_VentureMemberGroup(driver).click();

		Thread.sleep(1000);
		log.Click_ToDelete_VentureMemberGroup(driver).click();


	}
	@Then("Student should click View venture members")
	public void studentShouldClickViewVentureMembers() throws InterruptedException {

		log.View_VentureMembers(driver).click();
		Thread.sleep(1000);
	}

	@Then("Student should logout from that profile")
	public void studentShouldLogoutFromThatProfile() throws InterruptedException {
		Thread.sleep(3000);

		log.ClickOn_2ndStudentLogout(driver).click();
		Thread.sleep(2000);
		log.ClickOn_2ndStudentLogout_Option(driver).click();
		Thread.sleep(1000);
	}

	@Then("Student should select group name")
	public void studentShouldSelectGroupName() throws InterruptedException {

		log.Click_DropDown_SelectJoinGroup(driver).click();
		Thread.sleep(1000);
		log.Select_Join_GroupName(driver).click();
		Thread.sleep(1000);
		log.Join_Btn(driver).click();
		Thread.sleep(1000);
	}

	@Then("Student should click on Join_group")
	public void studentShouldClickOnJoin_group() {
		log.Click_JoinGroup(driver).click();		
	}
	@Then("Student should logout from his profile")
	public void studentShouldLogoutFromHisProfile() throws InterruptedException {
		Thread.sleep(2000);
		log.Click_Profile_forLogOutOption(driver).click();
		Thread.sleep(3000);
		log.Click_StudentProfile_forLogOut(driver).click();
		Thread.sleep(1000);
	}
	@Then("Student should fill mandatory fields and click on create")
	public void studentShouldFillMandatoryFieldsAndClickOnCreate() throws InterruptedException {
		log.VentureGroup_Name(driver).sendKeys("Gb");
		Thread.sleep(1000);
		log.Venture_Name(driver).sendKeys("Mohan");
		Thread.sleep(1000);
		log.Venture_Description(driver).sendKeys("Welcome");
		Thread.sleep(1000);
		log.Venture_Industry(driver).click();
		Thread.sleep(1000);
		log.Select_Venture_Industry(driver).click();
		Thread.sleep(1000);
		log.Click_Create_Venture(driver).click();
		Thread.sleep(1000);
	}

	@Then("Student should click on create_group")
	public void studentShouldClickOnCreate_group() throws InterruptedException {
		log.Create_VentureGroup(driver).click();
		Thread.sleep(2000);
	}

	@Then("Student should click on Practice venture tab")
	public void studentShouldClickOnPracticeVentureTab() throws InterruptedException {
		log.ClickOn_PracticeVenture(driver).click();
		Thread.sleep(2000);

	}
	@Then("Student should close the browser")
	public void studentShouldCloseTheBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}


@Then("Student should click on resume or start button")
public void studentShouldClickOnResumeOrStartButton() throws InterruptedException {
	Thread.sleep(3000);
	log.ClickOn_StartOrResume(driver).click();
	Thread.sleep(1000);
}

	
	

	

	@Then("click on pvmilestones tab")
	public void clickOnPvmilestonesTab() {
		
		log.ClickOn_PVmilestones(driver).click();
	}
	@Then("click on resubmit button")
	public void clickOnResubmitButton1() {
		
		log.ClickOn_resubmit_Button(driver).click();
	}
	@Then("check whether the student is able to view the assignments.")
	public void checkWhetherTheStudentIsAbleToViewTheAssignments() {
		
	log.ClickOn_PV_Milestones(driver).click();
	}
	@Then("click on remove button and click on choose file and submit")
	public void clickOnRemoveButtonAndClickOnChooseFileAndSubmit() throws InterruptedException {
		Thread.sleep(3000);
		driver.switchTo().frame("prev_att");
		log.Choose_file(driver).click();
		System.out.println("success");
		log.Choose_file_ToSubmit(driver).sendKeys("/home/qq429/Downloads/1638336892_PV_Milestone_presentation_1-Dec12,2019 (5).pptx");
		System.out.println("Doc added");
		log.Choose_file_ToEditSubmit(driver).click();
	}
	@Then("click on remove button and click on choose unsupported file and submit")
	public void clickOnRemoveButtonAndClickOnChooseUnsupportedFileAndSubmit() throws InterruptedException {
		Thread.sleep(9000);
		driver.switchTo().frame("prev_att");
		log.Click_ToRemovefile(driver).click();
		log.Click_ToRemovefile_Edit(driver).click();
		System.out.println("success");
		log.Click_ToRemovefile_Edit_Upload(driver).sendKeys("/home/qq429/Downloads/Trello (Web).xmind");
		System.out.println("Doc added");

	}

}
