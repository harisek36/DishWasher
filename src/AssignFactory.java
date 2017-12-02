/**
 * Created by harishsekar on 12/1/17.
 */
public class AssignFactory {

    public AssignFactory(DishWasher_DataFormat dishes) {

        Factory factory = new Factory();

        Washing_Types washing_types = factory.getDishType(dishes.getMaretial_type());
        washing_types.Process(dishes);

    }

}
