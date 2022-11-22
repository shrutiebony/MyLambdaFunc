package com.Server.springcloudfunction;

import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.function.Function;
@Component
public class UpperCase implements Function<String,String> {
   @Override
   public String apply(String input)
   {
       return input.toUpperCase(Locale.ROOT);
   }
}
