#include<bits/stdc++.h>
using namespace std;

long cases = 1;
void search(string str, string pat, long k)
{
//    cout<<str<<" "<<pat<<" "<<k<<endl;

    long strLen = str.size();
    long patLen = pat.size();

    long occurance = 0;

    for(long i=0; i<=strLen-patLen; i++)
    {
        long counter = 0;
        long check=0;
        long flag = 0;
        for(; check< patLen; check++)
        {
            if((str[check+i]!=pat[check]))
            {
                counter++;
            }
            if(counter > k ){
                    flag =1;
                    break;
            }
        }
        if(flag ==0 )
        {
              occurance++;
        }

    }

    cout<<"Case "<<cases++<<": "<<occurance<<endl;
}

int main()
{
//    freopen("input.txt","r",stdin);
    long t;
    cin>>t;
    while(t--)
    {
        string str, pat;
        long  k;
        cin>>str>>pat>>k;
        search(str, pat, k);
    }

}
