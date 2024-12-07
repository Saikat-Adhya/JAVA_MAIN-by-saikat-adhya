public class EquilibriumIndex {
    public static void main(String[] args) {
        int[]arr= {7,2,1,2,5,4,1};
        int n = arr.length;
        int leftsum = 0;
        int total = 0;
        int ans = -1;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }
        for (int i = 0; i <n; i++) {
            total=total-arr[i];
            if (total==leftsum) {
                ans=i;
                break;
            }
            leftsum+=arr[i];
        }
        if (ans==-1) {
            System.out.println("No Equilibrium Index");
        } else {
            System.out.println("Equilibrium Index is: "+ans);
            
        }


    }
}