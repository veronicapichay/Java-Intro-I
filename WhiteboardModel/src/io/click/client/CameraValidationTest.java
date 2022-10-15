package io.click.client;

import io.click.Camera;

class CameraValidationTest {
    public static void main(String[] args) {

        Camera cam1 = new Camera();

        cam1.setCapacity(1);
        System.out.println(cam1.getCapacity());

        cam1.setCapacity(36);
        System.out.println(cam1.getCapacity());

        cam1.setCapacity(0);
        System.out.println(cam1.getCapacity());

        cam1.setCapacity(37);
        System.out.println(cam1.getCapacity());
    }
}
