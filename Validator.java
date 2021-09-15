import java.util.*;
import java.lang.*;

public class Validator {
    public List<Error> validate(CustomerDto customer) {
        List<Error> errors = new ArrayList<Error>();
        try {
            CustomerDto.checkName(customer);
        } catch(MyException e) {
            Error err = new Error(e.getF() + ": Not in the specified range");
            errors.add(err);
        }
        try {
            CustomerDto.checkEmail(customer);
        } catch(MyException e) {
            Error err = new Error(e.getF() + ": This is not an Email");
            errors.add(err);
        }
        try {
            CustomerDto.checkBirthday(customer);
        } catch(MyException1 e) {
            Error err = new Error(e.getF().toString() + ": Not the age of Majority");
            errors.add(err);
        }
        try {      
            CustomerDto.checkDiscountRate(customer);   
        } catch(MyException2 e) {
            Error err = new Error(e.getF() + ": Not whitin the discount rate");
            errors.add(err);
        }
        return errors;
    } 
}