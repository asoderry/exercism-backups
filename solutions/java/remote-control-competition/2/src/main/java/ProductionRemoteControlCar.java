class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    int distanceTravelled = 0;
    int numberOfVictories = 0;

    public void drive() {
        this.distanceTravelled += 10;
    }

    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return other.numberOfVictories - this.numberOfVictories;
    }
}
