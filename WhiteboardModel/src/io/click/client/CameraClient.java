package io.click.client;

import io.click.ApertureTypes;
import io.click.Camera;
import io.click.WeatherType;

import java.util.EnumMap;

class CameraClient {
    public static void main(String[] args) {

        Camera cam1 = new Camera();
        cam1.setBrand("Nikon");
        cam1.setPrice(600.0);
        cam1.setLens(700);
        cam1.setAperture(ApertureTypes.F11);
        cam1.takePicture();

        Camera cam2 = new Camera();
        cam2.setLens(50);
        cam2.takePicture();

        Camera cam3 = new Camera();
        cam3.takePicture();

        System.out.println();

        cam1.empty();
        cam2.empty();
        cam3.empty();

        System.out.println();

        System.out.println(cam1.toString());
        System.out.println(cam2.toString());
        System.out.println(cam3);
    }
}
