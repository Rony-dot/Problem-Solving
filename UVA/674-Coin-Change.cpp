#include<bits/stdc++.h>
using namespace std;

int main(){
    int coins[]={1,5,10,25,50};
    int n = sizeof(coins)/sizeof(int);
    int cent;
    //freopen("input.txt","r",stdin);
   // freopen("output.txt","w",stdout);
    while((cin>>cent)){

    if(cent==-1) break;
    int matrix[n+1][cent+1];
    for(int i=0;i<=n;i++){
        for(int j=0;j<=cent;j++){
            if(i==0 && j==0) {
                matrix[i][j]=1;
            }
            else if(i==0 && j!=0){
                matrix[i][j]=0;
            }
            else if(coins[i-1]>j){
                matrix[i][j]=matrix[i-1][j];
            }
            else if(coins[i-1]<=j){
                matrix[i][j]=matrix[i-1][j]+matrix[i][j-coins[i-1]];
            }

        }
    }
     cout<<matrix[n][cent]<<endl;
    }

    return 0;
}
