#include<bits/stdc++.h>
using namespace std;
#define file_read(filename)  freopen("input.txt","r",stdin);
#define ll long long
int main(){
//    file_read("input.txt");
    int t, n;
    string str;
    cin>>t;
    while(t--){
        cin>>n;
        cin>>str;
        ll arr[n], cnt=0, sum=0;
        for(int i=0; i<str.size(); i++){
            arr[i] = str[i]-'0';
        }
        for(int i=0; i<str.size(); i++){
            if(arr[i]>0){
                sum += arr[i];
                cnt++;
            }
        }
        if(arr[n-1]>0){
            cnt--;
        }
        cout<<sum+cnt<<endl;

    }
    return 0;
}
