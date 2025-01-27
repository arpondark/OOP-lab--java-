import java.util.*;

public class Main { // code by arpon 0112410351
    public static void main(String[] args) {
        ArrayList<Building> buildings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu by Arpon:");
            System.out.println("1. Add Building");
            System.out.println("2. Display All Buildings");
            System.out.println("3. Sort Buildings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("1 for sell 2 for rent: ");
                    int type = scanner.nextInt();
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("number of floors: ");
                    int floors = scanner.nextInt();
                    System.out.print("number of unit: ");
                    int units = scanner.nextInt();
                    System.out.print("floor size: ");
                    int size = scanner.nextInt();
                    System.out.print("built year: ");
                    int year = scanner.nextInt();

                    try {
                        if (type == 1) {
                            buildings.add(new BuildingForSell(id, floors, units, size, year));
                        } else if (type == 2) {
                            buildings.add(new BuildingForRent(id, floors, units, size, year));
                        } else {
                            System.out.println("invalid building");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    for (Building building : buildings) {
                        if (building instanceof BuildingForSell) {
                            System.out.println(
                                    building + ", For Sale, Price: " + ((BuildingForSell) building).getPrice());
                        } else if (building instanceof BuildingForRent) {
                            System.out.println(
                                    building + ", For Rent, Monthly Rent: " + ((BuildingForRent) building).getPrice());
                        }
                    }
                    break;

                case 3:
                    buildings.sort((b1, b2) -> {
                        int compareAge = Integer.compare(b2.getYearBuilt(), b1.getYearBuilt());
                        if (compareAge == 0)
                            return Integer.compare(b2.getFloorSize(), b1.getFloorSize());
                        return compareAge;
                    });
                    System.out.println("sorted");
                    break;

                case 4:
                    System.out.println("exiting");
                    scanner.close();
                    return;

                default:
                    System.out.println("Error");
            }
        }
    }
}