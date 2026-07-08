class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true;
        if(flowerbed.length==1){
            if(flowerbed[0]==1) return false;
            else return true;
           
        }
        if(flowerbed.length<2){
            return false;
        }
        
        
        
        int count =0;
        for(int i=0;i<flowerbed.length;i++){
            if(i==0){
                if(flowerbed[i]==0&&flowerbed[i+1]==0){
                    count ++;
                    flowerbed[i]=1;
                }
            }
            else if(i==flowerbed.length-1){
                if(flowerbed[i]==0&&flowerbed[i-1]==0){
                    count ++;
                    flowerbed[i]=1;
                }
            }
            else{
                if(flowerbed[i-1]==0&&flowerbed[i+1]==0&&flowerbed[i]==0){
                count ++;
                flowerbed[i]=1;
                }
                
            }

        }
        if(n<=count){
            return true;
        }
        else{
            return false;
        }
    }
}