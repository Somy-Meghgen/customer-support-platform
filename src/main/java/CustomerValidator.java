public class CustomerValidator {

    public boolean validate(String customerId){

        if(customerId == null)
            return false;

        if(customerId.isBlank())
            return false;

        return true;

    }

}