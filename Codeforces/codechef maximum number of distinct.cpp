#include<bits/stdc++.h>
using namespace std;
#define ll unsigned long long
int main()
{
    ll t;
    scanf("%lld",&t);
    while(t--){
        ll n;
        vector<ll> vec(n);
        for(int i=0; i<n; i++){
            ll v;
            scanf("%lld",&v);
            vec[i]=v;
        }
        for(int i=0; i<n; i++){
            printf("%lld ",vec[i]);
        }
    }
    return 0;
}
