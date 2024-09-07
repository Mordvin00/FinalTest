package Model;

public enum PetType {
    
    Cat,
    Dog,
    HamsterKombat;

    public static PetType getType (int typeId){
        switch (typeId){
            case 1:
                return PetType.Cat;
            case 2:
                return PetType.Dog;
            case 3:
                return PetType.HamsterKombat;
            default:
                return null;
        }
    }
}
