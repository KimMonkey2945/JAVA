package static2.ex;

public class MathArrayUtils {

    public static int sum(int[] array){
        int total = 0;
        for(int v : array){
            total += v;
        }
        return total;
    }

    public static float average(int[] array){
        float result = 0;
        for(int v : array){
            result += v;
        }
        return result / array.length;
    }

    public static int min(int[] array){
        int result = 0;
        for(int v : array){
            if(result == 0){
                result = v;
            } else if(result < 0){
                result = v;
            }
        }
        return result;
    }

    public static int max(int[] array){
        int result = 0;
        for(int v : array){
            if(result == 0){
                result = v;
            } else if(result > 0){
                result = v;
            }
        }
        return result;
    }



}
