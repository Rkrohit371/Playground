#include <bits/stdc++.h>
using namespace std;

bool isvowel(char i)
{
    return (i == 'a' || i == 'e' || i == 'o' || i == 'u' || i == 'i');
}

int main()
{
    string str;
    getline(cin, str);
    set<char> result;
    int count = 0;
    for (int i = 0; i < str.size(); i++)
    {
        for(int j=i;j<str.size();j++){
            if(isvowel(str[j])==false){
                break;
            }
            result.insert(str[j]);
            if(result.size()==5){
                count++;
            }
        }
        result.clear();
    }
    cout<<count;
}