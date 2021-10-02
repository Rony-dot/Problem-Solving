#include<bits/stdc++.h>
using namespace std;

#define file_read(filename)  freopen("input.txt","r",stdin)
#define ll long long
#define llu unsigned long long

llu arr[200001];
int main()
{
//    file_read("");
    llu n,m,i,j,lb,room,a,b;

    while (scanf ("%llu %llu",&n,&m) != EOF)
    {
        memset (arr,0,n);

        for (i=0; i<n; i++)
        {
            scanf ("%llu",&a);

            if (i == 0)
                arr[i] = a;
            else
                arr[i] = arr[i-1]+a;
        }

        for (i=0; i<m; i++)
        {
            scanf ("%llu",&b);

            lb = lower_bound(arr,arr+n,b)-arr;

            if (lb == 0)
                room = b;
            else
                room = b-arr[lb-1];

            printf ("%llu %llu\n",lb+1,room);
        }
    }
    return 0;
}
