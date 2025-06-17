package JavaBreakthrough.StringExp;

public class SBuilder {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello"); // Не иммутабельный, он меняется
        System.out.println(stringBuilder.toString());
        stringBuilder.append(" my");
        stringBuilder.append(" friend");
        System.out.println(stringBuilder.toString());
    }
}
