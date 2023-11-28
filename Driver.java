
/**
 *@Alyssa Xu
 */
import java.util.ArrayList;
public class Driver
{
    public static int primeSize = 0;
    public static ArrayList<Integer> eratosthenes (int n){
        ArrayList<Integer> ans = new ArrayList();
        for( int i = 2; i< n+1; i++){
            ans.add(i);
        }
        for (int i = ans.size()-1; i> 2; i--){
            if (ans.get(i) % 2 ==0 ) ans.remove(i);
        }
        for (int i = ans.size()-1; i> 2; i--){
            if (ans.get(i) % 3 == 0 ) ans.remove(i);
        }
        for (int i = ans.size()-1; i> 2; i--){
            if (ans.get(i) % 5 ==0 ) ans.remove(i);
        }
        for (int i = ans.size()-1; i> 2; i--){
            if (ans.get(i)% 7 ==0 ) ans.remove(i);
        }
        primeSize = ans.size();
        return ans;
    }

    public static int goldbachConjecture (int n){
        int x = 0; 
        int y = 0;
        for( int i = 0; i< eratosthenes(n).size(); i ++){
            for( int k =1 ; k < eratosthenes(n).size(); k++){
                if( eratosthenes(n).get(i) + eratosthenes(n).get(k) == n){
                    x = eratosthenes(n).get(i);
                    y = eratosthenes(n).get(k);
                    System.out.println( x+ " + " + y);
                    break;
                }
            }
        }
        return n;
    }

    public static ArrayList<Integer> bigInts(int x, int y){
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<> ();
        ArrayList<Integer> b = new ArrayList<>();
        int count1= 0;
        int count2 = 0;
        int originalX = x;
        int originalY = y;
        int sum = 0;
        int carry =0;
        int diff = 0;
        while (x> 0){
            x /= 10;
            count1 ++;
        }
        while(y> 0){
            y/= 10;
            count2++;
        }
        for (int i = 0; i<count1; i++){
            int temp = originalX%10;
            a.add(0,temp);
            originalX/=10;
        }
        for (int i = 0; i<count2; i++){
            int temp = originalY%10;
            b.add(0,temp);
            originalY/=10;
        }

        if (count1 < count2){
            ArrayList<Integer> n = a;
            a = b;
            b = n;
        }
        if (count1> count2){
            diff = count1 -count2;
            for (int i = 0; i < diff; i++){
                b.add(0,0);
            }
        }
        if (count2> count1){
            diff = count1 -count2;
            for (int i = 0; i < diff; i++){
                a.add(0,0);
            }
        }
        for(int i = a.size() -1; i>=0; i--){
            int j = a.get(i) + b.get(i);
            if (j>= 10){
                carry = j%10;
            } else carry = 0;
            sum = j + carry;
            result.add(0,sum);
        }
        System.out.println(result);

        return result;
    }

}

