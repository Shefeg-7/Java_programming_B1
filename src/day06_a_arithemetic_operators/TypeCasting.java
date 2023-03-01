package day06_a_arithemetic_operators;

public class TypeCasting {
    public static void main(String[] args) {
        byte b= 40;
        int i =b; // the byte value is automatically (implicitly) converted to int,becouse byte is smaller than int

        byte b2 = 100;
        int i2 = b2;

        byte b3=100;
        int i3 = b3;

        System.out.println(i2);
    }
}
