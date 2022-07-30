#include<bits/stdc++.h>
using namespace std;
#define file_read(filename)  freopen("input.txt","r",stdin)
#define ll long long
#define llu unsigned long long
int main()
{
//    file_read("");
    int a, b;
    cin>>a>>b;
    int arr[a], brr[b];
    for(int i=0; i<a; i++){
        cin>>arr[i];
    }
    for(int i=0; i<b; i++){
        cin>>brr[i];
    }
    sort(arr, arr+a);
    for(int i=0; i<b; i++)
    cout<< upper_bound(arr, arr+a, brr[i])-arr<<" ";

 return 0;
}
