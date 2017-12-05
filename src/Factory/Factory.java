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
        if(type.equalsIgnoreCase("Factory.Al")){
            return new Al();

        } else if(type.equalsIgnoreCase("Factory.Metal")){
            return new Metal();

        } else if(type.equalsIgnoreCase("Factory.Glass")){
            return new Glass();

        }else if(type.equalsIgnoreCase("Factory.Plastic")){
            return new Plastic();
        }

        return null;
    }

}
