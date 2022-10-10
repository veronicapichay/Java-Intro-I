/*
 *
 *
 */

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

    Camera cam1 = new Camera("Nikon", 700, 5.6, 1000, 800, true);
    System.out.println(cam1);

    Camera cam2 = new Camera("Olympus", 40, 2.8, 200, 200, false);
    System.out.println(cam2);

    Camera cam3 = new Camera("K1000", 50, 1.4, 500, 400, false);
    System.out.println(cam3);
    }
}
