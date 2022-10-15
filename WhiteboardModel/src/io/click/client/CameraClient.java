package io.click.client;/*
 *
 *
 */

import io.click.Camera;
import io.click.WeatherType;

import java.util.EnumMap;

class CameraClient {
    public static void main(String[] args) {

//        EnumMap<WeatherType, String> enumMap = new EnumMap<WeatherType, String>(WeatherType.class);
//
//        enumMap.put(WeatherType.SNOWSAND,"f22");
//        enumMap.put(WeatherType.SUNNY, "f16");
//        enumMap.put(WeatherType.SLIGHTOVERCAST, "f11");
//        enumMap.put(WeatherType.OVERCAST, "f8");
//        enumMap.put(WeatherType.CLOUDY, "f5.6");
//        enumMap.put(WeatherType.SUNSET, "f4");



    Camera cam1 = new Camera();
    cam1.setBrand("Nikon");
    cam1.setLens(60);
    System.out.println(cam1);

    Camera cam2 = new Camera("K100");
    cam2.setLens(50);
    System.out.println(cam2);

    Camera cam3 = new Camera("Olympus");



    }
}
