#include<bits/stdc++.h>
using namespace std;
int main(){
//	freopen("input.txt", "r", stdin);
    int n;
    string s;
    cin>>n;
    cin>>s;
    int arr[n], j=0;
    for(int i=1; i<=n/2; i++){
        if(n%i==0){
            arr[j]=i;
            j++;
        }
    }
    arr[j]=n;
    j++;
    for(int i=1; i<j; i++){
        reverse(s.begin(),s.begin()+arr[i]);
    }
    cout<<s;
    return 0;
}
