class BuildingForRent extends Building {
    public BuildingForRent(int id, int noOfFloors, int noOfUnits, int floorSize, int yearBuilt) {
        super(id, noOfFloors, noOfUnits, floorSize, yearBuilt);
    }
 
    public int getPrice() {
        return (getFloorSize() * getPerSquareFeetPrice()) / 100 * 50;
    }
}