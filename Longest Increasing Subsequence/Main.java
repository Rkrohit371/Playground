#include<bits/stdc++.h>
using namespace std;

int lis(int arr[], int matrix[], int n){
    if(n==0){
        return 0;
    } 
    if(n==1){
        return 1;
    }
    for(int i=1;i<n;i++){
        for(int j=1;j<n;j++){
            if(arr[i] > arr[j] && matrix[i] < matrix[j] +1 ){
                matrix[i] = matrix[j]+1;
            }
        }
    }
    return *max_element(matrix, matrix+n);
}

int main(){
    int n;
    cin>>n;
    int arr[n], matrix[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
        matrix[i]=1;
    }
    cout<<lis(arr, matrix, n);
    return 0;
}