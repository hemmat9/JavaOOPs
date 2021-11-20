package com.syntax.class19HomeWork;

public class userInfo extends userClass {

    String userAddress;
    userInfo(String userName, String userMobileNumber, String Address){
        super(userName, userMobileNumber);
        userAddress=Address;
    }

    public void printDetail(){
        System.out.println(name+ " "+ mobileNumber+" "+userAddress);
    }

}
