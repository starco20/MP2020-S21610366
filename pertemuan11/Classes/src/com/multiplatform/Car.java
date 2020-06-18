package com.multiplatform;

public class Car {

        private String model;
        private int doors;
        private int wheels;
        private String engine;

        public void setModel(String model){
            String validMod = model.toLowerCase();
            if (validMod.equals("mitsubishi") || validMod.equals("ngengeng")) {
                this.model = model;
            }else {

            }
            this.model = "Unknow";
        }

        public String getModel(){
            return this.model;
        }

}
