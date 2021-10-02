#include<bits/stdc++.h>
using namespace std;
#define file_read(filename)  freopen("input.txt","r",stdin)
#define ll long long
int main(){
//    file_read("");
    int t;
    cin>>t;
    while(t--){
        string str;
        cin>>str;
        int a=0, b=0, c=0;
        for(int i=0; i<str.size(); i++){
            if(str[i]=='A') a++;
            else if(str[i]=='B') b++;
            else if(str[i]=='C') c++;
        }
        if(b == a+c){
            cout<<"YES"<<endl;
        }else{
            cout<<"NO"<<endl;
        }
    }
    return 0;
}
