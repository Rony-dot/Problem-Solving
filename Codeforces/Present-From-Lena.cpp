#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int i, j, k;
    for( i=0;i<=n;i++){
            for( j=i;j<n;j++){
                cout<<" ";
            }
            for( j=i;j<n;j++){
                cout<<" ";
            }
            for( j=0;j<=i;j++){
                    if(j==0){
                        cout<<j;
                    }
                    else{
                cout<<" "<<j;
                    }
            }
            j--;
            for(--j;j>=0;j--){
                cout<<" "<<j;
            }
            cout<<endl;
    }

    for( i=n-1;i>=0;i--){
            for( j=i;j<n;j++){
                cout<<" ";
            }
            for( j=i;j<n;j++){
                cout<<" ";
            }
             for( j=0;j<=i;j++){
                    if(j==0){
                        cout<<j;
                    }
                    else{
                cout<<" "<<j;
                    }
            }
            j--;
            for(--j;j>=0;j--){
                cout<<" "<<j;
            }
            cout<<endl;
    }

}
