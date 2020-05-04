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
        for (int i = 0; i < number.toString().length(); i++){
            sum += Character.digit(number.toString().charAt(i), 10);
        }
        return sum;
    }
}
