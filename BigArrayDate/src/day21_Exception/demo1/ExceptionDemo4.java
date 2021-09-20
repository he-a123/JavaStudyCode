package day21_Exception.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        try{
            funcation();
        }catch (ParseException ex){
            System.out.println(ex);
        }
    }
    public static void funcation()throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date= sdf.parse("2012-10-10");
        System.out.println(date);
    }
}
