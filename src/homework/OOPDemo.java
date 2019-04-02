package homework;

public class OOPDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Object-oriented programming is a programming language model organized" +
                " around objects rather than \"actions\" and data rather than logic." +
                " Object-oriented programming blabla. Object-oriented programming bla.");
        String subStr = "Object-oriented programming";
        String oopStr = "OOP";

        System.out.println(str);
        int pos;
        int start = 0;
        int count = 1;
        while ((pos = str.indexOf(subStr, start)) != -1) {
            if (count++ % 2 == 0) {
                str.replace(pos, pos + subStr.length(), oopStr);
                start = pos + oopStr.length();
            } else {
                start = pos + subStr.length();
            }
        }
        System.out.println(str);
    }
}
