
#include<stdio.h>

static long numPalindrome(long num);
static long constructPalindrome(long palPrefix,long numLength);

int main(void)
{
    long a=0;
    long b=0;
    long n=0;
    long swap=0;

    scanf("%ld",&n);
    long track = 1;
    while(n-->0)
    {
        scanf("%ld %ld",&a,&b);
        if(a>b)
        {
            swap=a;
            a=b;
            b=swap;
        }
        printf("Case %ld: %ld\n",track, numPalindrome(b)-numPalindrome(a-1));
        track++;
    }
    return 0;
}

static long numPalindrome(long num)
{
    long numLength=0;
    long palLength=0;
    long palPrefix=0;
    long temp=0;
    long i=0;


    for(numLength=0,temp=num; temp!=0; temp/=10)
        numLength++;

    palLength=(numLength+1)/2;
    palPrefix=num;
    for(i=0; i<numLength -palLength; i++)
        palPrefix/=10;

    if(constructPalindrome(palPrefix,numLength)>num)
        palPrefix--;


    palPrefix*=2;
    if(numLength&1)
    {

        long adjustment=1;
        for(i=1; i<palLength; i++)
            adjustment*=10;
        palPrefix-=(palPrefix/2-adjustment+1);
    }
    else
    {

        long adjustment=1;
        for(i=0; i<palLength; i++)
            adjustment*=10;
        palPrefix+=(adjustment-1-palPrefix/2);
    }
    return palPrefix;
}

static long constructPalindrome(long palPrefix,long numLength)
{
    long front=palPrefix;
    long back=0;

    if(numLength&1)
        palPrefix/=10;

    while(palPrefix!=0)
    {
        long digit=palPrefix%10;

        palPrefix/=10;
        back=back*10+digit;
        front*=10;
    }
    return front+back;
}
