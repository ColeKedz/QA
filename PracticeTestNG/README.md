# QA
This repo has been used to practice setting up a testng project. The repo uses TestNG along with Selenium. 

Notes for local environment set up

install jdk

install maven
set environment variables for maven: C:\Program Files\Maven\apache-maven-3.9.9 
MAVEN_HOME: C:\Program Files\Maven\apache-maven-3.9.9
Path: %MAVEN_HOME%\bin OR C:\Program Files\Maven\apache-maven-3.9.9\bin 

NOTE: during set up before I had the Maven folder, the path did not work with the path C:\Program Files\apache-maven-3.9.9 so make sure to create the Maven folder to store the extracted files in

If marketplace is not working, you may need to got to Preferences/ General/ Network Connections/ and at the top use the Active Provider dropdown and select "Manual" 

Install TestNG plugin through eclipse marketplace. Without plugin you will not see the Run | Debug options above your @Test annotation  

see pom.xml for list of dependencies

To view test report after running test, open test-output/emailable-report.html
use report.log( to add entries into this file as the test runs);

