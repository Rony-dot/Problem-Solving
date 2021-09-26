#include<bits/stdc++.h>
using namespace std;
typedef long long int ll;
int main()
{
      ll i=0,j=0,n,m,t,a,b,ck=0,ln;
    string arr;
    cin>>n>>arr;
    arr = arr + "0";
    bool checkme = true;
    if(arr[0]=='0' && arr[1]=='0'){
        cout<<"No"<<endl;
        return 0;
    }
    for(i=0; i<n; i++){
        if((arr[i]=='1' && arr[i+1]=='1') || ( arr[i]=='0' && arr[i+1]=='0' && arr[i+2]=='0')){

            cout<<"No"<<endl;
            return 0;
        }

    }
    cout<<"Yes"<<endl;
}
