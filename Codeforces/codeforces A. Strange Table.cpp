#include<bits/stdc++.h>
using namespace std;
using ll = long long;
int main(){
//    freopen("input.txt","r",stdin);
    ll t, n, m, x;
    cin>>t;
    while(t--){
    cin>>n>>m>>x;
    x--;
    ll  row, col;
    row = x%n;
    col = x/n;
    cout<<row*m+col+1<<endl;
    }
    return 0;
}
