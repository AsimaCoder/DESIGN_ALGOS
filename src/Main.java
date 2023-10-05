public class Main {
    public static void main(String[] args) {
        ManageFurniture manage = ManageFurniture.getInstance();

        Furniture furniture = manage.getFurniture();

        System.out.println("Creating Furniture: ");

        furniture.createFurniture();
        furniture.setCurrentFurniture(new CreateTable());
        furniture.createFurniture();
        furniture.setCurrentFurniture(new CreateChair());
        furniture.createFurniture();
    }
}