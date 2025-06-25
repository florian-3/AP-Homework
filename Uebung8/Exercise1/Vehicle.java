package Uebung8.Exercise1;


    public abstract class Vehicle {
        protected String brand;
        protected boolean hasTuv;

        public Vehicle(String brand, boolean hasTuv) {
            this.brand = brand;
            this.hasTuv = hasTuv;
        }

        public boolean hasTuv() {
            return hasTuv;
        }

        public String getBrand() {
            return brand;
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + " - " + brand + " (TÜV: " + hasTuv + ")";
        }
    }


