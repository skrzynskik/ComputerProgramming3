public class MyArrays
{
    public static void max(int[] array){
        int max = 0;
        for(int i : array){
            if(i > max){
                max = i;
            }
        }
        System.out.println(max);
    }
    public static void odd(int[] array){
        int odd = 0;
        for(int i : array){
            if(i%2!=0){
                odd +=1;
            }
        }
        System.out.println(odd);
    }
}
