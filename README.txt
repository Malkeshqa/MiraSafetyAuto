This Test Automation Framework is created using Java + Selenium Web Driver + Maven + TestNG. Which can be used across different web based applications.
In this approach, the endeavor is to build a lot of applications independent reusable keyword components so that they can directly used for another web application without spending any extra effort. 
With this framework in place, whenever we need to automate a web based application, we would not need to start from Eclipse but use the application independent keyword components to the extent possible and create application specific components for the specific needs.

Prerequisites:
---------------
*	Java jdk-1.8 or higher
*	Apache Maven 3 or higher
*	Please refer for any help in Maven.   
*	TestNG      
* 	http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
* 	http://www.tutorialspoint.com/maven/maven_environment_setup.htm


Execution:
---------------
*	Clone the repository.
*	Add Maven in Eclipse
*	Add TestNG in Eclipse
*	To run on local environment use command ....\.\Java-Selenium-TestNG-Automation-Framework> mvn clean test -Pdev


Reporting:
---------------
*	The TestNG report generate in testng.xml report resides in the 'src/main/resource' folder.
