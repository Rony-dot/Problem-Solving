#include<bits/stdc++.h>
using namespace std;
int main()
{
    string s;
    int Case=1;
   // freopen("input.txt","r",stdin);
  //  freopen("output.txt","w",stdout);

    while((cin>>s))
    {
        if((s.compare("*")!=0))
        {
            cout<<"Case "<<Case++;
            if(s.compare("Hajj")==0)
            {
                cout<<": Hajj-e-Akbar\n";
            }
            else
            {
                cout<<": Hajj-e-Asghar\n";
            }
        }
        else
            return 0;
    }
}
