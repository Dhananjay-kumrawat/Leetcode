    class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0){
            int t = x;
            int ans=0,temp=0;
            while(t>0){
                temp = t%10;
                ans= ans*10+temp;
                t/=10;
            }
            if(x==ans) return true;
        }
        return false;
    }
}