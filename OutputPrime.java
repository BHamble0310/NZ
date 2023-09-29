public class OutputPrime {
    public static void main(String[] args) {
        int x,y;
        int count=0;
        for(x=2;x<=20000;x++) {
            int flag=1;
            for(y=2;y<x;y++) {
                if(x%y==0) {
                    flag=0;
                    break;
                }
            }
            if(flag==1) {
                count++;
                System.out.print(y+"\t");
                if(count%5==0)
                    System.out.println();
            }
        }
    }
}
