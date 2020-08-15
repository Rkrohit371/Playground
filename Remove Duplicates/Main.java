#include<bits/stdc++.h>
using namespace std;

int main(){
    string st;
    cin>>st;
    map<char, int>result;
    for(char i='a';i<'z';i++){
        result[i]=0;
    }
    int i=0;
    while(i<st.size()){
        result[st[i]]++;
        i++;
    }
    string str="";
    for(int i=0;i<st.size();i++){
        if(result[st[i]]>0){
            str += st[i];
            result[st[i]]=0;
        }
    }
    cout<<str;
    return 0;
}