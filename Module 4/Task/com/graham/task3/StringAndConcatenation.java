package com.graham.task3;



public class StringAndConcatenation {
    public static void main(String[] args) {
        int MyAge = 26;
        String affirm= "I am";
        String NoOfYears = "years old";
        String sentence = affirm + " " +  MyAge + " " + NoOfYears;
        System.out.println(sentence);

      String NewWord =  affirm.concat(MyAge + " " + NoOfYears);
      System.out.println(NewWord);



    }
}
