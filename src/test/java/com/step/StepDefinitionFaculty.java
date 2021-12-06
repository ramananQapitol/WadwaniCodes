package com.step;


import java.util.Random;
import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pom.LoginPom;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;




public class StepDefinitionFaculty{
	
	WebDriver driver;
	
	
   LoginPom pom = new LoginPom();
	@Given("Faculty is on the Learnwise Login Page")
	public void facultyIsOnTheLearnwiseLoginPage() {
		       WebDriverManager.chromedriver().setup();
			    driver=new ChromeDriver();
				driver.get("https://learnwise.wfglobal.org");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	@Then("Faculty click on chatbox")
	public void facultyClickOnChatbox() {
	 driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/md-content/ul/div/li[1]/div/md-card/md-card-title/md-card-title-text/div[2]/div")).click(); 
	}


	@When("Faculty should enter valid {string}")
	public void facultyShouldEnterValid(String string) {
		
		LoginPom.username(driver).sendKeys(string);
	}

	@Then("Faculty should verify success message")
	public void facultyShouldVerifySuccessMessage() {
		String Expectedtest ="PLATFORM FEATURES";
		String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
		System.out.println(actualtext);
	Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
	}
	@Then("Faculty should close the Browser")
	public void facultyShouldCloseTheBrowser() {
	    driver.quit();
	}

	@When("Faculty should enter invalid {string}")
	public void facultyShouldEnterInvalid(String string) {
	  LoginPom.username(driver).sendKeys(string);  
	}

	@Then("Faculty should verify its enter success message")
	public void facultyShouldVerifyItsEnterSuccessMessage() {
		String Expectedtest ="PLATFORM FEATURES";
		String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
		System.out.println(actualtext);
	Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
	    
	}
	@When("Faculty should click next Button")
	public void facultyShouldClickNextButton() {
	    LoginPom.nextBtn(driver).click();
	}

	@Then("Faculty should enter the invalid password{string}")
	public void facultyShouldEnterTheInvalidPassword(String string) {
	    LoginPom.facultyPassword(driver).click();
	}

	@Then("Faculty should verify its  success message")
	public void facultyShouldVerifyItsSuccessMessage() {
		String Expectedtest ="PLATFORM FEATURES";
		String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
		System.out.println(actualtext);
	Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
	}
	@Then("Faculty should click the Sign in Button")
	public void facultyShouldClickTheSignInButton() {
	   LoginPom.facultySigninButton(driver).click();
	}
	@When("Faculty should enter an valid email{string}")
	public void facultyShouldEnterAnValidEmail(String string) {
	    LoginPom.username(driver).sendKeys(string);
	}

	@When("Faculty click the next Button")
	public void facultyClickTheNextButton() {
	    LoginPom.nextBtn(driver).click();
	}

	@Then("Faculty click the forgot password{string}")
	public void facultyClickTheForgotPassword(String string) {
	    LoginPom.facultyforgotPAss(driver).click();
	}

	@Then("Faculty should verify its successfully click")
	public void facultyShouldVerifyItsSuccessfullyClick() {
		String Expectedtest ="PLATFORM FEATURES";
		String actualtext = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div/div/h1")).getText();
		System.out.println(actualtext);
	Assert.assertTrue("get accept", Expectedtest.equals(actualtext));
	}
	@Then("Faculty enter the password{string}")
	public void facultyEnterThePassword(String string) {
	    LoginPom.facultyPassword(driver).sendKeys(string);
	}

	@Then("Faculty click on signin button")
	public void facultyClickOnSigninButton() throws InterruptedException {
	    LoginPom.facultySigninButton(driver).click();
	    
	}
	@Then("click on dashboard Button")
	public void clickOnDashboardButton() throws InterruptedException {
		LoginPom.dashboardButton(driver).click();
		Thread.sleep(5000);
	}

	

	@Then("Faculty should click on index Button")
	public void facultyShouldClickOnIndexButton() throws InterruptedException {
	    LoginPom.indexButton(driver).click();
	    
	    
	}

	
	@Then("Faculty should click on Resume Button")
	public void facultyShouldClickOnResumeButton() throws InterruptedException {
	    LoginPom.resumeButton(driver).click();
	    Thread.sleep(5000);
	}

	
	@Then("Faculty should click on course plan Button")
	public void facultyShouldClickOnCoursePlanButton() throws InterruptedException {
	    LoginPom.coursePlan(driver).click();
	    Thread.sleep(10000);
	}

	
	@Then("Faculty should click on other course Button")
	public void facultyShouldClickOnOtherCourseButton() {
	    LoginPom.otherCourses(driver).click();
	}

	
	

	
	
	@And("Faculty enter the username{string}")
	public void facultyEnterTheUsername(String string) {
		 
			LoginPom.username(driver).sendKeys(string);
	   
	}

	@Then("click the next button and enter password{string}")
	public void clickTheNextButtonAndEnterPassword(String string) {
		LoginPom.nextBtn(driver).click();
		LoginPom.facultyPassword(driver).sendKeys(string);
		LoginPom.signin(driver).click();
	}
	
	@When("User should click on course")
	public void userShouldClickOnCourse() throws Exception {
		LoginPom.courses(driver).click();
		Thread.sleep(2000);
		System.out.println("Clicking On Course Module");
	}



	
	

	//	 Click on create Batch and view details
	//	Tag13


	@When("User should click on courses")
	public void userShouldClickOnCourses() throws Exception {
		
		LoginPom.courses(driver).click();
		Thread.sleep(5000);
		LoginPom.foundationalcourse(driver).click();
		LoginPom.createnewbatch(driver).click();
		

		Thread.sleep(2000);
	}

	
	
//	//	Tag14

	@When("click on create batch")
	public void clickOnCreateBatch() throws Exception {
		LoginPom.courses(driver).click();
		Thread.sleep(5000);
		LoginPom.foundationalcourse(driver).click();
		LoginPom.createnewbatch(driver).click();

		Thread.sleep(5000);
		LoginPom.batchName(driver).sendKeys("Batch111");
		LoginPom.batchNumbers(driver).sendKeys("12");

		Thread.sleep(5000);
		LoginPom.createbatchButton(driver).click();

	}

	


	//	Tag15



	@When("User should click Create BATCH")
	public void userShouldClickCreateBATCH() throws Exception {
		LoginPom.courses(driver).click();
		Thread.sleep(5000);
		LoginPom.foundationalcourse(driver).click();
		LoginPom.copyBatch(driver).click();

		Thread.sleep(3000);
	}

	

	//	Tag16


	@When("User should click Copy BATCH")
	public void userShouldClickCopyBATCH() throws Exception {
		LoginPom.courses(driver).click();
		Thread.sleep(5000);
		LoginPom.foundationalcourse(driver).click();
		LoginPom.copyBatch(driver).click();
		LoginPom.batchName(driver).sendKeys("Batch200");

		Thread.sleep(2000);

	}

	

	//	Tag17


	@When("User should click on Start course")
	public void userShouldClickOnStartCourse() throws Exception {
		LoginPom.courses(driver).click();
		Thread.sleep(5000);
	LoginPom.foundationalcourseStartButton(driver).click();	
	LoginPom.startcourseOkButton(driver).click();
	LoginPom.preparationMode(driver).click();

		Thread.sleep(3000);
	}

	

	//Tag18


	@When("User should see the batch names in dropdown options")
	public void userShouldSeeTheBatchNamesInDropdownOptions() throws Exception {
		LoginPom.courses(driver).click();
		Thread.sleep(5000);
		LoginPom.foundationalcourseStartButton(driver).click();	
		LoginPom.startcourseOkButton(driver).click();
		LoginPom.preparationMode(driver).click();
		LoginPom.userbatchSwitch(driver).click();
		

		Thread.sleep(2000);


	}

	
	//Tag19


	@When("click on mock test")
	public void clickOnMockTest() throws Exception {
		LoginPom.courses(driver).click();
		Thread.sleep(5000);
		LoginPom.foundationalcourseStartButton(driver).click();	
		LoginPom.startcourseOkButton(driver).click();
		LoginPom.preparationMode(driver).click();



		JavascriptExecutor js=(JavascriptExecutor)driver;

		WebElement MockTest=LoginPom.mockTest(driver);
		js.executeScript("arguments[0].scrollIntoView();",MockTest);
		LoginPom.mockTest(driver).click();

		Thread.sleep(3000);

	}

	@Then("click on play button")
	public void clickOnPlayButton() throws Exception {
		LoginPom.coursestartgreter(driver).click();
		

		Thread.sleep(3000); 
		
		System.out.println("Clicking On Mock Test");
	}

	//Tag20


	@When("Faculty should click on quizzes")
	public void facultyShouldClickOnQuizzes() throws Exception {
		LoginPom.courses(driver).click();
		Thread.sleep(5000);
		LoginPom.foundationalcourseStartButton(driver).click();	
		LoginPom.startcourseOkButton(driver).click();
		LoginPom.preparationMode(driver).click();
		

		Thread.sleep(3000);
		LoginPom.facultyquizzes(driver).click();


	}

	
	//Tag21


		@When("Faculty should click Quizzes")
		public void facultyShouldClickQuizzes() throws Exception {
			LoginPom.courses(driver).click();
			Thread.sleep(3000);
			LoginPom.foundationalcourseStartButton(driver).click();	
			LoginPom.startcourseOkButton(driver).click();
			LoginPom.preparationMode(driver).click();
			

			Thread.sleep(3000);
			LoginPom.facultyquizzes(driver).click();

		}

		@Then("Faculty should click on take quizzes")
		public void facultyShouldClickOnTakeQuizzes() throws InterruptedException {
			LoginPom.facultytakequizzes(driver).click();
			
			
			System.out.println("Faculty should click on take quizzes");
			Thread.sleep(3000);
		}


		//Tag22


		@When("Faculty should should take Quizz")
		public void facultyShouldShouldTakeQuizz() throws Exception {
			LoginPom.courses(driver).click();
			Thread.sleep(3000);
			LoginPom.foundationalcourseStartButton(driver).click();	
			LoginPom.startcourseOkButton(driver).click();
			LoginPom.preparationMode(driver).click();

			Thread.sleep(3000);
			LoginPom.facultyquizzes(driver).click();

		}

		@Then("Faculty should click on view quizz Results")
		public void facultyShouldClickOnViewQuizzResults() throws Exception {
			

			
			LoginPom.viewquizzeresult(driver).click();

			System.out.println("Faculty should click on view quizz Results");
			Thread.sleep(3000);
		}
		

		//Tag23

		@When("Faculty should see th Practice Venture")
		public void facultyShouldSeeThPracticeVenture() throws InterruptedException {
			LoginPom.courses(driver).click();
			Thread.sleep(3000);
			LoginPom.foundationalcourseStartButton(driver).click();
			LoginPom.startcourseOkButton(driver).click();

			Thread.sleep(3000);
			LoginPom.preparationMode(driver).click();

			Thread.sleep(3000);
		}

		@Then("Faculty should click on Practice Venture")
		public void facultyShouldClickOnPracticeVenture() throws Exception {
			Thread.sleep(2000);
			LoginPom.facultypracticeventure(driver).click();

			System.out.println("Faculty should click on Practice Venture");
			Thread.sleep(3000);
		}

		//	Tag24

		@When("Faculty should see th PV Milestones")
		public void facultyShouldSeeThPVMilestones() throws InterruptedException {
			LoginPom.courses(driver).click();
			Thread.sleep(3000);
			LoginPom.foundationalcourseStartButton(driver).click();
			LoginPom.startcourseOkButton(driver).click();
			LoginPom.preparationMode(driver).click();

		}

		@Then("Faculty should click on PV Milestones")
		public void facultyShouldClickOnPVMilestones() {
			LoginPom.facultypracticeventure(driver).click();
			
			System.out.println("Faculty should click on PV Milestones");
		}


		//Tag25


		@When("Faculty should take quizz")
		public void facultyShouldTakeQuizz() throws Exception {
			LoginPom.courses(driver).click();
			Thread.sleep(3000);
			LoginPom.foundationalcourseStartButton(driver).click();
			LoginPom.startcourseOkButton(driver).click();
			LoginPom.preparationMode(driver).click();
			Thread.sleep(3000);
			LoginPom.facultyquizzes(driver).click();
			LoginPom.facultytakequizzes(driver).click();
			LoginPom.quizzessubmit(driver).click();

		}

		@Then("Faculty should click on submit")
		public void facultyShouldClickOnSubmit() {
			LoginPom.quizzesyesbutton(driver).click();

			System.out.println("Faculty should click on submit");
		}
	
		//	Tag26

		@When("Faculty should take quizz again")
		public void facultyShouldTakeQuizzAgain() throws Exception {
			LoginPom.courses(driver).click();
			LoginPom.foundationalcourseStartButton(driver).click();
			LoginPom.startcourseOkButton(driver).click();
			LoginPom.preparationMode(driver).click();
			Thread.sleep(3000);

			Thread.sleep(3000);
			LoginPom.facultyquizzes(driver).click();
			LoginPom.facultytakequizzes(driver).click();


		}

		@Then("Faculty should Re-attempt quizz")
		public void facultyShouldReAttemptQuizz() {
			LoginPom.quizzesyedittries(driver).click();
			LoginPom.quizzessubmit(driver).click();

			System.out.println("Faculty should Re-attempt quizz");
		}
		

		//Tag27


		@When("Faculty should see the report module")
		public void facultyShouldSeeTheReportModule() throws Exception {
			LoginPom.courses(driver).click();
			Thread.sleep(2000);
			LoginPom.foundationalcourseStartButton(driver).click();
			LoginPom.startcourseOkButton(driver).click();
			

			Thread.sleep(3000);
			LoginPom.preparationMode(driver).click();



		}

		
		@Then("Faculty should click on Report Module")
		public void facultyShouldClickOnReportModule() throws Exception {
			LoginPom.reports(driver).click();
			

			Thread.sleep(3000);
			
			System.out.println("Faculty should click on Report Module");

		}


		//Tag28


		@When("Faculty should see the Notification icon")
		public void facultyShouldSeeTheNotificationIcon() throws InterruptedException {
			LoginPom.notificationIcon(driver).click();

			Thread.sleep(3000);
		}

		




		
		//Tag29


		@When("Faculty should see th Faculty Notes")
		public void facultyShouldSeeThFacultyNotes() throws InterruptedException {
			LoginPom.courses(driver).click();
			Thread.sleep(3000);
			LoginPom.foundationalcourseStartButton(driver).click();
			LoginPom.startcourseOkButton(driver).click();

			Thread.sleep(2000);
			LoginPom.preparationMode(driver).click();

		}

		@Then("Faculty should click on Faculty Notes")
		public void facultyShouldClickOnFacultyNotes() throws Exception {
			LoginPom.facultyNotes(driver).click();

			Thread.sleep(2000);
			
			System.out.println("Faculty should click on Faculty Notes");


		}
		//Tag30


		@When("Faculty should see the lessons")
		public void facultyShouldSeeTheLessons() throws Exception {
			LoginPom.courses(driver).click();
			Thread.sleep(3000);
			LoginPom.foundationalcourseStartButton(driver).click();
			LoginPom.startcourseOkButton(driver).click();

			Thread.sleep(10000);
			LoginPom.preparationMode(driver).click();
			LoginPom.facultyNotes(driver).click();

			Thread.sleep(2000);
		}

		@Then("Faculty should click on lessons")
		public void facultyShouldClickOnLessons() {
            LoginPom.facultyLessons(driver).click();

		
			System.out.println("Faculty should click on lessons");
		}

		//tag31
		

		@When("Faculty should click on START COURSe")
		public void facultyShouldClickOnSTARTCOURSe() throws InterruptedException {
			LoginPom.courses(driver).click();
			Thread.sleep(3000);
			LoginPom.foundationalcourseStartButton(driver).click();
			LoginPom.startcourseOkButton(driver).click();

		}

		@Then("Faculty should click on teaching")
		public void facultyShouldClickOnTeaching() throws Exception {
			driver.findElement(By.xpath("//button[contains(text(),'Teaching mode')]")).click();
			Thread.sleep(2000);
			
			System.out.println("Faculty should click on teaching");
		}

		//Tag32

		@When("Faculty should see the Manage Batches")
		public void facultyShouldSeeTheManageBatches() throws InterruptedException {
			
			driver.findElement(By.xpath("//a[contains(text(),'MANAGE BATCHES')]")).click();
			Thread.sleep(4000);
		}

		
		//	Tag33


		@When("Faculty should see the edit symbol Manage Batches")
		public void facultyShouldSeeTheEditSymbolManageBatches() throws Exception {
			driver.findElement(By.xpath("//a[contains(text(),'MANAGE BATCHES')]")).click();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/md-content/ul/div/li/div/md-card/md-card-title/md-card-title-text/div[1]/div/i[1]")).click();
            
		}

		@Then("Faculty should click onedit symbol Manage Batches")
		public void facultyShouldClickOneditSymbolManageBatches() {
			System.out.println("Faculty should click onedit symbol Manage Batches");
			
		}

		//	Tag34


		@When("Faculty should see the Chat box")
		public void facultyShouldSeeTheChatBox() throws InterruptedException {
			driver.findElement(By.xpath("//a[contains(text(),'MANAGE BATCHES')]")).click();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
			
			
		}

		@Then("Faculty should click on Chat box")
		public void facultyShouldClickOnChatBox() {
			System.out.println("Faculty should click on Chat box");
			
		}

		//	tag35

		@When("Faculty should see the Manage Students")
		public void facultyShouldSeeTheManageStudents() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, 100);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'MANAGE BATCHES')]"))).click();

			driver.findElement(By.xpath("//a[contains(text(),'MANAGE BATCHES')]")).click();
		
			driver.findElement(By.xpath(" //span[contains(text(),'Active Batches')]//following::div[12]")).click();
		}

		
		//	tag36


		@When("Faculty should see the Run lessons")
		public void facultyShouldSeeTheRunLessons() throws InterruptedException {
			LoginPom.manageBatches(driver).click();

			LoginPom.activeBatches(driver).click();

		}

		

		//	Tag37


		@When("Faculty should see the No Upcoming Module")
		public void facultyShouldSeeTheNoUpcomingModule() throws Exception {
			LoginPom.manageBatches(driver).click();

			LoginPom.activeBatches(driver).click();

		}

		
		

		//	Tag42


		@When("Faculty should see the Save and continue")
		public void facultyShouldSeeTheSaveAndContinue() throws Exception {
			LoginPom.courses(driver).click();
			Thread.sleep(5000);
			LoginPom.foundationalcourseStartButton(driver).click();
			LoginPom.startcourseOkButton(driver).click();
			LoginPom.preparationMode(driver).click();
			
			Thread.sleep(3000);
			LoginPom.facultyquizzes(driver).click();
			
		}

		@Then("Faculty should click save and submit")
		public void facultyShouldClickSaveAndSubmit() throws InterruptedException {
//			LoginPom.facultytakequizzes(driver).click();
//			LoginPom.editSubmit(driver).click();
//			LoginPom.startcourseOkButton(driver).click();
//			
			driver.findElement(By.xpath("//span[contains(text(),'Quizzes')]//following::div[9]")).click();
			driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
			driver.findElement(By.xpath("//*[@id=\"button_submit\"]")).click();
			driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/button[1]")).click();
			System.out.println("save and submit");
			driver.quit();
		}
		@Then("Faculty should  enter valid passkey{string}")
		public void facultyShouldEnterValidPasskey(String string) {
		  LoginPom.facultyPasskey(driver).sendKeys(string);;
		}
		@When("Faculty should enter password{string}")
		public void facultyShouldEnterPassword(String string) {
		    LoginPom.facultynewPassword(driver).sendKeys(string);
		}
		
		@When("Faculty should enter confirm Password{string}")
		public void facultyShouldEnterConfirmPassword(String string) {
			LoginPom.facultyconfirmPassword(driver).sendKeys(string);

		}
		@Then("Faculty click the eula checkbox")

		public void facultyClickTheEulaCheckbox() {
			LoginPom.facultyEulacheckbox(driver).click();
		}
		@Then("Faculty should click on signin Button")
		public void facultyShouldClickOnSigninButton() {
		  LoginPom.facultySigninButton(driver).click();
		}
		@Then("Faculty should click on signin Button is enabled or not")
		public void facultyShouldClickOnSigninButtonIsEnabledOrNot() {
			
		    LoginPom.facultySigninButton(driver).isEnabled();

			System.out.println("not enable");
			}
		@When("Faculty should click on END USER LICENSE AGREEMENT")
		public void facultyShouldClickOnENDUSERLICENSEAGREEMENT() {
		   pom.endUserlicence(driver).click();
		}

		@Then("Faculty should close the browser")
		public void facultyShouldCloseTheBrowser1() {
		    driver.quit();
		}
		
		@Given("faculty should be on yopmail mail home page")
	    public void faculty_should_be_on_yopmail_mail_home_page() {

	 		WebDriverManager.chromedriver().setup();
	 		driver=new ChromeDriver();
	 		
	 		
	 		driver.get("https://yopmail.com/");
	 		driver.manage().window().maximize();
	 		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 		
	    }

	    @When("faculty enter mail id{string}")
	    public void faculty_enter_mail_id(String string) {
	    	
	    	LoginPom.yopMailinput(driver).sendKeys("qapital.faculty11@yopmail.com");;
		
	    }

	    @Then("faculty should click on next arrow button")
	    public void faculty_should_click_on_next_arrow_button() {
	        
	    	LoginPom.yopMailrefresh(driver).click();
	    	
	    }
	    
	    @Then("Faculty should copy temparory password")
	    public void faculty_should_copy_temparory_password() {
	    	String t = "Email : qapital.faculty11@yopmail.com";
	       
	        if ( driver.getPageSource().contains("Email : qapital.faculty11@yopmail.com")){
	           System.out.println("Text: " + t + " is present. ");
	        } else {
	           System.out.println("Text: " + t + " is not present. ");
	        }
	        
	    }
	    @Then("Faculty click the Next Button")
	    public void facultyClickTheNextButton1() throws InterruptedException {
	       
	       WebElement Email=LoginPom.username(driver);
			Email.click();


			
			Email.sendKeys("qapital.faculty11@yopmail.com");
			String NewMail= Email.getAttribute("value");
			System.out.println(NewMail);
			LoginPom.nextBtn(driver).click();

			LoginPom.facultyPasskey(driver).sendKeys("865986");
			LoginPom.facultynewPassword(driver).sendKeys("pass");
			LoginPom.facultyconfirmPassword(driver).sendKeys("pass");
			LoginPom.facultySigninButton(driver).click();
			driver.get("https://yopmail.com/en/");
			LoginPom.YOP_Login(driver).sendKeys(NewMail);

			LoginPom.VerifyYOP_Mail(driver).click();
			
			Thread.sleep(3000);

			driver.switchTo().frame("ifmail");
			String t = "Email : qapital.faculty11@yopmail.com";
		       
	        if ( driver.getPageSource().contains("Email : qapital.faculty11@yopmail.com")){
	           System.out.println("Text: " + t + " is present. ");
	        } else {
	           System.out.println("Text: " + t + " is not present. ");
	        }
	    }
}
