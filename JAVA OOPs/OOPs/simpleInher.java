class Bicycle {
    protected int tyres;
    protected int seat;
    protected int speed;

    Bicycle(int tyres, int seat, int speed) {
        this.tyres = tyres;
        this.seat = seat;
        this.speed = speed;
    }

    int applySpeed(int sspeed) {
        this.speed += sspeed;
        return speed;
    }

    int applyBrake(int bbrake) {
        this.speed -= bbrake;
        return speed;
    }
}

class mountainBike extends Bicycle {

    int seatHeight;

    mountainBike(int tyres, int seat, int speed, int seatHeight) {
        super(tyres, seat, speed);
        this.seatHeight = seatHeight;
    }

    public void MountainBikeDetails() {
        System.out.println("TYre = " + tyres);
        System.out.println("Seat = " + seat);
        System.out.println("Speed = " + speed);
        System.out.println("seatheight = " + seatHeight);
    }
}

class hardMountain extends mountainBike {

    int tyresize;

    hardMountain(int tyres, int seat, int speed, int seatHeight, int tyresize) {
        super(tyres, seat, speed, seatHeight);
        this.tyresize = tyresize;
        // TODO Auto-generated constructor stub
    }

    public void detailhardbike() {
        System.out.println("TYre = " + tyres);
        System.out.println("Seat = " + seat);
        System.out.println("Speed = " + speed);
        System.out.println("seatheight = " + seatHeight);
    }

}

public class simpleInher {
    public static void main(String args[]) {
        hardMountain hm = new hardMountain(2, 01, 010, 015, 052);
        hm.detailhardbike();
        System.out.println("applying speed more :");
        System.out.println("New spedd  =  " + hm.applySpeed(30));
    }
}