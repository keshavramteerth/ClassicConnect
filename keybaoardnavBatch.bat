set projectLocation=F:\WebDriverwork\Connect
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\keyboardnav.xml
pause