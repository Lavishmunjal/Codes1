public class trappingrain{
    public static int trappingrainwater(int height[]){
         int n = height.length;
         //calculate left max boundary - array
         int leftmax[] = new int[n];
         leftmax[0] = height[0];
         for(int i = 1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
         }

         //calculate right max boundary
         int rightmax[] = new int[n];
         rightmax[n-1] = height[n-1];
         for(int i = n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
         }
        int trappedwater = 0;
         //loop
         for(int i = 0; i<n; i++){
            //waterlevel = min(leftmax boundary, rightmax boundary)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // Trapped waterf = waterlevel - height[i]

            trappedwater += waterlevel - height[i];
         }
         return trappedwater;
    }
     
    // public static void main(String args[]){
        // int height[]= {4,2,0,6,3,2,5};
        // System.out.println(trappingrainwater(height));
    // }

    public static int buyAndsellstocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i<prices.length; i++){
            if(buyprice<prices[i]){
                int profit = prices[i] - buyprice; //todays profit
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }





// Buy and sell stocks

//public class trappingrainwater{
    
    
    

    
    
    
    

    
    
    
    
    
    
    public static void main(String args[]){
        int height[] = {4,2,0,3,2,5};
        
        //System.out.println(buyAndsellstocks(prices)); 
        System.out.println(trappingrainwater(height));
    }
}