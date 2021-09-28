#include<bits/stdc++.h>
using namespace std;
#define ll long long
int main(){
    ll n=3, sum=0;
    ll arr[n][n];
    for(ll i=0; i<n; i++){
        for(ll j=0; j<n; j++){
            cin>>arr[i][j];
            sum += arr[i][j];
        }
    }

    arr[0][0] = sum/2 - arr[0][1] - arr[0][2];
    arr[1][1] = sum/2 - arr[1][0] - arr[1][2];
    arr[2][2] = sum/2 - arr[2][0] - arr[2][1];
     for(ll i=0; i<n; i++){
        for(ll j=0; j<n; j++){
            cout<<arr[i][j]<<" ";
        }
        cout<<endl;
    }
    return 0;
}
