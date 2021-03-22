#include<bits/stdc++.h>
using namespace std;
int main(){
//    freopen("input.txt","r",stdin);

    int n;
    cin>>n;
    int arr[n];
    int eaten[n];
    int ate=0;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int j=0;
    for(int i=0;i<n;i++){
        if(arr[i]>arr[i+1]){
            ate++;
            eaten[j++]=arr[i];
            break;
        }
        else{
            ate++;
            eaten[j++]= arr[i];
        }
    }
    int k =j;
    for(int i=n-1;i>=j;i--){
        if(arr[i-1]<arr[i]){
            eaten[k++]= arr[i];
            ate++;
            break;
        }
        else{
            eaten[k++]=arr[i];
            ate++;
        }
    }
    cout<<ate<<endl;



    return 0;
}
