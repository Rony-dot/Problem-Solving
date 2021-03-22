#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    string s;
    cin>>s;
    int digit=0;
    for(int i=0;i<n;i++){
        if(s[i]=='1') digit++;
       else{
                cout<<digit;
                digit=0;
            }
    }
cout<<digit<<"\n";
}
