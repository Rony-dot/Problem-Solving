#include<bits/stdc++.h>
using namespace std;
int main()
{
   // freopen("input.txt","r",stdin);
    int t;
    cin>> t;
    while(t--){
        int x, y;
        cin>>x>>y;
        int path = max(x,y)*2-1;
        if(x==y) path++;
        cout<<path<<endl;
    }
}
