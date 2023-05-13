# e-core Challenge

# Project Description

[TEMPO_-_Quality_Assurance_-_Test_Automation_Assessment.pdf](https://github.com/joaomcruz/e-core-challenge/files/11470780/TEMPO_-_Quality_Assurance_-_Test_Automation_Assessment.pdf)


# Scenarios Created & Data Table
- All the scenarios were created accordingly to what was asked on the above attached pdf file. 
- The data that has been provided on the PDF file that should be used as inputs/assertions are on the .feature files. 
- The only difference is that I noticed that not all integer numbers had the floating point (".00") on the pdf file. So, in order to accomplish the expected result the data that refers to integer numbers are in a integer form on the data table, on the.feature files.


# Which technologies were used to create this project ?
I used Java + Selenium + Cucumber to create the test cases. The design patterns applied on this project are Page Object Modeling and Driver Factory. TestNG/JUnit was used as well.

# How to install and run the project
1 - Make sure you have java JDK and maven installed on your computer . If you don't have any of them, please find attached the necessary resources in order to have both of them . If you don't have java JDK yet, I recommend you installing the LTS (Long Term Support) version

- java/jdk tutorial : https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/ 

- maven tutorial : https://www.baeldung.com/install-maven-on-windows-linux-mac

2 - Once you have both of them, copy and paste the following code on your gitbash to clone this repo :

- for SSH : git clone git@github.com:joaomcruz/e-core-challenge.git
- for HTTPS: git clone https://github.com/joaomcruz/e-core-challenge.git

3 - Now that you have the project on your computer, open it with your prefered IDE (I recommend using IntelliJ because of the language/dependency manager ).

4 - With the project open , find the pom.xml file and make sure it downloads all the dependencies that are there. On Intellij a small icon with the Maven symbol appears. If you click on it , it will automatically download everything that's needed .

5 - Done, the project is ready to run.

# How to use the project

- In order to run the tests , you have to trigger the TestRunner class, inside the "runner" folder. This class has some customizable settings , being them the following :

- I added tags to the feature files . By default , the tag that is being used inside the tag is going to run all the tests there. If you want to run only one of the test scenario all you have to do is change the tag on the TestRunner class to match the tag of the scenario(.feature file) you want to run.

- It is also possible to run the tests in parallel. By default, this feature is turned off, but if you want to test it out , just change the statement of the @DataProvider(parallel = false) to @DataProvider(parallel = true) . Save it and it's ready to run the tests in parallel.

- The monochrome option can also be changed to false. I recommend leaving as it is, since it's just a log formatter. Making really easy and better to understand the output of the tests.

- dryRun feature can also be changed to true (it is false by default) . This feature is responsible for running the tests in headed/headless mode. Being false the headed one .

- plugin is a feature that creates beautiful reports. Being one of them in HTML and the other one in JSON (good for CD/CI ) . Those are also customizable. If you don't want to generate these reports, you can remove the feature. All the reports are being saved on the “target” folder.

# DO NOT TOUCH the features and glue words on the TestRunner class . Those are responsible for linking the feature files with the step definitions files.

