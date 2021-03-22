#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int arr[n+1];
    vector <int> primes;
    for(int i=1;i<=n;i++){
        arr[i]=1;
    }

    for(int i=2;i<=sqrt(n);i++){
        if(arr[i]==1)
        for(int j=2*i;j<=n;j+=i){
            if(arr[j]==1) arr[j]=0;
        }
    }
    for(int i=1;i<=n;i++){
        if(arr[i]==1){
            //cout<<"PRIME -> "<<i<<"\n";
         primes.push_back(i);
        }
    }
    for(int i=0;i<primes.size();i++){

            cout<<"PRIME -> "<<primes[i]<<"\n";
    }
}
