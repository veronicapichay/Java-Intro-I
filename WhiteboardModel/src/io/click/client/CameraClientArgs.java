package io.click.client;

import io.click.Camera;
import io.click.WeatherType;

import java.util.Arrays;

class CameraClientArgs {
    public static void main(String[] args) {

        Camera clientCamera = new Camera();

        switch (args.length) {

            case 2:
                String lens = args[1];
                clientCamera.setLens(Integer.parseInt(args[1]));

            case 1:
                clientCamera.setBrand(args[0]);
        }
        System.out.println("You provided " + args.length + " arguments");
        String brand = args[0];
        int lens = Integer.parseInt(args[1]);

        Camera customCam = new Camera(brand, lens);
        System.out.printf("Thank you for shopping Amazon Prime! Enjoy your new %s", customCam);
    }
}
