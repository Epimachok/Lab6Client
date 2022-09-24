package Objects;

import java.io.Serializable;
import java.util.Comparator;

public class OrganizationEmployCountComparator implements Comparator<Organization>, Serializable {
    private static final long serialVersionUID = 6L;
    @Override
    public int compare(Organization o1, Organization o2) {
        if (o1.getEmployeesCount()>o2.getEmployeesCount()){
            return 1;
        }
        else if (o1.getEmployeesCount()<o2.getEmployeesCount()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
