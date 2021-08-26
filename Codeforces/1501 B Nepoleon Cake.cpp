#include<bits/stdc++.h>
using namespace std;
int main(){
//    freopen("input.txt", "r", stdin);
    int k , n;
    cin>>n>>k;
    int total = 0;
    int arr[n];
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    for(int i=0; i<n; i++){
        if(arr[i]> 0 && arr[i]>= arr[k-1]){
            total++;
        }
    }
    cout<<total<<endl;

}

