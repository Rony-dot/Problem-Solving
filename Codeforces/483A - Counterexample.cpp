#include<bits/stdc++.h>
#include<stdio.h>
using namespace std;
int main()
{
    long long l, r, a, b, c;
    cin>>l>>r;
    if(l&1){
        l++;
    }if(abs(l-r)>=2){
        cout<<l<<" "<<l+1<<" "<<l+2<<endl;
    }else{
        cout<<-1<<endl;
    }

    return 0;
}
