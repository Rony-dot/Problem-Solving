#include<bits/stdc++.h>
using namespace std;
int main(){

    long long n;
    cin>>n;
    long long hplq=0, lphq=0;
    long long p, q;
    for(long long i=0; i<n; i++){
        cin>>p>>q;
        if(p<=q){
            lphq = 1;
        }else if(p>=q){
            hplq = 1;
        }
    }
    if(hplq==lphq){
        cout<<"Happy Alex"<<endl;
    }else{
        cout<<"Poor Alex"<<endl;
    }
    return 0;
}
