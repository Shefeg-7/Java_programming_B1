package day35_inheritance.person;




public class AudioBook extends Book {

    double duration;
    String narrator;

    public void listen() {
        System.out.println("Listening the audio book " + title + " by " + author);
    }



}