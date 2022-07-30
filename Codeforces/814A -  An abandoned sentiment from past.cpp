#include<bits/stdc++.h>
using namespace std;
int main(){
    int n, k;
    scanf("%d",&n);
    scanf("%d",&k);
    int arr[105], brr[105];
    for(int i=0; i<n; i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0; i<k; i++){
         scanf("%d",&brr[i]);
    }
    sort(brr, brr+k, greater<int>());
    int j=0;
    for(int i=0; i<n; i++){
        if(arr[i]==0){
            arr[i]=brr[j];
            j++;
        }
    }
    for(int i=1; i<n; i++){
        if(arr[i-1]>arr[i]){
            cout<<"YES"<<endl;
            return 0;
        }
    }
    cout<<"NO"<<endl;

    return 0;
}


