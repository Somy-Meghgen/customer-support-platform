public class CustomerProfileService {

    private CustomerValidator validator = new CustomerValidator();

    public String getCustomer(String customerId) {

        if(!validator.validate(customerId)){
            return "Invalid Customer";
        }

        LoggerUtil.log("Fetching customer profile");

        return "Customer Found";

    }

}