
#include<bits/stdc++.h>
using namespace std;
int main(){
//    freopen("input.txt","r",stdin);
    int k, d, a;
    cin>>k>>d>>a;
    int n;
    cin>>n;
    int j, jk, jd, ja;
    int b, bk, bd, ba;

    for(int i=0;i<n;i++){
        cin>>jk>>jd>>ja>>bk>>bd>>ba;
        j = jk*k+jd*d+ja*a;
        b = bk*k+ bd*d+ba*a;
        if(j>b) cout<<"Jett"<<endl;
        else if(b>j) cout<<"Breach"<<endl;
        else if (j==b) cout<<"Tie"<<endl;
    }
    return 0;
}
