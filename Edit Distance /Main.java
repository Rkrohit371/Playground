#include<bits/stdc++.h>
using namespace std;

int min_edit_dist(string str1, string str2){
    int len1 = str1.size();
    int len2 = str2.size();
    int matrix[len1+1][len2+1];
    for(int i=0;i<=len1;i++){
        for(int j=0;j<=len2;j++){
            if(i==0){
                matrix[i][j]=j;
            }
            else if(j==0){
                matrix[i][j]=i;
            } else if(str1[i-1]==str2[j-1]){
                matrix[i][j] = matrix[i-1][j-1];
            } else {
                matrix[i][j] = min(matrix[i-1][j], min(matrix[i][j-1], matrix[i-1][j-1])) + 1;
            }
        }
    }
    return matrix[len1][len2];
}

int main(){
    string str1, str2;
    cin>>str1>>str2;
    cout<<min_edit_dist(str1, str2);
    return 0;
}