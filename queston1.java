public class queston1 {

    public static void main(String[] args) {
        //problem1
        String name="Ankit";
        name=name.toLowerCase();
        System.out.println(name);

        //problem 2
        String text="To Lower Case";
        text=text.replace(" ","_");
        System.out.println(text);

        //problem3
        String letter="Dear <|name|>, Thanks a lot!";
        letter=letter.replace("<|name|>", "Ankit");
        System.out.println(letter);

        //problem4
        String s="This string contains  double and   triple space";
        System.out.println(s.indexOf("  "));
        System.out.println(s.indexOf("   "));

        //problem5
        String s1="Dear Harry,\n\t This Java Course is Nice. \tThanks";
        System.out.println(s1);


    }
}