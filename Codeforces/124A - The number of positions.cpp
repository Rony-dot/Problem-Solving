#include<bits/stdc++.h>
using namespace std;

#define file_read(filename)  freopen("input.txt","r",stdin);
#define ll long long;
int main(){
//    file_read("");
    int n, nl, nm, cnt=0;
    cin>>n>>nl>>nm;
    for(int i=1; i<=n; i++){
        int frontt, backk;
        frontt = n-i;
        backk = n-frontt-1;
        if(frontt>=nl && backk<=nm){
            cnt++;
        }
    }
    cout<<cnt<<endl;

    return 0;
}
