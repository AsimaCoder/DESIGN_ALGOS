public class Furniture {
    private ICreateFurniture currentFurniture;

    public Furniture(){
        currentFurniture = new CreateSofa();
    }

    public void setCurrentFurniture(ICreateFurniture furniture){
        this.currentFurniture = furniture;
    }

    public void createFurniture(){
        currentFurniture.createFurniture();
    }
}
