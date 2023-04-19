This is a simple Maven ( Spring Boot) project, which can be deployed as a lambda function on AWS.

Steps:
1) Open this project in an IDE like Intellij or Eclipse
2) Clean and install the project. Find an aws jar in the Target folder.
3) Create a lambda function, give java as the runtime environment.
4) Provide the handler as "org.springframework.cloud.function.adapter.aws.FunctionInvoker"
5) Upload the aws jar and run the test


The Spring Boot application uses Spring for AWS Lambda.


- Run the Spring Boot application which will be deployed on AWS Lambda
## Packaging 

The Maven plugin maven-resources-plugin will copy the contents of the build directory into `/target/static/classes`. 
Once the artifact has been created you can run the application using the following command: 

` java -jar target/spring-books-0.0.1-SNAPSHOT.jar`
