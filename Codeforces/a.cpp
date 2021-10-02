#include<bits/stdc++.h>
using namespace std;
bool isPowerOfTwo(long num){
    if((num != 0) && ((num &(num - 1)) == 0))
     return true;
    else
    return false;
}


int main(){
    long  n, t;
    scanf("%ld",&n);
    while(n--){
       scanf("%ld",&t);
        long  sum=0;
        for(long  i=1; i<=t; i++){
            if(isPowerOfTwo(i)){
                sum -= i;
            }else{
                sum += i;
            }
        }
        printf("%ld\n",sum);
    }
    return 0;
}
