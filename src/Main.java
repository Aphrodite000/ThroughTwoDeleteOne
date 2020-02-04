import java.util.Arrays;
import java.util.Scanner;
class Node{
    int val;
    Node next=null;
    Node(int val){
        this.val=val;
    }
}
public class Main {
    /*
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
            a[i] = i;
        }

    }
    
     */

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String[] b=a.split(" ");
        if(b.length<101){
        int[] r=new int[b.length];
        for(int i=0;i<b.length;i++){
            r[i]=Integer.parseInt(b[i]);
        }
        int k=r[r.length-1];
        Arrays.sort(r);
        if(k>r.length){
            for(int i=0;i<r.length;i++){
                System.out.printf("%d ",r[i]);
            }
        }
        if(k==0){
            System.out.println(" ");
        }
        int q=0;
        boolean flag=true;
        int[] p=Arrays.copyOfRange(r,0,k+1);
        for(int i=0;i<p.length;i++){
            if(p[i]==k){
                if(q==i) {
                    q = i;
                    flag = false;
                }
            }
            if(flag){
                System.out.printf("%d ",r[i]);
            }
            flag=true;
        }
        }
    }
}
