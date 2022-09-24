package Objects;

import java.io.Serializable;
import java.util.ArrayList;

public class AnsObject implements Serializable {
    private static final long serialVersionUID = 10L;
    ArrayList<String> ans = new ArrayList<String>();
    public AnsObject(){
    }

    public void setAns(ArrayList<String> ans) {
        this.ans = ans;
    }

    public ArrayList<String> getAns() {
        return ans;
    }
    public void addAns(String ans){
        this.ans.add(ans);
    }
}
