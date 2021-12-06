Feature: Login cucumber

@tag1
  Scenario Outline: LW_TC_01 Verify if Student is able to enter email in the Email text field
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should close the browser

    Examples: 
      | username               |
      | student987@yopmail.com |

  @tag2
  Scenario Outline: LW_TC_02 Verify if Next button is enabled without adding the domain to the email
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should verify Next Button is enabled or not
    Then Student should close the browser

    Examples: 
      | username   |
      | student987 |

  @tag3
  Scenario Outline: LW_TC_03 Verify if Next button is enabled without entering the Emailid or not
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should verify Next Button is enabled or not
    Then Student should close the browser

    Examples: 
      | username |
      |          |

  @tag4
  Scenario Outline: LW_TC_04,14,15,16 Verify if Student is able to see the Student Login page after clicking on the next button
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should close the browser

    Examples: 
      | username                |
      | student987@yopmail.com  |
      | student9876@yopmail.com |

  @tag5
  Scenario Outline: LW_TC_05 Verify if Student can enter the password in New password textfield
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter password "<pass>"
    Then Student should close the browser

    Examples: 
      | username               |  | pass      |
      | student246@yopmail.com |  | Admin@123 |
@tag6
  Scenario Outline: LW_TC__06 Verify if Student can enter the combination of lowercase and uppercase as new password
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter password "<pass>"
    Then Student should close the browser

    Examples: 
      | username               |  | pass      |
      | student246@yopmail.com |  | Admin@123 |

  @tag7
  Scenario Outline: LW_TC_07 Verify if Student can click on Sign in button
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter password "<pass>"
    Then Student should able to enter confirm password "<pass>"
    Then Student should close the browser

    Examples: 
      | username               |  | pass      |  | pass      |
      | student246@yopmail.com |  | ADMIadmin |  | ADMIadmin |

  @tag8
  Scenario Outline: LW_TC_08_09 Verify if Sign in button is not enabled without entering any of the the fields
    Given Student is on the Learnwise Login Page
    When student should login with Random Mail Id and should verify that mail
    Then Student should close the browser

    Examples: 
      | username |  | pass |
      |          |  |      |

  @tag9
  Scenario Outline: LW_TC_17,19 Verify whether the student is able to redirect to the home page if he enters the valid emailid
    and valid password.

    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag10
  Scenario Outline: LW_TC_18,20 Verify whether the student is able to login if he uses valid mail id and invalid password
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should close the browser

    Examples: 
      | username                |  | pass   |
      | student1212@yopmail.com |  | passes |
@tag11
  Scenario Outline: LW_TC_21 Verify whether the Student is able view all main features of Dashboard or not.
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag12
  Scenario Outline: LW_TC_22 Verify whether the student is able to click on hamburger or not
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should able to click on Hamburger
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag13
  Scenario Outline: LW_TC_23 Verify whether the Student is able to click on start/ resume or not.
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click on start or resume button
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag14
  Scenario Outline: LW_TC_24 Verify whether the Student is able to click on start/ resume or not.
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click on start or resume button
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag15
  Scenario Outline: LW_TC_27 Verify if Student is able to click on the Course tab
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click on Course Module
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |
@tag16
  Scenario Outline: LW_TC_28 Verify if the join button is enabled or not without entering the batchid
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should see Join Course is enabled or not
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag17
  Scenario Outline: LW_TC_30 Verify if Student is able to click on Join button.
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    And Student should enter Batch id"<BatchId>"
    Then Student should click on Join Course
    Then Student should close the browser

    Examples: 
      | username                |  | pass |  | BatchId        |
      | student1212@yopmail.com |  | pass |  | QAPI-2110-DADA |

  @tag18
  Scenario Outline: LW_TC_32 Verify if Student is able to click on Yes button or not
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click o Batch Name
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag19
  Scenario Outline: LW_TC_34 Verify if Student is able to click on Chat icon.
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click on Chat Icon
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag20
  Scenario Outline: LW_TC_36 Verify if Student can Click on Quizzes
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    And Student should click on Quizzes
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |


@tag21
  Scenario Outline: LW_TC_49 Verify whether the student is able to create te the new venture group without
    providing the mandatory details.

    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then student is able to create to the new venture group without providing the mandatory details
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag22
  Scenario Outline: LW_TC_48_52_60 Verify whether the student is able to create the new venture group
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    And Student should click courses
    Then Student should click on Practice ventures
    Then student should click on create group
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag23
  Scenario Outline: LW_TC_50 Verify whether the student is able to change the batch  name while creating
    the Venture group.

    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    And Student should click courses
    Then Student should create Practice venture group
    Then Student should edit Batch Id
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag24
  Scenario Outline: LW_TC_62 Verify whether the Student is able to view the venture members or not.
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    And Student should click courses
    Then Student should click on PV Milestones
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag25
  Scenario Outline: LW_TC_90_91_92_93_94_95_96_97_98_99 Verify if Student clicks on the Save button
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should Click on profile
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |
@tag26
  Scenario Outline: LW_TC_100 Verify if student is able to click on the notification icon or not
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should Click on Notification icon
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag27
  Scenario Outline: LW_TC_101 Verify if student is able to view the notifications or not.
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should view Notifications
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag28
  Scenario Outline: LW_TC_102 Verify if student is able to click on the reports tab or not
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should Click on Reports
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag29
  Scenario Outline: LW_TC_103 verify if student is able to view the reports or not
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should view Reports
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag30
  Scenario Outline: LW_TC_104 Verify if student is able to view and download the quiz report or not
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should view Download quizz report
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |
@tag31
  Scenario Outline: LW_TC_105 Verify if student is able to view and download the assignment report or not
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should Download quizz report
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag32
  Scenario Outline: LW_TC_106 Verify if student is able to view and download the final assesment report or not
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should view final assesment report
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag33
  Scenario Outline: LW_TC_73 Veriyf if Student clicks on the Submit button
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should able Click on Submit Button
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag34
  Scenario Outline: LW_TC_74 Verify if Student clicks on the back button
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should able Click on Back Button
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag35
  Scenario Outline: LW_TC_76 Verify if Student clicks on Assignment name
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should able Click any PV_Milestone
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |
@tag36
  Scenario Outline: LW_TC_79 Veriyf if Student can view the status as submitted once assignment is uploaded
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should able to check status
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag37
  Scenario Outline: LW_TC_80  Check Student should be click on view submit
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click on start or resume button
    Then Student click on PV milestones Button
    Then Student click on any assignment
    Then Student click on view submission
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag38
  Scenario Outline: LW_TC_81 Check Student should be in milestone2
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click on start or resume button
    Then Student click on PV milestones Button
    Then Student click milestone 2
    Then Student click on view submit
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag39
  Scenario Outline: LW_TC_83,85Check Student should be click on attempt button and verify error
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click on start or resume button
    Then Student click on PV milestones Button
    Then Student click milestone 2
    Then Student click on view submit
    Then Student click on attempt button
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag40
  Scenario Outline: LW_S_S63  Verify whether the student is able to view the assignments or not.
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    And Student should click on start or resume button
    Then click on pvmilestones tab and check whether the student is able to view the assignments.
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |
@tag41
  Scenario Outline: LW_S_S66 Verify whether the student is able to submit the assignment or not
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    And Student should click on start or resume button
    Then click on pvmilestones tab and check whether the student is able to view the assignments.
    Then clik on view details button
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag42
  Scenario Outline: LW_S_S67 Verify whether the student is able to resubmit the assignment
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    And Student should click on start or resume button
    Then click on pvmilestones tab and check whether the student is able to view the assignments.
    Then clik on view details button
    Then click on viewsubmission  button in the selected pv milestone assignment.
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag43
  Scenario Outline: LW_S_S67 	Verify whether the student is able to resubmit the assignment
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    And Student should click on start or resume button
    Then click on pvmilestones tab and check whether the student is able to view the assignments.
    Then clik on view details button
    Then click on resubmit button.
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag44
  Scenario Outline: LW_TC_86,90 Check Student should be able to submit assisment
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    And Student should click on start or resume button
    Then click on pvmilestones tab and check whether the student is able to view the assignments.
    Then clik on view details button
    And student should click on submit
    And student should click on close icon
    And student should click on back button
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag45
  Scenario Outline: LW_TC_52 Verify whether the student is able to cancel the process of creating the
    Venture group in the middle by clicking on the cancel button.

    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    And Student should click courses
    Then student should click on cancel group
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |
@tag46
  Scenario Outline: LW_TC_52 Verify whether the student is able to cancel the process of creating the
    Venture group in the middle by clicking on the cancel button.

    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    And Student should click courses
    Then student should click create group
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag47
  Scenario Outline: LW_TC_86 Check Student should be in home page and see the resume or start button
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    And Student should click on resume or start button
    Then click on pvmilestones tab
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag48
  Scenario Outline: LW_TC_46 LW_TC_55  Verify whether the studentr is able to join the venture group which is created.
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click Resume Button
    Then Student should click on Practice venture tab
    Then Student should click on create_group
    Then Student should fill mandatory fields and click on create
    Then Student should logout from his profile
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1214@yopmail.com |  | pass |

  @tag49
  Scenario Outline: LW_TC_57 LW_TC_58 Verify whether the student admin is able to delete the other students who all
    are there in the venture group.

    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click Resume Button
    Then Student should click on Practice venture tab
    Then Student should click on Join_group
    Then Student should select group name
    Then Student should logout from that profile
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1215@yopmail.com |  | pass |

  @tag50
  Scenario Outline: LW_TC_60 LW_TC_61 Verify whether the Student is able to view the venture members or not.
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click Resume Button
    Then Student should click on Practice venture tab
    Then Student should click View venture members
    Then Student should delete the venture
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1214@yopmail.com |  | pass |

     @tag52
  Scenario Outline: LW_S_S65  and LW_S_S72	Verify whether the student is able to resubmit the assignment
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click Resume Button
    Then click on pvmilestones tab
    And check whether the student is able to view the assignments.
    Then clik on view details button
    Then click on resubmit button
    Then click on remove button and click on choose unsupported file and submit
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag53
  Scenario Outline: LW_S_S71 and LW_S_S73 and LW_S_S77 and LW_S_S78	Verify whether the student is able to resubmit the assignment
     Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click Resume Button
    Then click on pvmilestones tab
    And check whether the student is able to view the assignments.
    Then clik on view details button
    Then click on resubmit button
    Then click on remove button and click on choose file and submit
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag54
  Scenario Outline: Check Student should be in the home page and see all the tabs
   Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag55
  Scenario Outline: Check Student should be in home page and see the resume or start button
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag56
  Scenario Outline: Check Student should be in home page and see the resume or start button
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |
@tag57
  Scenario Outline: LW_S_S62-64  Verify whether the student is able to view the assignments or not.
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click Resume Button
    Then click on pvmilestones tab
    And check whether the student is able to view the assignments.
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag58
  Scenario Outline: LW_S_S66 Verify whether the student is able to resubmit the assignment or not
     Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click Resume Button
    Then click on pvmilestones tab
    And check whether the student is able to view the assignments.
    Then clik on view details button
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag59
  Scenario Outline: LW_S_S67 Verify if Student can view the start date of a course
     Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click Resume Button
    Then click on pvmilestones tab
    And check whether the student is able to view the assignments.
    Then clik on view details button
    Then click on viewsubmission  button in the selected pv milestone assignment.
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |

  @tag60
  Scenario Outline: LW_S_S67 -68	Verify whether the student is able to resubmit the assignment
    Given Student is on the Learnwise Login Page
    When Student should enter valid "<username>"
    Then Student should click Next Button
    Then Student should able to enter valid password "<pass>"
    And Student should click on signIn
    Then Student should click Resume Button
    Then click on pvmilestones tab
    And check whether the student is able to view the assignments.
    Then clik on view details button
    Then click on resubmit button.
    Then Student should close the browser

    Examples: 
      | username                |  | pass |
      | student1212@yopmail.com |  | pass |