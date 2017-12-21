# auto-test framework


## Structure introduction

This structure is composed of multiple modules:

**ui-common** includes all common functions that are used in all projects. Common functions are divided in .java files according to Configurations, reading Excel and Database, TestLogger of Framework

**ui-emoney** includes all testcases and common functions that are used in writing testscripts and executed to test emoney project.

## How to build the project by mvn from command line

Make sure that mvn 3.39 or later version is installed

Make sure that java 1.8 is installed

URL of web project must be available

**Step 1:** On terminal, go to auto-test folder

**Step 2:** Type the command: mvn clean install -Dbrowser=[Brower_Name] -P[SuiteTest_Name] -DbaseUrl=[URL_WEB_PROJECT] -Dmaven.test.skip=false

Where: 

**[Browser_Name]** must be firefox|iexplorer|chrome. If not, firefox is used by default.

**[Suite_Name]** must be id of profile in the ui-emoney/pom.xml.

**[URL_WEB_PROJECT]** must be the url to the project. If not, url will be url_default that is set in Configuration.java file

**Example: mvn clean install -Dbrowser=chrome -PSmoke_Test -DbaseUrl=http://test.emoney.vnpost.vn -Dmaven.test.skip=false**

## How to build the project fron Eclipse tool

Make sure that mvn 3.39 or later version is installed

Make sure that java 1.8 is installed

URL of web project must be available

**Step 1:** On terminal, go to auto-test folder

**Step 2:** Run the command: mvn clean install eclipse:eclipse

**Step 3:** Import the project to Eclipse tool

**Step 4:** Go to src/main/resources --> Suites-> Right-click on a xml file

**Step 5:** Select Run as--> TestNG Suite

# auto-test framework


## Structure introduction
````

This structure is composed of multiple modules:

**ui-common** includes all common functions that are used in all projects. Common functions are divided in .java files according to Configurations, reading Excel and Database, TestLogger of Framework

**ui-emoney** includes all testcases and common functions that are used in writing testscripts and executed to test emoney project.

## How to build the project by mvn from command line

Make sure that mvn 3.39 or later version is installed

Make sure that java 1.8 is installed

URL of web project must be available

**Step 1:** On terminal, go to auto-test folder

**Step 2:** Type the command: mvn clean install -Dbrowser=[Brower_Name] -P[SuiteTest_Name] -DbaseUrl=[URL_WEB_PROJECT] -Dmaven.test.skip=false

Where: 

**[Browser_Name]** must be firefox|iexplorer|chrome. If not, firefox is used by default.

**[Suite_Name]** must be id of profile in the ui-emoney/pom.xml.

**[URL_WEB_PROJECT]** must be the url to the project. If not, url will be url_default that is set in Configuration.java file

**Example: mvn clean install -Dbrowser=chrome -PSmoke_Test -DbaseUrl=http://test.emoney.vnpost.vn -Dmaven.test.skip=false**

## How to build the project fron Eclipse tool

````
cd existing_folder
git init
git remote add origin git@git.teko.vn:qa-qc/demo-automated.git
git add .
git commit
git push -u origin master
````
## Existing Git repository
````
cd existing_repo
git remote add origin git@git.teko.vn:qa-qc/demo-automated.git
git push -u origin --all
git push -u origin --tag
````
Make sure that mvn 3.39 or later version is installed
Make sure that java 1.8 is installed
URL of web project must be available
Step 1: On terminal, go to auto-test folder
Step 2: Run the command: mvn clean install eclipse:eclipse
Step 3: Import the project to Eclipse tool
Step 4: Go to src/main/resources --> Suites-> Right-click on a xml file
Step 5: Select Run as--> TestNG Suite
````
Make sure that mvn 3.39 or later version is installed

Make sure that java 1.8 is installed

URL of web project must be available

**Step 1:** On terminal, go to auto-test folder

**Step 2:** Run the command: mvn clean install eclipse:eclipse

**Step 3:** Import the project to Eclipse tool

**Step 4:** Go to src/main/resources --> Suites-> Right-click on a xml file

**Step 5:** Select Run as--> TestNG Suite
