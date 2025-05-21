package Homework4.Exercise3;

public class Lamp implements Switchable, Dimmable{
    private boolean isOn;
    private int brightness;

    @Override
    public void setBrightness(int level) {
        if (isOn == true){
            if(level <= 100 && level >= 0) {
                brightness = level;
            }
            else{
                System.out.println("Invalid brightness level");
            }
        }

    }
    @Override
    public void dimToHalf(){


    }

    @Override
    public int getBrightness() {
        return brightness;
    }

    @Override
    public void turnOn() {
        setBrightness(MAX_BRIGHTNESS);
        isOn = true;

    }

    @Override
    public void turnOff() {
        isOn = false;
        setBrightness(0);

    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
