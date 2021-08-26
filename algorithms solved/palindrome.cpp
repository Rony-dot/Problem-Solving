#include<bits/stdc++.h>
using namespace std;

bool palindrome(string s)
{
    int len = s.length();
    int lo=0;
    for(int hi=len-1;hi>=0;hi--,lo++){
        if(s[hi]!=s[lo]){
            cout<<"not a palindrome"<<endl;
            return false;
        }
    }
    cout<<"palindrome"<<endl;
    return true;
}

int main()
{
    string str = "mama";
    bool isOrNot = palindrome(str);
   if(isOrNot)
    cout<<"palindrome"<<endl;
   else
    cout<<"not"<<endl;
   return 0;

}

