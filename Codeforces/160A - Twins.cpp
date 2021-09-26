#include<bits/stdc++.h>
using namespace std;
int main(){
    int t, sum=0, t1=0, t2=0;
    cin>>t;
    int arr[t] = {0};
    for(int i=0; i<t; i++){
        cin>>arr[i];
        sum += arr[i];
    }
    sort(arr, arr+t, greater<int>());
    for(int i=0; i<t; i++){
        t1 += arr[i];
        if(t1 > sum-t1){
            cout<<i+1<<endl;
            return 0;
        }
    }

    return 0;
}
