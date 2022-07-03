public class operators{
    public static void main(String[] args){

        System.out.println('a' + 'b');
        // here in this case the a and b gets converted to integer value and then addup.

        System.out.println("a" + "b");
        // but in this case the a and b gets cocatinated.

        System.out.println('a' + 3);
        // it will give the ascii value of d,as a gets gets converted to integer value and then added by 3.

        System.out.println((char)('a' + 3));
        // here we have converted the previous one to the characters.

        // here we noticed that when we are using operators with characters it converted to its integer value
        // and then operation helds but it not happens in the case of the strings.

        System.out.println("a" + 1);
        // when an integer is concatineted/added with string it will be convertd to Integer that will be toString()
        //this will same as after few steps : "a" + "1";


        System.out.println("piyush" + new ArrayList<>());

    }
}
