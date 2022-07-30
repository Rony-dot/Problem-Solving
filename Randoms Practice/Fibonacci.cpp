#include <stdio.h>
#include <math.h>
#include<bits/stdc++.h>
/**
From the fib series we can see that after every third element there is a cycle;
0,1,1,2,3,5 == even, odd, odd, even, odd, odd;
So we can count the even and odd by calculating:
how many multiplicand or cycle of 3 are there? if the number is 2
we will have 2 even
and 2*2 = 4 odds
Time = O(n)
*/
#define file_read(filename)  freopen("input.txt","r",stdin)
#define ll long long
#define llu unsigned long long
int main()
{
//    file_read("");
    int T, i, j, k;
    scanf("%d", &T);

    for (i=0; i<T; i++)
    {
        long long N, M;
        scanf("%lld%lld", &N,&M);
        long long val, even=0, odd=0;
        val = abs(N-M)+1;

        if (val==1)
        {
            if (N%3==1) { even++;  }
            else { odd++; }
        }

        else
        {
            long long n,m;
            if (M>N) { n=N; m=M; }
            if (N>M) { n=M; m=N; }

            int b_tri=0, e_tri=0;
            if (n%3==2) { b_tri+=2; odd+=2; }
            if (n%3==0) { b_tri+=1; odd++;  }
            if (m%3==1) { e_tri+=1; even++; }
            if (m%3==2) { e_tri+=2; odd++;  even++; }

            val-=(e_tri+b_tri);
            val/=3;

            even+=val;
            odd+=(2*val);
        }

        printf("Case %d:\nOdd = %lld\nEven = %lld\n", i+1, odd, even);
    }

    return 0;
}
