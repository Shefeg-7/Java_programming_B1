package day11_if_statements;

public class Drive {
    public static void main(String[] args) {

        /*
        declare variable called speed and assing int value
        based on the speed limit the related message
         */

        int speedLimit=70;


        if (speedLimit >=90){

            System.out.println(" Your speed limit is required  jail");
            if( speedLimit>= 80) {
                System.out.println(" Your speed limit requires DL suspension");
            } else if (speedLimit>= 60){
                System.out.println("yor speed limit requires court");
            } else if (speedLimit>= 50){
                System.out.println("yor speed limit requires ticket");
            } else if (speedLimit>= 35){
                System.out.println("Going slow");
            } else if (speedLimit<=10){
                System.out.println("Not valid");

            }
        }




    }
}
