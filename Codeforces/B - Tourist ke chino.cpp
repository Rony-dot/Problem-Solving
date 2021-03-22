
#include<bits/stdc++.h>
using namespace std;
int main(){
//    freopen("input.txt","r",stdin);
    int t;
    cin>>t;
    while(t--){
        int n, r;
        cin>>n>>r;
        int sum=1500;
        int res=0;
        for(int i=0;i<n;i++){
            cin>>res;
            sum+=res;
        }
        if(sum==r){
            cout<<"Correct"<<endl;
        }
        else{
            cout<<"Bug"<<endl;
        }
    }
    return 0;
}
