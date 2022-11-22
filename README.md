This is a simple Maven project, which can be deployed as a lambda function on AWS.

Steps:
1) Clean and install the project. Find an aws jar in the Target folder.
2) Create a lambda function, give java as the runtime environment.
3) Provide the handler as "org.springframework.cloud.function.adapter.aws.FunctionInvoker"
4) Upload the aws jar and run the tests
