package LambdaExpression;

public class Main {
    public static void main(String[] args) {
        Animal meo = (name, age) -> {return name + " " + age;
        };
        String infor = meo.speak("heloo", 23);
        System.out.println(infor);
    }

}
