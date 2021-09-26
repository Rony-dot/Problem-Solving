
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int a,b,c;

    cin >> a >> b >> c;
    int k = min(min(a/3,b/2),c/2);
    long long ans = k*7;
    a -= k*3;
    b -= k*2;
    c -= k*2;
    int maximum=0;
    for(int i=1; i<=7; ++i)
    {
        int total=0;
        int tempA=a, tempB=b, tempC=c;
        for(int j=i;; ++j)
        {
            if(j%7==1 || j%7==4 || j%7==0)
            {
                if(tempA)
                {
                    tempA--;
                    total++;
                }
                else break;
            }
            if(j%7==2 || j%7==6)
            {
                if(tempB)
                {
                    tempB--;
                    total++;
                }
                else break;
            }
            if(j%7==3 || j%7==5)
            {
                if(tempC)
                {
                    tempC--;
                    total++;
                }
                else break;
            }
        }
        maximum=max(maximum,total);
    }
    cout<<maximum+ans<<endl;
}
