package day39_a_polymorphism.car;



    class Dealership {
        public static void lease (int i) {
            System.out.println("Leasing a car: " + getCar(i));
        }

        public static void lease (Car car) {
            System.out.println("Leasing a car: " + car.getClass().getName());
        }


        // Make a method that accepts option as int and returns the Car based on the option
    /*
     1 -- >  Tesla
     2 -- > LandRover
     3 -- > Toyota
     else -- > car
     */
        public static Car getCar (int option) {
            if (option == 1) {
                return new Tesla();
            } else if (option == 2) {
                return new LandRover();
            } else if (option == 3) {
                return new Toyota();
            } else {
                return new Car();
            }
        }


    }


