public class CustomerController {

    private CustomerProfileService service = new CustomerProfileService();

    public String profile(String customerId){

        return service.getCustomer(customerId);

    }

}