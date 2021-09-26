#include<bits/stdc++.h>
using namespace std;
int main(){
    string str;
    string s = "hello";
    int j=0, flag=1;
    cin>>str;
    char past=str[0], present=str[0];
    for(int i=0; i<str.size(); i++){
        if(str[i] == s[j] ){
            j++;
        }
    }
    if(s.size()==j){
        cout<<"YES"<<endl;
    }else{
         cout<<"NO"<<endl;
    }


    return 0;
}
