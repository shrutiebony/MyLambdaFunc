This is a simple Maven ( Spring Boot) project, which can be deployed as a lambda function on AWS.

Steps:
1) Open this project in an IDE like Intellij or Eclipse
2) Clean and install the project. Find an aws jar in the Target folder.
3) Create a lambda function, give java as the runtime environment.
4) Provide the handler as "org.springframework.cloud.function.adapter.aws.FunctionInvoker"
5) Upload the aws jar and run the tests
