#include<bits/stdc++.h>
using namespace std;
int main(){
    int t;
    cin>>t;
    int arr[t] = {0};
    for(int i=0; i<t; i++){
        cin>>arr[i];
    }
    sor(arr,arr+t);
    for(int i=0; i<t; i++){
        cout<<arr[i];
    }

    return 0;
}
