#include<bits/stdc++.h>
#include<stdio.h>
using namespace std;
int main(){
    int n,m;
    cin>>n>>m;
    string str1[m];
    string str2[m];
    string res[m];
    for(int i=0; i<m; i++){
        string s1, s2;
        cin>>str1[i]>>str2[i];
        if(str1[i].size()<=str2[i].size()){
            res[i] = str1[i];
        }else{
            res[i] = str2[i];
        }
    }
    for(int i=0; i<n; i++){
        string s;
        cin>>s;
       for(int i=0; i<m; i++){
            if(str1[i]==s || str2[i]==s){
                cout<<res[i]<<" ";
            }
       }
    }
    return 0;
}
