package HW.A;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class A_3 {

        static String noSpace(final String x) {
            String as;
            for (int i = 0; i < x.length(); i++) {
                //              if (x.charAt(i) == ' ') {
                return x.replaceAll("\\W", "");
                //           System.out.println(as);
                //             x.substring(x.length(-1));


                     }
                return x;

        }
            public static void main (String[]args){
                System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
            }

}
