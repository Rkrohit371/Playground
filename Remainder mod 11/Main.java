#include<bits/stdc++.h>
using namespace std;

int main(){
    string str;
    cin>>str;
    long int result;
    result = stoi(str)% 11;
    cout<<result;
    return 0;
}