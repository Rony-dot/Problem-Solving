#include <bits/stdc++.h>
using namespace std;
int main()
{
//    freopen("input.txt","r",stdin);
    int t;
    cin>>t;
    while(t--)
    {
        int k;
        cin>>k;
        int outCOunt = 0;
        for(int j=1; j<=9; j++)
        {
            int dcount = 0;
            int flag = 1;
            int n=j;
            for(int i=1; i<4; i++)
            {
                n=n*10+j;
            }
//        cout<<n<<endl;
            int counter = 0;
            for(int i=j; i<=n; i=i*10+j)
            {
                dcount++;
                counter+=dcount;
//                cout<<i<<endl;
                if(i==k)
                {
                    flag= 0;
                    break;
                }

            }
             outCOunt+=counter;
            if(flag==0){
                break;
            }
        }
        cout<<outCOunt<<endl;
    }

}
