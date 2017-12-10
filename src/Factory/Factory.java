package Factory;

/**
 * Created by harishsekar on 12/1/17.
 */
public class Factory {

    //use getShape method to get object of type shape
    public Washing_Types getDishType(String type){
        if(type == null){
            return null;
        }
        if(type.equalsIgnoreCase("Al")){
            return new Al();

        } else if(type.equalsIgnoreCase("Metal")){
            return new Metal();

        } else if(type.equalsIgnoreCase("Glass")){
            return new Glass();

        }else if(type.equalsIgnoreCase("Plastic")){
            return new Plastic();
        }

        return null;
    }

}
