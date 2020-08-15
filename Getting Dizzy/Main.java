#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    int arr[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            cin>>arr[i][j];
        }
    }
    int end = 0,i, len=n;
    while(end != n/2+1){
        for(i=end;i<len;i++){
            cout<<arr[end][i]<<" ";
        }
        for(i=end+1;i<len;i++){
            cout<<arr[i][len-1]<<" ";
        }
        for(i=len-2;i>=end;i--){
            cout<<arr[len-1][i]<<" ";
        }
        for(i=len-2;i>end;i--){
            cout<<arr[i][end]<<" ";
        }
        end++;
        len--;
    }
    return 0;
}