#include<bits/stdc++.h>
using namespace std;

int main(){
    long long n, prev=0, cur, unit=0;
    cin>>n;
    for(int i=0; i<n; i++){
        cin>>cur;
        if(i==0){
            unit += cur+1;
        }
        else if(prev<=cur){
            unit += 1+cur-prev+1;
        }else if(prev>cur){
            unit += 1+prev-cur+1;
        }
        prev=cur;
    }
    cout<<unit<<endl;
    return 0;
}
