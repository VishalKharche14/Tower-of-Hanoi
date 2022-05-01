public class TowerOfHanoi {
    public static void solve(int n, String src, String hlpr, String dest){
        if(n==1){
            System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
            return;
        }
        solve(n-1, src,dest,hlpr);
        System.out.println("Transfer Disk "+n+" from "+src+" to "+dest);
        solve(n-1,hlpr,src,dest);


    }

    public static void main(String[] args) {
        int n = 4;
        solve(n,"Source_Column","Extra_Column","Destination.");
    }
}
