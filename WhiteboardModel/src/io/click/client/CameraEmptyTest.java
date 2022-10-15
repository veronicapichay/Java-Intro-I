package io.click.client;

import io.click.Camera;

class CameraEmptyTest {
    public static void main(String[] args) {

        Camera cam = new Camera("Leica", 22);
        System.out.println(cam);

        cam.empty();
        System.out.println(cam);

        cam.empty();
        System.out.println(cam);

        cam.empty();
        System.out.println(cam);

        cam.setCapacity(30);
        System.out.println(cam);
    }
}
