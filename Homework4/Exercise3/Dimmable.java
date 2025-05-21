package Homework4.Exercise3;

public interface Dimmable {
    static int MAX_BRIGHTNESS = 100;

     void setBrightness(int level);
     int getBrightness();
     default void dimToHalf(){
         setBrightness(MAX_BRIGHTNESS/2);
     }
}
