import java.util.ArrayList;

/**
 * Created by patilsh on 7/30/2016.
 */
public class Pawns {
    ArrayList<Integer> pawnList = new ArrayList<Integer>();
    Pawns(){
        for(int i = 0 ; i < 8 ; i++){
            pawnList.add(i);
        }
    }
}
