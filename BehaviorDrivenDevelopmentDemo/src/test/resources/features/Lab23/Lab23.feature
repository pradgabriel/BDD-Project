Feature: Lab23

@LabExercise23
Scenario Outline: Test scenario
	Given User launches the new URL "urlLab23"
	When Enter user clicks on Signup Here
	And  Enters the First Name on singup "<FirstName>"
	And  Enters the Last name on Siginup "<LastName>"
	And  Enters the gender 
	And  Enters DOB on Signup "<DOB>"
	And  Enters SSN Sign up "<SSN>"
	And Enters Email Address on Signup "<Email>"
	And Enters Password on Singup "<Password>"
	Then Confirms Password on Singup "<confirmPassword>"
	
	Examples:
	|FirstName|LastName|DOB|SSN|Email|Password|confirmPassword|
	|pradeep|test1|06/12/1233|p@gmail.com|pass|pass|
	|Bani|test1|06/12/1233|p@gmail.com|pass|pass|

