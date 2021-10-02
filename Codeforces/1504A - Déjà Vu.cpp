#include<bits/stdc++.h>
using namespace std;
#define file_read(filename)  freopen("input.txt","r",stdin);
#define ll long long
int main(){

//    file_read("nothing");
    int t;
    cin>>t;
    while(t--){
        stack<char> staka;
        stack<char> astak;
        bool isStaka = true, isAstak = true;
        string str;
        cin>> str;
        bool allA = true;
        for(int i=0; i<str.size(); i++){
            if(str[i]!='a' || str[i] != 'A'){
                allA = false;
            }
        }
        if(allA){
            cout<<"NO"<<endl;
            return 0;
        }
        string stra = str + 'a';
//        cout<<stra<<endl;
        for(int i=0; i<stra.size(); i++){
            staka.push(stra[i]);
        }
        for(int i=0; i<stra.size()/2; i++){
            if(staka.top() != stra[i]){
                isStaka = false;
                break;
            }
            staka.pop();
        }
        if(!isStaka){
            cout<<"YES"<<endl;
            cout<<stra<<endl;
            continue;
        }

        string astr = 'a' + str;
//        cout<<astr<<endl;
        for(int i=0; i<astr.size(); i++){
            astak.push(astr[i]);
        }
        for(int i=0; i<astr.size()/2; i++){
            if(astak.top() != astr[i]){
                isAstak = false;
                break;
            }
            astak.pop();
        }
        if(!isAstak){
            cout<<"YES"<<endl;
            cout<<astr<<endl;
             continue;
        }
        cout<<"NO"<<endl;

    }
    return 0;
}
