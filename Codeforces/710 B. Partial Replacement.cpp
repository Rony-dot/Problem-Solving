#include<bits/stdc++.h>
using namespace std;
int main()
{
    freopen("input.txt","r",stdin);
    int t;
    cin>>t;
    while(t--){
    int n, k;
    cin>>n>>k;
    string s;
    cin>>s;
    bool f, l;
    f = false;
    l = false;
    for(int i=0;i<n;i++){
        if(s[i]=='*'){
            s[i]='x';
            break;
        }
    }
    for(int i=n-1;i>=0;i--){
        if(s[i]=='*'){
            s[i]='x';
            break;
        }
    }
    for(int i=0;i<n;i++){
        if(s[i]=='*'){
            s[i]='x';
            break;
        }
    }
    }
}
