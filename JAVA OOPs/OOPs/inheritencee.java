interface MountBike {

    static final int TotalTyre = 2;

    void mountanBike();
}

interface RoadBicycle {
    static final int TotalTyre = 2;

    void roadbike();
}

class mbike implements MountBike {

    private int speed;
    int seatheight;

    mbike(int speed, int seatheight) {
        this.speed = speed;
        this.seatheight = seatheight;
    }

    public void mountanBike() {
        System.out.println("This is mountain bike");
        System.out.println("Total tyres = " + TotalTyre);
        System.out.println("Speed of MBike \t\t= \t" + this.speed);
        System.out.println("Height of MseatBike \t= \t" + this.seatheight);
    }

    public void setSpeed(int speedd) {
        this.speed += speedd;
    }

}

class rbike implements RoadBicycle {

    int speed;
    int seatheight;

    rbike(int speed, int seatheight) {
        this.speed = speed;
        this.seatheight = seatheight;
    }

    public void roadbike() {
        System.out.println("This is road bike");
        System.out.println("Total tyres  = " + TotalTyre);

        System.out.println("Speed of RBike \t\t= \t" + this.speed);
        System.out.println("Height of RseatBike \t= \t" + this.seatheight);
    }

    public void setSpeed(int speedd) {
        this.speed += speedd;
    }
}

public class inheritencee {

    public static void main(String args[]) {
        MountBike mm = new mbike(1212, 121);
        mbike m = new mbike(12, 30);
        m.mountanBike();
        // m.setSpeed(10);
        // System.out.println("After incresing speedd");
        // m.mountanBike();

        System.out.println("\n\n");

        rbike r = new rbike(10, 20);
        r.roadbike();
    }
}
