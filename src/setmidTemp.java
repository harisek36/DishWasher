/**
 * Created by harishsekar on 12/1/17.
 */
public class setmidTemp implements Strategy{



    @Override
    public int setTemp(int min,int max) {
        return (min+max)/2;
    }
}
