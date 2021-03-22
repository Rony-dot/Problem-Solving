#include<bits/stdc++.h>
using namespace std;
int main()
{
    freopen("input.txt","r",stdin);
    string str;
    getline(cin,str);
    stack<char> s;
    int counter = 0;

    for(int i=0; i<str.size(); i++)
    {
        char c = str[i];
           cout<<c<<endl;
        if (c!='(' && c!=')' && c!='{' && c!='}' && c!='[' && c!=']') continue;

//        if((c==')' || c=='}' || c==']' ) && (s.top()!='(' || s.top()!='{' || s.top()!='['))
//        {
//            cout<<c<<" ";
//            s.push(c);
//
//        }

        if(c=='(' || c=='{' || c=='[' )
        {
            s.push(c);
            cout<<c<<" ";
            continue;
        }
        else if(c==')' && s.top()=='(')
        {
            cout<<s.top();
            s.pop();
            continue;
        }
        else if(c=='}' && s.top()=='{')
        {
            cout<<s.top();
            s.pop(); continue;
        }
        else if(c==']' && s.top()=='[')
        {
            cout<<s.top();
            s.pop(); continue;
        }
        else if((c==')' || c=='}' || c==']')){
           counter++;
        }
        cout<<"new"

    }
    cout<<counter;
    return 0;
}
