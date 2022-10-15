package io.click.client;

import io.click.Camera;

class CameraValidationTest {
    public static void main(String[] args) {

//        Camera cam1 = new Camera();
//
//        cam1.setCapacity(1);
//        System.out.println(cam1.getCapacity());
//
//        cam1.setCapacity(36);
//        System.out.println(cam1.getCapacity());
//
//        cam1.setCapacity(0);
//        System.out.println(cam1.getCapacity());
//
//        cam1.setCapacity(37);
//        System.out.println(cam1.getCapacity());

        Camera cam2 = new Camera();

        //check boundaries for valid values in volume
        cam2.setAperture("f22"); //valid - no error message and the 1 should stick
        System.out.println(cam2.getAperture());

        cam2.setAperture("f11"); //valid - no error message and the 1 should stick
        System.out.println(cam2.getAperture());

        cam2.setAperture("f8"); //valid - no error message and the 1 should stick
        System.out.println(cam2.getAperture());

        cam2.setAperture("f5.6"); //valid - no error message and the 1 should stick
        System.out.println(cam2.getAperture());

        cam2.setAperture("f4"); //valid - no error message and the 1 should stick
        System.out.println(cam2.getAperture());

        cam2.setAperture("f16"); //valid - no error message and the 1 should stick
        System.out.println(cam2.getAperture());

        cam2.setAperture("f33"); //valid - no error message and the 1 should stick
        System.out.println(cam2.getAperture());





    }
}
