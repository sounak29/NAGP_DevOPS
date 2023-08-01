#Magento Software Testing Board Automation Suit Information

This is automation test for https://magento.softwaretestingboard.com/. This can be used to test functionality & feature of Magento Software Testing Board website

#Deployment

>_Run Project On Eclipse_

* Step 1: Import the project into eclipse
* Step 2: Navigate to Testng Run folder.<br/>
* Step 3: Open the XML file according to your need.<br/>
* Step 4: Right click on the file 
* Step 5: Select **Run As** option
* Step 6: Click on TestNGSuite

>_Run the project in CMD_

* Extract the file in the desired location.
* Open Cmd in the project directory.
* Run the following command.


```
mvn clean
mvn install

```

#Project Information

>_Package Description_

* com.magento.pages:Defining all the pages action and respective object repository.
* com.magento.util:Defining all the utilities need for the project.
* com.magento.test:Defining all the pages test cases and assertion.
* com.magento.extentreport: Defining all the extent report related class.

>_Folder_

* **Current test results:** folder contain the extent report of current execution folder name apped with current date & time.
* **Archived test results:** folder contain the extent report and screenshot of failed scenario(if any) of previous run.
* **Resource** folder contain config file for all the configuration related info , test data file contain test data, validation 	file to verify assertion and also one value text file to store the current date time details of last execution. 
* **Testng Run:** folder contain all the different type of .XML file to run test in Groups, Parallel or in Sequential manner.
* **test-output** folder contain report generated from TestNG
* **logs** folder contain log4j file
* **FailedScreenshot** folder contain screen shot of failed test cases.

**Note -** Screenshot folder is created only when any test case got failed otherwise its not created.

 
#Reports and Screenshots

* Extent report gets generated after run project ./Current test reults/Extent Report.html
* Extent report of last run is stored in ./Archived testresults/Extent Report.html
* TestNG report as "emailable-report.html" gets generated under ./test-output.
* Screenshots gets placed under ./FailedScreenShot folder with test name.

#Important Information

>Path for importtant file
 
 * TestNG XML file for Parallel Execution : ./Testng Run/ParallelExecutionTestng.xml
 * TestNG XML file for Group wise Execution: ./Testng Run/GroupsExecutionTestng.xml
 * TestNG XML file for Sequential Execution: ./Testng Run/SequentialExecutionTestng.xml
 * Extent Report for Current Execution: ./Current test results/Extent Report.html
 * Extent Report for Last Execution: ./Archived test results/Extent Report.html
 * Configuration File:./Resource/Config.properties.
 * Test Data File: ./Resource/testdata.properties.
 * Assertion validation File: ./Resource/validation.properties
 * log4j2 Properties File:  src/main/resources
 
 
 
 
>How to change Browser

* Step 1: Go to Cofig.properties file in Resource folder.<br/>
* Step 2: Change browsername to "chrome","firefox",or "edge".<br/>




>





