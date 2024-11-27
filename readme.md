# Sonar scanner raises IllegalArgumentExceptions for 20 findbug detectors on one class #1083 

## Project to reproduce this error

Sonar scanner started in the following way: 

```
mvn clean compile sonar:sonar 
    -Dsonar.host.url=??? 
    -Dsonar.login=squ_??? 
    -Dsonar.analysis.buildTag=local-test-1 
    -Dsonar.projectKey=???
```
