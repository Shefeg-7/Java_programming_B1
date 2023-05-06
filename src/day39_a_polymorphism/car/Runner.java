package day39_a_polymorphism.car;


    class Runner {
        public static void main(String[] args) {
            Car car = new Car();
            Dealership.lease(1);
            Dealership.lease(car);


            Tesla tesla = new Tesla();
            Dealership.lease(2);
            Dealership.lease(tesla);


            Dealership.lease(new LandRover());
            Dealership.lease(new Toyota());
            Dealership.lease(new Ford());

        }
    }


