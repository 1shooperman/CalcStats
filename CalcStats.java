public class CalcStats {

    public static int min(int[] seq) {
        int min = 2147483647;
        
        for (int i=0; i<seq.length; i++) {
            if (seq[i] < min) {
                min = seq[i];
            }
        }
        
        return min;
    }
    
    public static int max(int[] seq) {
        int max = -2147483647;
        
        for (int i=0; i<seq.length; i++) {
            if (seq[i] > max) {
                max = seq[i];
            }
        }
        
        return max;
    }
    
    public static double mean(int[] seq) {
        int avg = 0;
        
        for (int i=0; i<seq.length; i++) {
            avg += seq[i];
        }
        
        return (double) avg / seq.length;
    }
    
    public static int size(int[] seq) {
        return seq.length;
    }
        
}

