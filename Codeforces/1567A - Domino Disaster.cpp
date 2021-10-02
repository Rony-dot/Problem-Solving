#include<bits/stdc++.h>
using namespace std;
#define file_read(filename)  freopen("input.txt","r",stdin);
#define ll long long
int main(){
//    file_read("");
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        string str;
        cin>>str;
        for(int i=0; i<n; i++){
            char c = str[i];
            if(c =='U'){
                str[i]='D';
            }else if(c == 'D'){
                str[i] = 'U';
            }

        }
        cout<<str<<endl;
    }
    return 0;
}
