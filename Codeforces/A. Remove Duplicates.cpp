#include<bits/stdc++.h>
using namespace std;
int main(){

//    freopen("input.txt","r",stdin);
    int n;
    cin>>n;
    int arr[n];
    int flag[1000]={0};
    int x = 0;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int c = 0;
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                arr[i]=0;
                c++;
            }

        }
    }
    cout<<n-c<<endl;

    for(int i=0;i<n;i++){
        if(arr[i]>0){
            cout<<arr[i]<<" ";
        }
    }
    cout<<endl;


    return 0;
}
