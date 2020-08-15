#include<bits/stdc++.h>
using namespace std;

int main(){
    string str1, str2;
    getline(cin, str1);
    getline(cin, str2);
    map<char, int>flag;
    for(int i=0;i<str1.size();i++){
        flag[str1[i]] = 1;
    }
    string res;
    for(int i=0;i<str2.size();i++){
        flag[str2[i]] = 0;
    }
    for(int i=0;i<str1.size();i++){
        if(flag[str1[i]] == 1){
            res += str1[i];
        }
    }
    cout<<res;
    return 0;
}