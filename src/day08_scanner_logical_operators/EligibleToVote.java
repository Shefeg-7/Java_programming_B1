package day08_scanner_logical_operators;

public class EligibleToVote {
    public static void main(String[] args) {

        /*
        Is eligible to vote
         */

        String name = "Tom";
        boolean isCitizen = true;
        boolean hasCriminalBackground= true;
        int age=49;
        boolean isEligible;

        isEligible= age>= 18 && isCitizen && !hasCriminalBackground;

        System.out.printf(name +"Is eligible to vote"+ isEligible);




    }



}
