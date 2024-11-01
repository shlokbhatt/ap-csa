package lambert.unit_4;

public class TimeForDrive {
    public String timeForDrive(int distance) {
        String returnString = "";
        for (int speed = 20; speed <= 70; speed += 10) {
            if (distance % speed == 0) {
                returnString += ("At " + speed + " mph, it takes " + (distance / speed) + " hours and 0 mins");
            } else {
                returnString += ("At " + speed + " mph, it takes " + (distance / speed) + " hours and " + (distance % speed) + " mins");
            }
            if (speed != 70) {
                returnString += "\n";
            }
        }
        return returnString;
    }
}
