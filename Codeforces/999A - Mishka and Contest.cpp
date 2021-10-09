#include<bits/stdc++.h>
using namespace std;
#define file_read(filename)  freopen("input.txt","r",stdin)
#define ll long long
int main(){
//    file_read("");
    int n, k;
    cin>>n;
    cin>>k;
    int arr[n];
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    int cnt = 0;
    for(int i=0; i<n; i++){
        if(arr[i]>k){
            break;
        }else{
            cnt++;
        }
    }
    if(cnt==n){
        cout<<cnt<<endl;
        return 0;
    }
    for(int i=n-1; i>=0; i--){
        if(arr[i]>k){
            break;
        }else{
            cnt++;
        }
    }
    cout<<cnt<<endl;

    return 0;
}
