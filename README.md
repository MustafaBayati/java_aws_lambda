# Run Spring Boot AWS Lambda
Simple code for aws lambda handle and how to have microservice with java using spring boot


The key to run java on lambda by having a handler, Lambda is awesome tools to have microservices and reduce your runtime cost also to have a small projects and easy to maintain,

Spring boot is cool tools helps you to do multi tasks in the same base code,

In the other side Lambda meant to run one task,

In my code I got example of user registration, imagine you have a system has 50 APIs! that's mean you will end with 50 lambda functions, good luck!

You can have multi tasks related to the same service, like users, all can be in the same lambda function, and whenever you need to do update on users, you will have on service to update and one lambda function will be affected, think about it! it's cool.



# What you need to run spring boot handler and API's:

#application.properties: spring.main.allow-bean-definition-overriding=true
#dependency: com.amazonaws.serverless
#StreamLambdaHandler.java: here where lambda start your java code.
#Define the basePackages: where you will have the API's methods/mapping.



More to know about :
https://docs.aws.amazon.com/lambda/latest/dg/java-handler.html

https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-limits.html

https://www.serverless.com/blog/keep-your-lambdas-warm
