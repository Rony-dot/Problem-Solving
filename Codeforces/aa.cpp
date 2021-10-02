#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    long T, i, j, k;
    scanf("%ld", &T);

    for (i=0; i<T; i++)
    {
        long N, M, val;
        scanf("%ld%ld", &N,&M);

        val = abs(N-M)+1;

        long n,m;
        if (N == M)
{
 printf("Case %ld:\nOdd= 0\nEven= 0", i+1); //format this to match your output
 break;  // break ends the current for loop iteration in this context
}
        if (M>N) { n=N; m=M; }
        if (N>M) { n=M; m=N; }

        int b_tri, e_tri, even=0, odd=0;
        if (n%3==1) { b_tri=3; even++; odd+=2; }
        if (n%3==2) { b_tri=2; odd+=2; }
        if (n%3==0) { b_tri=1; odd++;  }

        if (m%3==1) { e_tri=1; even++; }
        if (m%3==2) { e_tri=2; odd++;  even++; }
        if (m%3==0) { e_tri=3; odd+=2; even++; }

        val-=(e_tri+b_tri);
        val/=3;

        even+=val;
        odd+=2*val;
        printf("Case %ld:\nOdd = %d\nEven = %ld\n", i+1, odd, even);
    }

    return 0;
}
