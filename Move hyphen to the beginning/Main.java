#include <bits/stdc++.h>
using namespace std;

string func(string str, int n)
{
    if(n==0){
        return NULL;
    }
    string result, count;
    for (int i = 0; i < str.size(); i++)
    {
        if(str[i]=='-'){
            str[i] = (char)0;
            count += '-';
        } else {
            result += str[i];
        }
    }
    return count+result;
}

int main()
{
    string str;
    getline(cin, str);
    cout << func(str, str.size());
    return 0;
}