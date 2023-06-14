# infosys_code

Files used in Framework:
	
Base.java
	This file contains multiple methods such as initializeBrowser() to launch the browser and takeScreenshot() method fo taking screenshot at the time of testCase Failure.
		
Festivals1.java
This file contains methods(tests) 
	festivals():
•	This method consists of multiple cases such as for getting the list of Festivals and then applied size on the list to get the number of festivals.
•	Test 2 will list out main festivals with similar Sub Festival "Small Night In".
•	Test 3 will list out main festivals with similar Sub Festival "LOL-palooza".
				
	festivalsTest3():
•	This method will return subfestival by taking Main festival as input.
				
FestivalsTest2.java
•	This class contains fetivalTest2() method(test) which returns sequence no of the Festival with sub Festival as input.
		
data.properties
•	This file consists of required properties which we can use in different test classes.

Listeners
•	Which consists pf methods such as onTestStart, onTestSuccess, onTestFailure

textng.xml
•	This file is basically uses to add parameters, listeners, cross-browser parameters, Groupings of different tests etc..
