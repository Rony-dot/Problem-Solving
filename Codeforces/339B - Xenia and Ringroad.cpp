#include<bits/stdc++.h>
#include<stdio.h>
using namespace std;
int main(){
    long long n, m;
    cin>>n>>m;
    long long arr[n]={0}, start=1, unit=0;
    for(long long i=0; i<m; i++){
       long long dest;
       cin>>dest;
       long long cnt = dest-start;
       if(cnt<0){
            unit = n+unit+cnt;
       }else{
           unit += cnt;
       }
       start=dest;
    }
    cout<<unit<<endl;
    return 0;
}
