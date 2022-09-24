package Objects;

import java.io.Serializable;
import java.util.Comparator;

public class OrganizationAnnualTurnoverComparator implements Comparator<Organization>, Serializable {
    private static final long serialVersionUID = 5L;
    @Override
    public int compare(Organization o1, Organization o2) {
        if (o1.getAnnualTurnover()>o2.getAnnualTurnover()){
            return 1;
        }
        else if (o1.getAnnualTurnover()<o2.getAnnualTurnover()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
