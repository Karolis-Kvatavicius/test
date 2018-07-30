package lt.baltictalents.string;

public class StringCreator {

   String create(String s1, String s2) {
       if (s1 == null || s2 == null) {
            return s1 + s2;
       }
       return s1 + s2;
   }

   String create(String s1, String s2, String s3) {
       if (s1 == null || s2 == null || s3 == null) {
           return s1 + s2 + s3;
       }
      return s1 + s2 + s3;
   }
}
