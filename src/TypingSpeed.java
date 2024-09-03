import java.util.Scanner;

public class TypingSpeed {
    public static void main(String[] args) {

        String ts="The quick brown fox jumbs over the lazy dog";

        System.out.println("Thye the following sentance");
        System.out.println(ts);

        long st=System.currentTimeMillis();

        Scanner sc=new Scanner(System.in);
        String ui=sc.nextLine();
        long et=System.currentTimeMillis();

        long time=(et-st)/1000;

        String [] ta=ts.split(" ");
        String [] ua=ui.split(" ");

        int correctCount=0;
        int wrongCount=0;

        for(int i=0;i<Math.min(ta.length,ua.length);i++){

            if(ta[i].equals(ua[i])){

                correctCount++;
            }
            else{
                wrongCount++;

            }

        }

        wrongCount+=Math.max(0,ua.length-ta.length);

        double typeSpeed=(correctCount/(double)time)*60;

        System.out.println("Time taken:"+time+"sec");
        System.out.println("word type correctly:"+correctCount);
        System.out.println("word type wrongly:"+wrongCount);
        System.out.println("type speed:"+typeSpeed+"WPM");
    }
}