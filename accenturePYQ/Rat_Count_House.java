import java.util.*;

class AccentureQ1 {

    public static int ratCount (int r, int unit, int n, int [] arr){
        if(arr == null){
            return -1;
        }

        int res = r*unit;
        int sum = 0;
        int count=0;

        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            count++;
            if(sum>=res){
                break;
            }
        }
            if(sum<res){
                return 0;
            }
            return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i= 0;i<n;i++){
            System.out.println("Enter array num: ");
            arr[i] = sc.nextInt();
        }

        System.out.println(ratCount(r,unit,n,arr));
        sc.close();
    }
}
