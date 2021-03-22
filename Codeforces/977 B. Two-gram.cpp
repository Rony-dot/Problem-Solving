#include<bits/stdc++.h>

using namespace std;

int main()
{
    int len;
    cin>>len;
    string pattern;
    getline(cin, pattern);

    for (int i=0; i<len-1; i++)
    {
        string let =

    }

    int stringLen = len;
    int patLen = 2;
    int hashString = 0;
    int hashPat = 0;

    for(int i=0; i<=patLen; i++)
    {
        int j = patLen-i;
        hashPat+=(int)pattern[i]*pow(10,j);
    }
    System.out.println(hashPat);
    for(int i=0; i<=stringLen-patLen; i++)
    {
        int occurance = 0;
        if(i==0)
        {
            for(int k=0; k<=patLen; k++)
            {
                int l = patLen-k;
                hashString+=(int)pattern[k]*pow(10,l);
            }
        }
        else
        {
            hashString-=(int)pattern[i-1]*pow(10,patLen);
            hashString*=10;
            hashString+=(int)pattern[i+patLen];
        }

        if(hashPat==hashString)
        {
            int check=0;
            for(; check<=patLen; check++)
            {
                if(pattern[check+i]!=pattern.charAt(check))
                    break;
            }
            if(check-1==patLen)
            {
                System.out.println("Pattern found at index : " + i);
                occurance++;
            }
        }

        if(occurance==0)
        {
            System.out.println("Pattern not found");
        }
    }

}

return 0;
}
