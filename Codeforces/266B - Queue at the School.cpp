#include<bits/stdc++.h>
#include<stdio.h>
using namespace std;
int main(){
    int n, t;
    cin>>n>>t;
    string str, res;
    cin>>str;
    res = str;
    for(int j=0; j<t; j++){
        for(int i=0; i<n-1; i++){
            if(str[i]=='B' && str[i+1]=='G'){
                swap(res[i],res[i+1]);
            }
        }
        str=res;
    }
    for(int i=0; i<n; i++){
        cout<<res[i];
        }
    return 0;
}
