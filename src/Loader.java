
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String textm[]=text.split(",");
        double textD[]=new double[textm.length];
        double sum=0.0;
        for (int i=0;i<textm.length;i++)
        {
            String regex = "[^0-9]";
            textm[i]= textm[i].replaceAll(regex, "");
            textD[i]=Double.parseDouble(textm[i]);
            sum=sum+textD[i];
        }
        text="" + sum;
        System.out.println(text);
    }
}