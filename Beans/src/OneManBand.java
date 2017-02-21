/**
 * Created by YanMing on 2017/2/20.
 */
import java.util.Collection;
public class OneManBand implements Performer {

    private Collection<Instruments> instruments;
    public OneManBand(){

    }

    public void perform(){
        for(Instruments ins:instruments)
        {
            ins.play();
        }
    }

    public void setInstruments(Collection<Instruments> instruments){
        this.instruments = instruments;
    }
}
