package Array.ordenamiento;

public class inserción {
    
    
    static void ordenamiento(int[] data){
        
        
        for (int i = 1 ; i < data.length; i++){
            int aux  = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > aux){
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1 ] = aux;
        }
    }
    public static void main(String[] args) {
        int[] vals = {20,1,2};
        ordenamiento(vals);        
        for (Integer val : vals) {
            System.out.println(val);
        }
}
}
