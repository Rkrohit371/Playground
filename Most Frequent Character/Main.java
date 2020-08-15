#include<bits/stdc++.h>
using namespace std;

int func(string str, int n){
    if(n==0){
        return -1;
    }
    map<char, int> result;
    for(char i='a';i<='z';i++){
        result[i]=0;
    }
    int count=0;
    for(int i=0;i<n;i++){
        result[str[i]]++;
        count = max(result[str[i]], count);
    }
    return count;
}

int main(){
    string str;
    cin>>str;
    cout<<func(str, str.size());
    return 0;
}