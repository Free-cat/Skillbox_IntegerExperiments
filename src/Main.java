public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(sumDigits(555));
    }

    public static Integer sumDigits(Integer number)
    {
        int sum = 0;
        String letters = number.toString();
        for (int i = 0; i < letters.length(); i++){
            sum += Character.getNumericValue(letters.charAt(i));
        }
        return sum;
    }
}
