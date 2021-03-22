#include<bits/stdc++.h>
#include <string>
using namespace std;
int main(){

//    freopen("input.txt","r",stdin);
    int n;
    cin>>n;

    string str;
    getline(cin, str);
    getline(cin, str);
    string nstr;
    int counter = 0;
    int k=0;
    for(int i=0;i<n;i++){
        char c = str[i];
        if(str[i]=='x' && counter>=2){
            counter++;
        }
        else if(c=='x' && counter<2){
            nstr.push_back(c);
            counter++;
        }
        else if(c!='x'){
            nstr.push_back(c);
            counter=0;
        }
    }
    cout<<n-nstr.length()<<endl;
//    cout<<nstr<<endl;
    return 0;
}
