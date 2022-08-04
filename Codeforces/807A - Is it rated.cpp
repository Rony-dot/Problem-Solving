#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    scanf("%d",&n);
    int arr[1005], brr[1005];
    int rated=0, unrated=0, maybe=0, prev=5000, cur=0;
    for(int i=0; i<n; i++){
        cin>>arr[i]>>brr[i];
    }
    for(int i=0; i<n; i++){
        if(arr[i]!=brr[i]){
            rated = 1;
            cout<<"rated"<<endl;
            return 0;
        }
    }
    prev = arr[0];
    for(int i=1; i<n; i++){
        if(prev<arr[i]){
            unrated = 1;
            cout<<"unrated"<<endl;
            return 0;
        }
        prev = arr[i];
    }
    cout<<"maybe"<<endl;


    return 0;
}



