#include<bits/stdc++.h>
using namespace std;
#define size 9

bool row(int matrix[][size],int r, int number){
    for(int c=0;c<size;c++){
        if(matrix[r][c]==number){
            return true;
        }
    }
    return false;
}

bool column(int matrix[][size], int c, int number){
    for(int r=0;r<size;r++){
        if(matrix[r][c]==number){
            return true;
        }
    }
    return false;
}

bool smallMatrix(int matrix[][size],int row_start, int col_start, int number){
    for(int r=0;r<3;r++){
        for(int c=0;c<3;c++){
            if(matrix[r+row_start][c+col_start]==number){
                return true;
            }
        }
    }
    return false;
}

bool isSafePlace(int matrix[][size], int r, int c, int number){
    return !row(matrix,r,number) && !column(matrix,c,number) && !smallMatrix(matrix,r- r%3,c- c%3,number);
}

bool isEmpty(int matrix[][size] ,int &r, int &c){
    for(r=0;r<size;r++){
        for(c=0;c<size;c++){
            if(matrix[r][c]==0){
                return true;
            }
        }
    }
    return false;
}

bool sudoku(int matrix[][size]){
    int r,c;
    if(!isEmpty(matrix,r,c)){
        return true;
    }
    for(int i=1;i<=9;i++){
        if(isSafePlace(matrix,r,c,i)){
            matrix[r][c]=i;
            if(sudoku(matrix)){
                return true;
            }
            matrix[r][c]=0;
        }
    }
    return false;
}

void print(int matrix[][size]){
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            cout<<matrix[i][j];
        }
        cout<<endl;
    }
}

int main(){
    int matrix[size][size];
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            cin>>matrix[i][j];
        }
    }
    if(sudoku(matrix)){
        print(matrix);
    } else {
        cout<<"No";
    }
}