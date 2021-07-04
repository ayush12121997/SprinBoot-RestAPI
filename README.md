## SpringBoot-RestAPI
This is a RestAPI demo using SpringBoot. The API works on SpringBoot and external HTML files are used to test it.

### How to run the project?
***Step 1***: Download the code on your machine and unzip it to a desired folder.

***Step 2.a***: Open EclipseIDE or any other JAVA IDE that suppors Maven and Spring. <br>
***Step 2.b***: In the IDE, import a Maven project. <br>
***Step 2.c***: When asked for the source, navigate to the folder 'spring-boot-demo-restapi' in your downloaded code.

***Step 3***: To run the RestAPI, run the file 'SpringBootDemoRestapiApplication.java' as a JAVA application. You may choose to do this from the IDE or from the command line as you wish.

***Step 4***(Debugging): If the code does not run properly, and gives the error 'Port already in use', then in your IDE navigate to the 'application.properties' file under the folder src/main/resources.

***Step 5***: Now open the WebApp folder in your downloaded code, and open the file 'registration.html' with a web browser.

***Step 6***: Now you can test the application by registerting users and then try and log in through the login page.

***Step 7.a***: In order to take a look at the database while the server is running, open the following url in your browser - 'http://localhost:8080/h2-console'.<br>
***Step 7.b***(Debugging): If you changed the port in Step-4 above, then make sure to change '8080' in the url to the changed port number.<br>
***Step 7.c***: In the h2-console window, change the JDBC URL to 'jdbc:h2:~/data'.<br>
***Step 7.d***: In the h2-console window, change the User Name to 'ayush'.<br>
***Step 7.e***: In the h2-console window, change the Password to 'ayush123'.<br>
***Step 7.f***: Now click on Connect to enter the database.<br>
***Step 7.g***: To check the entries in the database, enter and run the following query in the space provided - 'SELECT * FROM USER;'

