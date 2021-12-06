package com.pom;

import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.utils.IOUtils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPom {

		public static WebElement batch101(WebDriver driver) {
		
		return driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/div[1]/div/div[76]/div/div[1]/div[3]/a\\n"));
	}
		
		public static WebElement username(WebDriver driver) {
			
			return driver.findElement(By.id("input_0"));
		}
		public static WebElement YOP_Login(WebDriver driver) {
			return  driver.findElement(By.xpath("//input[@id='login']"));
		}
		public static WebElement VerifyYOP_Mail(WebDriver driver) {
			return  driver.findElement(By.xpath("//i[@class='material-icons-outlined f36']"));
		}
		public static WebElement Verify_YopMailId(WebDriver driver) {
			return  driver.findElement(By.xpath("//button[text()='Verify Email']"));
		}

		public static WebElement nextBtn(WebDriver driver) {
			
			return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/header/div/div/div[2]/div/div/div/div[2]/form/button"));
		
		}
		
                 public static WebElement facultyforgotPAss(WebDriver driver) {
                	
                 return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/header/div/div/div[2]/div/div/div/div[2]/div[2]"));
                 }

                 public static WebElement facultyPassword(WebDriver driver) {
                	
                 return driver.findElement(By.id("password"));
                 }
                 
                 public static WebElement facultySigninButton(WebDriver driver) {
                	 
                     return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/header/div/div/div[2]/div/div/div/div[2]/form/button"));
                     }
                 
                 public static WebElement dashboardButton(WebDriver driver) {
             		
                     return driver.findElement(By.xpath("/html/body/div[2]/div/div/nav/div/div/div[3]/div/div/div/div[1]/div/ul[1]/li[1]/a"));
                     }
                 
                 
                 public static WebElement indexButton(WebDriver driver) {
                	
             		
                     return driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[1]/div/div[1]/div[2]"));
                     } 
            
                 public static WebElement resumeButton(WebDriver driver) {
               		
                     return driver.findElement(By.xpath(" /html/body/div[4]/div[2]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a/div"));
                     } 
                 public static WebElement coursePlan(WebDriver driver) {
               
             		
                     return driver.findElement(By.xpath(" /html/body/div[4]/div[2]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/a/div"));
                     } 
              
public static WebElement otherCourses(WebDriver driver) {

	
return driver.findElement(By.xpath(" /html/body/div[4]/div[2]/div[1]/div/div[2]/div/div[1]/div[5]/a/div"));
} 

public static WebElement courses(WebDriver driver) {
	
	return driver.findElement(By.xpath("//a[@title='Courses']"));
}
public static WebElement signin(WebDriver driver) {
	
	return driver.findElement(By.xpath("//button[@type='submit']"));
}
public static WebElement endUserlicence(WebDriver driver) {
	return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/header/div/div/div[2]/div/div/div/div[2]/form/div/div/a[1]"));
}
public static WebElement facultyEulacheckbox(WebDriver driver) {
	return driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/header/div/div/div[2]/div/div/div/div[2]/form/div/md-checkbox"));
	
}
public static WebElement facultyconfirmPassword(WebDriver driver) {
	return driver.findElement(By.id("input_3"));
	
}
public static WebElement facultynewPassword(WebDriver driver) {
	return driver.findElement(By.id("input_2"));
	
}
public static WebElement facultyPasskey(WebDriver driver) {
	return driver.findElement(By.id("input_1"));
}
public static WebElement foundationalcourse(WebDriver driver) {
	return driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[2]"));
	
}
public static WebElement createnewbatch(WebDriver driver) {
	return driver.findElement(By.xpath("//span[contains(text(),'CREATE NEW BATCH')]"));
	
}

public static WebElement batchName(WebDriver driver) {
	return driver.findElement(By.xpath("//input[@id='input_0']"));
	
}

public static WebElement batchNumbers(WebDriver driver) {
	return driver.findElement(By.xpath("//input[@id='input_1']"));
	
}
public static WebElement createbatchButton(WebDriver driver) {
	return driver.findElement(By.xpath("//input[@id='input_1']//following::button[1]"));
	
}
public static WebElement copyBatch(WebDriver driver) {
	return driver.findElement(By.xpath("//span[contains(text(),'COPY BATCH')]"));
	
}
public static WebElement foundationalcourseStartButton(WebDriver driver) {
	return driver.findElement(By.xpath("//span[contains(text(),' Foundational Course in Entrepreneurship V3 ')]//following::span[1]"));
	
}
public static WebElement startcourseOkButton(WebDriver driver) {
	return driver.findElement(By.xpath("//button[contains(text(),'Ok')]"));
	
}
public static WebElement preparationMode(WebDriver driver) {
	return driver.findElement(By.xpath("//button[contains(text(),'Preparation mode')]"));
	
}
public static WebElement userbatchSwitch(WebDriver driver) {
	return driver.findElement(By.xpath("//select[@id='user-batch-switch']"));
	
}
public static WebElement shyamalaTesting(WebDriver driver) {
	return driver.findElement(By.xpath("//option[contains(text(),'FCV3_Shyamalima Testing')]"));
	
}
public static WebElement startcourseOkButton1(WebDriver driver) {
	return driver.findElement(By.xpath("//button[contains(text(),'Ok')]"));
	
}
public static WebElement mockTest(WebDriver driver) {
	return driver.findElement(By.xpath("//span[contains(text(),'Mock Test')]"));
	
}
public static WebElement coursestartgreter(WebDriver driver) {
	return driver.findElement(By.xpath("//span[@class='course_start_greter']"));
	
}
public static WebElement facultyquizzes(WebDriver driver) {
	return driver.findElement(By.xpath("//a[contains(text(),'Quizzes')]"));
	
}
public static WebElement facultytakequizzes(WebDriver driver) {
	return driver.findElement(By.xpath("//span[contains(text(),'Quizzes')]//following::div[9]"));
	
}
public static WebElement viewquizzeresult(WebDriver driver) {
	return driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div[1]/div[1]/div[2]/div/a[2]"));
	
}
public static WebElement facultypracticeventure(WebDriver driver) {
	return driver.findElement(By.xpath("//a[@title='Practice Venture']"));
	
}
public static WebElement facultypracticeventure1(WebDriver driver) {
	return driver.findElement(By.xpath("//a[@title='Practice Venture']//following::a[1]"));
	
}
public static WebElement quizzessubmit(WebDriver driver) {
	return driver.findElement(By.xpath("//input[@id='button_submit']"));
	
}
public static WebElement quizzesyesbutton(WebDriver driver) {
	return driver.findElement(By.xpath("//button[contains(text(),'Yes')]"));
	
}
public static WebElement quizzesyedittries(WebDriver driver) {
	return driver.findElement(By.xpath("//input[@id='edit-tries-0']"));
	
}
public static WebElement reports(WebDriver driver) {
	return driver.findElement(By.xpath("//a[contains(text(),'Reports')]"));
	
}
public static WebElement notificationIcon(WebDriver driver) {
	return driver.findElement(By.xpath("//a[@class='notification-icon-red']"));
	
}
public static WebElement facultyNotes(WebDriver driver) {
	return driver.findElement(By.xpath("//a[@title='Faculty Notes']"));
	
}
public static WebElement facultyLessons(WebDriver driver) {
	return driver.findElement(By.xpath("//div[contains(text(),' FAC Cheat Sheet: Case Study ')]"));
	
}
public static WebElement facultyTeachingmode(WebDriver driver) {
	return driver.findElement(By.xpath("//button[contains(text(),'Teaching mode')]"));
	
}
public static WebElement manageBatches(WebDriver driver) {
	return driver.findElement(By.xpath("//a[contains(text(),'MANAGE BATCHES')]"));
	
}
public static WebElement activeBatches(WebDriver driver) {
	return driver.findElement(By.xpath("//span[contains(text(),'Active Batches')]//following::div[6]"));
	
}
public static WebElement editSubmit(WebDriver driver) {
	return driver.findElement(By.xpath("//input[@id='edit-submit']"));
	
}
public static WebElement yopMailinput(WebDriver driver) {
	return driver.findElement(By.xpath("//input[@class='ycptinput']"));
	
}
public static WebElement yopMailrefresh(WebDriver driver) {
	return driver.findElement(By.xpath("//*[@id=\"refreshbut\"]/button/i"));
	
}




























}
