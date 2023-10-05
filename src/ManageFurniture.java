public class ManageFurniture {
    private static ManageFurniture instance;
    private Furniture furniture;

    private ManageFurniture(){
        furniture = new Furniture();
    }

    public static ManageFurniture getInstance(){
        if(instance == null){
            instance = new ManageFurniture();
        }
        return instance;
    }

    public Furniture getFurniture(){
        return furniture;
    }
}
