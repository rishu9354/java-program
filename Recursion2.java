public class Recursion2 {
    public static void towerOfHanoi(int n, String src, String help, String dest){
        if(n==1){
            System.out.println("transferring disk "+n+" from "+src+" to "+dest);
            return;
        }
        
        towerOfHanoi(n-1, src, dest, help);
        System.out.println("transferring disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        System.out.println("Tower Of Hanoi");
        int n=2;
        towerOfHanoi(n, "S", "H", "D");
    }
}
