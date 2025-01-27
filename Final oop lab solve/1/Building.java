class Building {
    private int id;
    private int noOfFloors;
    private int floorSize;
    private int noOfUnits;
    private int perSquareFeetPrice;
    private int yearBuilt;

    public Building(int id, int noOfFloors, int noOfUnits, int floorSize, int yearBuilt) {
        if (noOfFloors < 5)
            throw new IllegalArgumentException("Not enough floors!");
        if (noOfUnits < 2)
            throw new IllegalArgumentException("Not enough units!");
        if (floorSize < 1800)
            throw new IllegalArgumentException("Not big enough!");

        this.id = id;
        this.noOfFloors = noOfFloors;
        this.floorSize = floorSize;
        this.noOfUnits = noOfUnits;
        this.yearBuilt = yearBuilt;
        this.perSquareFeetPrice = 5000;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public int getFloorSize() {
        return floorSize;
    }

    public int getPerSquareFeetPrice() {
        return perSquareFeetPrice;
    }

    public String toString() {
        return "ID: " + id + ", Floors: " + noOfFloors + ", Units: " + noOfUnits + ", Floor Size: " + floorSize
                + ", Year Built: " + yearBuilt;
    }
}