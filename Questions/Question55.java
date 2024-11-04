public class Question55 {
    public static void main(String[] args) {
        int []arr ={1,7,8,6,4,5,3};
        int maxProfit =0;
        int maxPrice=0;
        int minPrice=arr[0];
        int buyDay=0;
        int sellDay=0;
        for (int i = 1; i < arr.length; i++) {
            if (minPrice>arr[i]) {
                minPrice=arr[i];
                buyDay=i;
            }
            if (arr[i]>maxPrice) {
                maxPrice=arr[i];
            }
            int profit = arr[i]-minPrice;
            if (profit>maxProfit) {
                maxProfit=profit;
                sellDay=i;
            }
        }
        System.out.println("maxPrice: "+maxPrice);
        System.out.println("maxProfit: "+maxProfit);
        System.out.println("minPrice: "+minPrice);
        System.out.println("buyDay: "+buyDay);
        System.out.println("sellDay: "+sellDay);
    }
}
