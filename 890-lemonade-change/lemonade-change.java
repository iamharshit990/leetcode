class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int i=0;i<bills.length;i++){
            int money = bills[i];
            if(money==5){
                five++;
            }
            else if(money==10){
                if(five>0) {
                    five--;
                    ten++;
                }
                else {
                    return false;
                }
            }
            else{
                if(ten>0){
                    ten--;
                    if(five==0){
                        return false;
                    }
                    else{
                        five--;
                    }
                }
                else{
                    if(five>=3){
                        five-=3;
                    }
                    else return false;
                }
            }
        }
        return true;
    }
}