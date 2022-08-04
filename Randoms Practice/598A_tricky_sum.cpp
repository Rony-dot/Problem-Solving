#include <bits/stdc++.h>
using namespace std;
/**
first calculating the sum of total n numbers = n*(n+1)/2
then calculating the numbers that are multiplication of 2, is that power of 2;
then subtracting the values*2 from total sum;
Time = O(n/2)= O(n)
*/
#define file_read(filename)  freopen("input.txt","r",stdin)

int main() {
//    file_read("");
    int t;
    long long  n, sum, sub, num2;
    scanf("%d",&t);
    for (int i = 1; i <= t; i++) {
        scanf("%lld",&n);
        num2 = 1;
        sub = 0;
        sum = n * (n + 1) / 2;
        while (num2 <= n) {
            sub += num2;
            num2 *= 2;
        }
        printf("%lld\n",sum-(sub*2));
    }
}
