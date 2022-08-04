#include <stdio.h>
#include <math.h>
#include<bits/stdc++.h>

#define file_read(filename)  freopen("input.txt","r",stdin)
#define ll long long
#define llu unsigned long long

long reverse(long num){

   long rev,temp,sum=0;

   temp = num;

   while(temp>0){

      rev = temp%10;
      sum = sum*10 +rev;
      temp = temp/10;
  }

   if(sum==num){

       return 1;
     }else {
       return 0;
     }
}


int main()
{
     file_read("");
     int t;
     scanf("%d",&t);

     for(int cas=1; cas<=t; cas++){
     long start, end, j, count=0;

     scanf("%ld",&start);
     scanf("%ld",&end);
     if(start>end){
        int temp = start;
        start = end;
        end = temp;
     }
     for(j=start;j<=end;j++){

       if(reverse(j)){
         count++;
        }
     }

     printf("Case %d: %ld\n",cas, count);
     }


     return 0;
}
