Feature: Login Wadhwani

  @tag1
  Scenario Outline: FA_01,FA_24Login Functionality with valid credentials
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter valid "<username>"
    Then Faculty should verify success message
    Then Faculty should close the Browser

    Examples: 
      | username                    |
      | qapital.faculty@yopmail.com |
@tag2
  Scenario Outline: FA_05 Verify Faculty should able to enter valid passkey or not
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    Then Faculty should close the browser
     Examples:
    | username                      | passkey | 
      | qapital.faculty01@yopmail.com |  884259 |
    
  @tag3 
    Scenario Outline: FA_07 Verify Faculty should able to set password or not
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
     Then Faculty should close the browser
    Examples: 
      | username                      | passkey | password |
      | qapital.faculty01@yopmail.com | 884259    | pass     |
    
    
     @tag4
    Scenario Outline: FA_08 Verify if Faculty can enter only Uppercase letters
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
     Then Faculty should close the browser
    Examples: 
      | username                      | passkey | password |
      | qapital.faculty01@yopmail.com | 884259    | PASS   |
    
    
    
    
     @tag5
    Scenario Outline: FA_09 Verify if Faculty can enter only Lowercase letters
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
     Then Faculty should close the browser
    Examples: 
      | username                      | passkey | password |
      | qapital.faculty01@yopmail.com | 884259    | pass   |
    
    
      @tag6
    Scenario Outline: FA_10 Verify if Faculty can enter the combination of lowecase and uppercase as new password
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
     Then Faculty should close the browser
    Examples: 
      | username                      | passkey | password |
      | qapital.faculty01@yopmail.com | 884259    | PAss   |
    @tag7
  Scenario Outline: FA_11 Faculty can enter the combination of alphabets,special characters and digits as new password
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
    Then Faculty should close the browser

    Examples: 
      | username                      | passkey | password |
      | qapital.faculty01@yopmail.com |  884259 | pass@123 |

  @tag8
  Scenario Outline: FA_13 Faculty can enter the password in Confirm password textfield
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
    And Faculty should enter confirm Password"<password2>"
    Then Faculty should close the browser

    Examples: 
      | username                      | passkey | password | password2 |
      | qapital.faculty01@yopmail.com |  884259 | pass@123 | pass@123  |

  @tag9
  Scenario Outline: FA_14 Faculty can enter only Uppercase letters
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
    And Faculty should enter confirm Password"<password2>"
    Then Faculty should close the browser

    Examples: 
      | username                      | passkey | password | password2 |
      | qapital.faculty01@yopmail.com |  884259 | PASS     | PASS      |

  @tag10
  Scenario Outline: FA_15 Faculty can enter only lowerercase letters
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
    And Faculty should enter confirm Password"<password2>"
    Then Faculty should close the browser

    Examples: 
      | username                      | passkey | password | password2 |
      | qapital.faculty01@yopmail.com |  884259 | pass     | pass      |

  @tag11
  Scenario Outline: FA_16 Faculty can enter the combination of lowecase and uppercase as Confirm password
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
    And Faculty should enter confirm Password"<password2>"
    Then Faculty should close the browser

    Examples: 
      | username                      | passkey | password | password2 |
      | qapital.faculty01@yopmail.com |  884259 | PASS     | PAss      |

  @tag12
  Scenario Outline: FA_17 Faculty can enter the combination of alphabets,special characters and digits as Confirm password
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
    And Faculty should enter confirm Password"<password2>"
    Then Faculty should close the browser

    Examples: 
      | username                      | passkey | password | password2 |
      | qapital.faculty01@yopmail.com |  884259 | PASS     | Pass@123  |

  @tag13
  Scenario Outline: FA_18 Faculty can tick the I hereby accept EULA checkbox
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
    And Faculty should enter confirm Password"<password2>"
    Then Faculty click the eula checkbox
    Then Faculty should close the browser

    Examples: 
      | username                      | passkey | password | password2 |
      | qapital.faculty01@yopmail.com |  884259 | PASS     | PASS      |

  @tag14
  Scenario Outline: FA_19 Faculty is shown End user license Agreement page after clicking EULA hyperlink
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
    And Faculty should enter confirm Password"<password2>"
    And Faculty should click on END USER LICENSE AGREEMENT
    Then Faculty should close the browser

    Examples: 
      | username                      | passkey | password | password2 |
      | qapital.faculty01@yopmail.com |  884259 | PASS     | PASS      |

  @tag15
  Scenario Outline: FA_21 error message is shown after clicking on sign in when new password and confirm password entered is different
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
    And Faculty should enter confirm Password"<password2>"
    Then Faculty should click on signin Button
    Then Faculty click the eula checkbox
    Then Faculty should close the browser

    Examples: 
      | username                      | passkey | password | password2 |
      | qapital.faculty01@yopmail.com |  884259 | PASS     | pass      |

  @tag16
  Scenario Outline: FA_22 error message is shown after clicking on signin button when entered random password
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
    And Faculty should enter confirm Password"<password2>"
    Then Faculty should click on signin Button
    Then Faculty click the eula checkbox
    Then Faculty should close the browser

    Examples: 
      | username                      | passkey | password | password2 |
      | qapital.faculty01@yopmail.com |  884259 | PASS     | pass123   |

  @tag17
  Scenario Outline: FA_06 Faculty should able to enter Invalid passkey or not.
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
    And Faculty should enter confirm Password"<password2>"
    Then Faculty should click on signin Button
    Then Faculty click the eula checkbox
    Then Faculty should close the browser

    Examples: 
      | username                      | passkey | password | password2 |
      | qapital.faculty01@yopmail.com | ram     | PASS     | pass      |

  @tag18
  Scenario Outline: FA_20 Sign in button is not enabled without entering any of the three fields
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
    And Faculty should enter confirm Password"<password2>"
    Then Faculty should click on signin Button
    Then Faculty click the eula checkbox
    Then Faculty should close the browser

    Examples: 
      | username                      | passkey | password | password2 |
      | qapital.faculty01@yopmail.com |         |          |           |

  @tag19
  Scenario Outline: Verify Faculty should able to enter invalid email id or not.
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    Then Faculty should close the browser

    Examples: 
      | username                      |
      | qapital.faculty05@yopmail.com |

  @tag20
  Scenario Outline: FA_23 if sign in button is not enabled without ticking the checkbox
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then Faculty click the next Button
    And Faculty should  enter valid passkey"<passkey>"
    When Faculty should enter password"<password>"
    And Faculty should enter confirm Password"<password2>"
    Then Faculty should click on signin Button is enabled or not
    Then Faculty should close the browser

    Examples: 
      | username                      | passkey | password | password2 |
      | qapital.faculty01@yopmail.com | ram     | PASS     | pass      |
    
  @tag21
  Scenario Outline: FA_25 Login Functionality with invalid credentials
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter invalid "<username>"
    Then Faculty should verify its enter success message
    Then Faculty should close the Browser

    Examples: 
      | username    |
      | qapital.com |

  @tag22
  Scenario Outline: FA_2,FA_3,FA_26,FA_27Login Functionality with invalid password
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter invalid "<username>"
    And Faculty should click next Button
    Then Faculty should enter the invalid password"<password>"
    Then Faculty should verify its  success message
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com |     1234 |

  @tag23
  Scenario Outline: FA_28 Signin Button is click or not
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter invalid "<username>"
    And Faculty should click next Button
    Then Faculty should enter the invalid password"<password>"
    And Faculty should click the Sign in Button
    Then Faculty should verify its  success message
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com |     1234 |

  @tag24
  Scenario Outline: FA_29 Forgot password is click or not
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter an valid email"<username>"
    And Faculty click the next Button
    Then Faculty click the forgot password"<forgot password>"
    Then Faculty should verify its successfully click
    Then Faculty should close the Browser

    Examples: 
      | username                    |
      | qapital.faculty@yopmail.com |

  @tag25
  Scenario Outline: FA_31 Signin button is click or not with valid password
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter an valid email"<username>"
    And Faculty click the next Button
    Then Faculty enter the password"<password>"
    Then Faculty click on signin button
    Then Faculty should verify its successfully click
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag26
  Scenario Outline: FA_32, FA_33, FA_34Dashboard is click or not
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter an valid email"<username>"
    And Faculty click the next Button
    Then Faculty enter the password"<password>"
    Then Faculty click on signin button
    Then click on dashboard Button
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag27
  Scenario Outline: FA_35 Index is click or not
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter an valid email"<username>"
    And Faculty click the next Button
    Then Faculty enter the password"<password>"
    Then Faculty click on signin button
    Then click on dashboard Button
    Then Faculty should click on index Button
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag28
  Scenario Outline: FA_36Resume is click or not
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter an valid email"<username>"
    And Faculty click the next Button
    Then Faculty enter the password"<password>"
    Then Faculty click on signin button
    Then click on dashboard Button
    Then Faculty should click on Resume Button
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag29
  Scenario Outline: FA_37 course plan is click or not
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter an valid email"<username>"
    And Faculty click the next Button
    Then Faculty enter the password"<password>"
    Then Faculty click on signin button
    Then click on dashboard Button
    Then Faculty should click on course plan Button
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag30
  Scenario Outline: FA_38, FA_39 other course is click or not
    Given Faculty is on the Learnwise Login Page
    When Faculty should enter an valid email"<username>"
    And Faculty click the next Button
    Then Faculty enter the password"<password>"
    Then Faculty click on signin button
    Then click on dashboard Button
    Then Faculty should click on other course Button
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag31
  Scenario Outline: FA_40, FA_41, FA_42, FA_43 Verify Faculty should able to click on start courses or not
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When User should click on course
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag32
  Scenario Outline: FA_44 Click on create Batch
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When User should click on courses
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag33
  Scenario Outline: FA_45 Entering Batch Details
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When click on create batch
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag34
  Scenario Outline: FA_46 Copy Batch Details
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When User should click Create BATCH
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag35
  Scenario Outline: FA_47,FA_48,FA_49 Enter copy batch details
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When User should click Copy BATCH
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag36
  Scenario Outline: FA_50Clicking on Start Course
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When User should click on Start course
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag37
  Scenario Outline: FA_51Changing Batch
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When User should see the batch names in dropdown options
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag38
  Scenario Outline: FA_52,FA_53 Faculty should give mock test
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When click on mock test
    Then click on play button
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag39
  Scenario Outline: FA_54,FA_55,FA_56 Faculty should take Quizzes
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should click on quizzes
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag40
  Scenario Outline: FA_57,FA_58Faculty taking Quizzes
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should click Quizzes
    Then Faculty should click on take quizzes
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag41
  Scenario Outline: FA_59,FA_61Faculty should view quizz results
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should should take Quizz
    Then Faculty should click on view quizz Results
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag42
  Scenario Outline: FA_62,FA_63 Faculty should take quizz
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should take quizz
    Then Faculty should click on submit
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag43
  Scenario Outline: FA_65Verify Faculty should view Practice Venture
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should see th Practice Venture
    Then Faculty should click on Practice Venture
     Then Faculty should close the Browser
    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag44
  Scenario Outline: FA_70-FA_76Verify Faculty should view PV Milestones
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should see th PV Milestones
    Then Faculty should click on PV Milestones
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag45
  Scenario Outline: FA_77 Verify Faculty should click on faculty notes
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should see th Faculty Notes
    Then Faculty should click on Faculty Notes
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag46
  Scenario Outline: FA_78Verify Faculty should see the lessons
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should see the lessons
    Then Faculty should click on lessons
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag47
  Scenario Outline: FA_92-FA_94Verify Faculty should click on report tab
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should see the report module
    Then Faculty should click on Report Module
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag48
  Scenario Outline: FA_95,FA_96Verify Faculty should click on Notification icon
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should see the Notification icon
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag49
  Scenario Outline: FA_60 Faculty should take quizz again
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should take quizz again
    Then Faculty should Re-attempt quizz
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag50
  Scenario Outline: Faculty should be in teaching mode
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should click on START COURSe
    Then Faculty should click on teaching
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag51
  Scenario Outline: FA_79Faculty should be in Manage Batches
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should see the Manage Batches
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag52
  Scenario Outline: FA_87 Faculty should be in Run lessons
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should see the Run lessons
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag53
  Scenario Outline:  Faculty should be in No Upcoming Module
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should see the No Upcoming Module
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  @tag54
  Scenario Outline: FA_64 Faculty should save and submit quizz
    Given Faculty is on the Learnwise Login Page
    And Faculty enter the username"<username>"
    Then click the next button and enter password"<password>"
    When Faculty should see the Save and continue
    Then Faculty should click save and submit
    Then Faculty should close the Browser

    Examples: 
      | username                    | password |
      | qapital.faculty@yopmail.com | Pass@123 |

  
     @tag55
  Scenario Outline: FA_29 Forgot password is click or not
    Given Faculty is on the Learnwise Login Page
   Then Faculty click the Next Button
   Then Faculty should close the Browser

    Examples: 
      | username                    |password|
      |  ||