package HW.HW_10;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MonthUtils {



      public static final Month month1 = new Month("January", 31, 23);
      public static final Month month2 = new Month("February", 28, 19);
        public static final Month month3 = new Month("March", 31, 20);
        public static final Month month4 = new Month("April", 30, 21);
        public static final Month month5 = new Month("May", 31, 20);
        public static final Month month6 = new Month("June", 31, 22);
        public static final Month month7 = new Month("July", 31, 21);
        public static final Month month8 = new Month("August", 31, 21);
        public static final Month month9 = new Month("Septemper", 31, 21);
        public static final Month month10 = new Month("October", 31, 21);
        public static final Month month11 = new Month("November", 31, 21);
        public static final Month month12 = new Month("December", 31, 21);


       public static final Month[] monthArray = {month1, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12};

       public static Month[] getQ1() {
           return  new Month[] {month1, month2, month3};
           }

    public static Month[] getQ2() {
        return  new Month[] {month4, month5, month6};
    }
    public static Month[] getQ3() {
        return  new Month[] {month7, month8, month9};
    }
    public static Month[] getQ4() {
        return  new Month[] {month10, month11, month12};
    }

}
