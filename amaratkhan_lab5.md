# Code Review

----
## Login to the system
**Context:** an action that enables the user to authorize to the system under some id with password.

**Scope:**   

**Primary actor:** a coder or a coder reviewer that needs to authorize to the system before submiting a file or leaving a comment, respectively.  
Stakeholders and Interests: any user of the system that tries authorize and interested in the success of the event.

**Precondition:** open the window for loggin in, fill appropriate information on user id and password, etc.  

**Min. Guarantees:** all the information on the user should be stored in the closed database and API. In addition, everything in prospect will be hashed.  

**Success Guarantees:** if user id and password matches to the user id and password in the database, the system will load and the user will get access to the system.  

**Trigger:** a click on the "Login" button and filled matched forms on user id and password with the POST method will initiate the login to the system.

**Main Success Scenario:** user fills the forms, clicks on the "Login" button, id and password matches to those in database, the user authorizes in the system.  
*Step 1.* The user has typed user id and user password.  
*Step 2.* The user clicks on the "Login" button through user interface.  
*Step 3.* The user waits for the match in the database. The user id and user password matches to those in the database.  
*Step 4.* The user gets access to the system under his login.  

**Extensions:** the user is not registered in the system, the user forgots user id or password, the user id and password does not match to those in the database.  
*Step 1 altered.* The user has filled wrong info on user id and password due to the unregistered attempt to access the database. The user then receives alert on the user interface with message that shows unregistered access.  
*Step 1 altered.* The user has filled wrong info on user id and password due to the unmatch in password with user id. The user then receives alert on the user interface with message stating that user fields does not match to the database's instance.  
*Step 1 altered.* The user has forgot one of the attributes required for login action. The user is given an option to click "Forgot password?" button to restore the password for the user id.  

**Related Information:**
The login to the system of code review system needs to have user friendly interface with friendly looking alert messages and easily seen "Login", "Register" or "Forgot password?" buttons.





