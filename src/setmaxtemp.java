/**
 * Created by harishsekar on 12/1/17.
 */
public class setmaxtemp implements Strategy{
    @Override
    public int setTemp(int min,int max) {

        System.out.println("Setting Max Temp...");
        return max;
    }
}
