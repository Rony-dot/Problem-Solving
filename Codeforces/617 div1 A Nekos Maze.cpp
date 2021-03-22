#include<bits/stdc++.h>
using namespace std;
int main()
{
    freopen("input.txt","r",stdin);
    int t;
    cin>>t;
    int n;
    cin>>n;
    int arr[2][n]= {1};
    while(t--)
    {
        int i, j;
        cin>>i>>j;
        arr[i][j]=-arr[i][j];
        bool flag = true;
        int inx, iny;
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==0){
                    if(arr[i][j+1]==-1 && arr[1][j]==-1){
                        flag = false;
                    }
                    else{

                    }
                }
                else{
                     if(arr[i][j+1]==-1 && arr[i][j]==-1){
                        flag = false;
                    }
                }
            }


        }
        cout<<flag<<endl;
    }

    return 0;
}
