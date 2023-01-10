package Bai13.ExceptionController;

import java.time.LocalDate;


public class Check {
    public static void checkName(String input) throws MyException {
        if (input.length() < 10 || input.length() > 50) {
            throw new MyException("InvalidFullNameException ");
        } else {
        }
    }

    public static void checkLocalDate(LocalDate localDate) throws MyException {
        if (localDate.getDayOfMonth() > 31 || localDate.getDayOfMonth() < 1) {
            throw new MyException("InvalidDOBException  ");
        }else if(localDate.getMonthValue()>12||localDate.getMonthValue()<1){
            throw new MyException("InvalidDOBException  ");
        }else if(localDate.getYear()<1){
            throw new MyException("InvalidDOBException  ");
        }else{
        }
    }

    public static void checkNumberPhone(long phoneNumber) throws MyException {
        String check = String.valueOf(phoneNumber);
        if(check.length()!=10){
            throw new MyException("InvalidPhoneNumberException ");
        }else{
            if(check.startsWith("090")||check.startsWith("098")||check.startsWith("091")||
                    check.startsWith("031")||check.startsWith("035")||check.startsWith("038")){
            }else {
                throw new MyException("InvalidPhoneNumberException ");
            }
        }
    }


}

/**
 *  public static void main(String args[]) {
 *         try {
 *             checkName("asasddsadasa");
 *         } catch (Exception e) {
 *             System.out.println("Exception occured: " + e);
 *         }
 *         System.out.println("rest of the code...");
 *     }
 */