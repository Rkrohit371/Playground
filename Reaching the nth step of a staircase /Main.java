#include<bits/stdc++.h>
using namespace std;

int step(int n){
    int result[n];
    result[0] = 0;
    result[1] = 1;

    for(int i=2;i<=n;i++){
        result[i] = result[i-1] + result[i-2];
    }
    return result[n];
}

int main(){
    int n;
    cin>>n;
    cout<<step(n+1);
}