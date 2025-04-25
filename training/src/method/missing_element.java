package method;

public class missing_element {
    
    static void missin(int[] a)
    {
        int sum1 = 0;
        for(int i=1;i<6;i++){ sum1+=i;}
        int sum=0;
        for(int i=1;i<a.length;i++){ sum+=a[i];}
        int missin_value = sum1 - sum;
        System.out.println(missin_value);
    }
    public static void main(String[] args) {
        int[] arr = {6,2,5,1,4};
        missin(arr);
    }
}
