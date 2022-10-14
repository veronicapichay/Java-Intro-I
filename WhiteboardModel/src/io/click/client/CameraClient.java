package io.click.client;/*
 *
 *
 */

import io.click.Camera;

class CameraClient {
    public static void main(String[] args) {

//    Camera cam1 = new Camera();
//    cam1.setBrand("");
//    cam1.setLens();
//    cam1.setAperture();
//    cam1.setShutterSpeed();
//    cam1.setFilmISO();
//    cam1.setWithFlash();
//    System.out.println(cam1);

    Camera cam1 = new Camera();
    cam1.setBrand("Nikon");
    cam1.setLens(60);
    System.out.println(cam1);

    Camera cam2 = new Camera("K100");
    cam2.setLens(50);
    System.out.println(cam2);


    }
}
