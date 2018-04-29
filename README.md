# EndpointChatDataParsing

Test project to create Snapengage endpoint. Chat model has been installed to a webpage of endpoint and showed used Integration API of SnapEngage.


## Technical specifications
- Java 1.8
- Spring boot 2.0.0.RELEASE
- Maven 4.0
- H2 database 1.4
- JPA and Hibernate
- thymeleaf
- Google gson


## Setup:

- Clone repository.
Sh
$ Git clone https://github.com/Boburmirzo/EndpointChatDataParser.git
(I.e.
- Build with maven.
Sh
$ Mvn clean package
(I.e.
- Run with the tomcat embedded spring boot.
Sh
$ Mvn spring-boot: run
(I.e.
- The application is available at: ** http: // localhost: 8080 **

## Description

#EndPointRestController class

There is a POST API method which receives messages and chat transcripts from SnapEngage and it stores all data into database

http://localhost:8080/request/v1 POST Method

Tables:

RequestDO
RequesterDetailsDO
JavascriptVariableDO
TranscriptDO
PluginDO
OperatorVariableDO

#EndPointController class

To visualize data of received messages
