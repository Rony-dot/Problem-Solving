#include<bits/stdc++.h>
using namespace std;
#define file_read(filename)  freopen("input.txt","r",stdin);
#define ll long long
int main(){
//    file_read("");
    int t;
    cin>>t;
    string b="()";
    while(t--){
        int n;
        cin>>n;
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                cout<<"()";
            }
            for(int j=n-i; j<n; j++){
                cout<<"(";
            }
            for(int j=n-i; j<n; j++){
                cout<<")";
            }
            cout<<endl;
        }
    }
    return 0;
}

