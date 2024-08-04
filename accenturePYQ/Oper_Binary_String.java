import java.util.*;

class AccentureQ2{

    public static int strBinaryResult(String str){
        if(str == null){
            return -1;
        }

        int res = str.charAt(0) - '0';

        for(int i=1;i<str.length();){
            char chr = str.charAt(i);
            i++;
            if(chr == 'A'){
                res = res & (str.charAt(i) -'0');           }
            else if(chr == 'B'){
                res = res | (str.charAt(i) - '0');
            }
            else{
                res = res ^ (str.charAt(i) - '0');
            }
            i++;
        }

        return res;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.next();

        System.out.println(strBinaryResult(st));
        sc.close();
    }
}
