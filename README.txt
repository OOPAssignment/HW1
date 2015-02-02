Prerequisites:
	1. Install JDK 7
	2. Add JAVA_HOME in /etc/environments
    3. Install Maven
		sudo apt-get update
		sudo apt-get install maven

            
How to run ?:

	1.  Clean the repository
		    mvn clean
    2.  Compile
            mvn compile
    3.  Package
            mvn package
	4.  Run Acceptance Class TestCreature
		    mvn exec:java
    5   Run Test
		    mvn test
    6   Generate code coverage
		    mvn package
		    Open html file from /target/site/jacoco/index.html
            Ignore acceptance package. Click on com.HW1
                   
