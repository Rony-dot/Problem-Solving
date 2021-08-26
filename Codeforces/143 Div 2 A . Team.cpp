#include<bits/stdc++.h>
using namespace std;
int main(){
//    freopen("input.txt", "r", stdin);
    int t;
    cin>>t;
    int total = 0;
    while(t--){
        int p, v, t;
        cin>>p>>v>>t;
        if(p+v+t >= 2){
            total++;
        }
    }
    cout<<total<<endl;
}

