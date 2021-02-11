package com.Ashokit.maven_proj_1;

import com.Ashokit.security.SecurityUtils;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String encodedText=SecurityUtils.encode("Jyoti");
        System.out.println(encodedText);
        String decodedText=SecurityUtils.decode(encodedText);
        System.out.println(decodedText);
         
    }
}
