package day08_scanner_logical_operators;

public class Discount {



                /*
                   declare and assign
                is it the weekend
                are you a teacher
                are you a police officer
                are you a firefighter

             Do you get a discount?
                Must be a weekend day, you must be one of the given professions

               boolean getsDiscount;

                 */
                public static void main(String[] args) {


                    boolean isWeekend = true,
                             isTeacher = false,
                            isPoliceOfficer = false,
                            isFireFighter= false;

                    boolean getsDiscount;
                    getsDiscount = isWeekend && isTeacher || isPoliceOfficer || isFireFighter ;

                    //                 true  &&  false
                    //                 false                                ||  false



                }

    }

