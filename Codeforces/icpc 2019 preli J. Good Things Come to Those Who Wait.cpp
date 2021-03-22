#include<bits/stdc++.h>
using namespace std;
int main(){
//    freopen("input.txt","r",stdin);
    long t;
    cin>>t;
    int cases =1;
    while(t--){
        long n;
        cin>>n;
        long arr[n];
        for(long i=0;i<n;i++){
            cin>>arr[i];
        }
        sort(arr, arr+n);
        long result = arr[0]*arr[n-1];
        cout<<"Case "<<cases++<<": "<<result<<endl;

    }
    return 0;
}
