class NeedForSpeed {
    int speed;
    int distanceDriven = 0;
    int battery = 100;
    int batteryDrain;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return (this.battery == 0 || (this.battery < batteryDrain));
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if (batteryDrained()) return;

        this.battery -= this.batteryDrain;
        this.distanceDriven += this.speed;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int maxDistanceCarCanDrive = car.speed * (100 / car.batteryDrain);

        return maxDistanceCarCanDrive >= this.distance;
    }
}
