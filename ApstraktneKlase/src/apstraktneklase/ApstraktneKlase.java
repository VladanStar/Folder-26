package apstraktneklase;

import java.util.ArrayList;

public class ApstraktneKlase {

    public static void main(String[] args) {

        ArrayList<Robot> roboti = new ArrayList<>();

        roboti.add(new AutoRobot(100, "AutoRobot1", "test332", 45));
        roboti.add(new LeteciRobot(2, "Letilica1", "test211", 600));
        roboti.add(new TajniRobot(300,"SuperTajni Robot","test001"));
        //roboti.add(new LazniLeteciRobot(3.2, "LLR!", "test555", 400));

        for (Robot r : roboti) {
            System.out.println("Tvoje ime je: " + r.getIme());
            System.out.println("Tezina je: " + r.getTezinaKg());
        }

    }

}
