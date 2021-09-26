#include<bits/stdc++.h>
#include<stdio.h>
using namespace std;
int main(){
    int n, arr[3];
    cin>>n>>arr[0]>>arr[1]>>arr[2];
    sort(arr,arr+3);
    int temp = n, j=0;
    for(int i=0; i<3; i++){
        temp -= arr[i];
        j++;
        if(temp==0){
            break;
        }
    }
    cout<<j<<endl;
    return 0;
}
