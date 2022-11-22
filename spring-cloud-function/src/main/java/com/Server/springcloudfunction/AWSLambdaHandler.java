package com.Server.springcloudfunction;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import org.apache.el.lang.FunctionMapperImpl;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import java.util.function.Function;

public class AWSLambdaHandler extends SpringBootRequestHandler<String, String> {


}
