class BuildingForSell extends Building {
    public BuildingForSell(int id, int noOfFloors, int noOfUnits, int floorSize, int yearBuilt) {
        super(id, noOfFloors, noOfUnits, floorSize, yearBuilt);
    }
 
    public int getPrice() {
        int basePrice = getFloorSize() * getPerSquareFeetPrice();
        int age = Calendar.getInstance().get(Calendar.YEAR) - getYearBuilt();
        if (age > 30) return basePrice;
        if (age > 20) return basePrice - basePrice * 10 / 100;
        if (age > 10) return basePrice - basePrice * 20 / 100;
        return basePrice - basePrice * 30 / 100;
    }
}