#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int temp=n, flag=1;
    for(;temp!=0; temp/=10){
        int rem = temp%10;
        if(rem != 4 && rem !=7){
            flag = 0;
        }
    }
    if(flag==1){
        cout<<"YES"<<endl;
        return 0;
    }
    else if(n%4==0 || n%7==0){
         cout<<"YES"<<endl;
        return 0;
    }else if(n%47==0){
         cout<<"YES"<<endl;
        return 0;
    }
     cout<<"NO"<<endl;
        return 0;

    return 0;
}
