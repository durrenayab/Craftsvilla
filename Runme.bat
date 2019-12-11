Set projectLocation=C:\Edurekaworkspace\Framework
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\libraries\*
java org.testng.TestNG %projectLocation%\testng.xml
pause
