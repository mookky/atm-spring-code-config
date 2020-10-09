package th.ac.kmitl.atm;

import java.util.HashMap;
import java.util.Map;

public interface DataSource {
    Map<Integer,Customer> readCustomers();
    Map<Integer,Customer> customers = new HashMap<>();

   
}
