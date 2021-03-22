#include<bits/stdc++.h>
using namespace std;

void search(string str, string pat)
{
    int strLen = str.size()-1;
    int patLen = pat.size()-1;
    int hashStr = 0;
    int hashPat = 0;

    for(int i=0; i<=patLen; i++)
    {
        int j = patLen-i;
        hashPat+=(int)pat[i]*pow(10,j);
    }
//        cout<<hashPat<<endl;
    for(int i=0; i<=strLen-patLen; i++)
    {
        int occurance = 0;
        if(i==0)
        {
            for(int k=0; k<=patLen; k++)
            {
                int l = patLen-k;
                hashStr+=(int)str[k]*pow(10,l);
            }
        }
        else
        {
            hashStr-=(int)str[i-1]*pow(10,patLen);
            hashStr*=10;
            hashStr+=(int)str[i+patLen];
        }

        if(hashPat==hashStr)
        {
            int check=0;
            for(; check<=patLen; check++)
            {
                if(str[check+i]!=pat[check])
                    break;
            }
            if(check-1==patLen)
            {
                cout<<"Pattern found at index : "<< i<<endl;
                occurance++;
            }
        }

        if(occurance==0)
        {
            cout<<"Pattern not found"<<endl;
        }
    }

}

int main()
{
    string str="ABCDEAB";
    string pat = "AB";
    search(str, pat);
}
