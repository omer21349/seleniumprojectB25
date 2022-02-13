package com.cydeo.tests.day03_ccsSelector_xpath;

public class Test {
    public static void main(String[] args) {

        //System.out.println(finra(10,20));





    }
    public static void finra(int num1,int num2){
        String result="";
        for (int i = num1; i <num2 ; i++) {
            if(i%15==0){
                result="fin";
            }else if(i%5==0){
                result="ra";
            }else if(i%3==0){
                result="finra";
            }else {
                result = i + "";
            }

        }
    }
}
