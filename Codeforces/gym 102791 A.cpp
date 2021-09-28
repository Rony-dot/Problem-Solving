#include<bits/stdc++.h>
using namespace std;
#define ll long long
int main(){
    int n, r, y, b, tempMaxi, cnt=0;
    cin>>n>>r>>y>>b;
    int maxi = -1;
    for(int i=1; i<=1000; i++){
        for(int j=i-1; j<=i+1; j++){
                if(j<0 || j>1000) continue;
            for(int k=i-1; k<=i+1; k++){
                 if(k<0 || k>1000) continue;
                if( (abs(i-j)<=1 && abs(i-k)<=1 && abs(j-k)<=1) )
                {
                    tempMaxi  = max(maxi,i*r + j*y + k*b);
//                    cout<<maxi<<" : "<<i<<" "<<j<<" "<<k<<endl;
                }
                if(!(tempMaxi>n)){
                    maxi = tempMaxi;
                    cnt = i+j+k;
//                    cout<<i<<j<<k<<endl;
                }
            }
        }
    }
    cout<<cnt<<endl;
}
