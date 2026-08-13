public class CustomerProfileService {

    public String getCustomer(String customerId) {

        if(customerId == null){
            throw new NullPointerException("customerId cannot be null");
        }

        return "Customer Found";
    }

}