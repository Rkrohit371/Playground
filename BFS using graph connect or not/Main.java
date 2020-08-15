#include<bits/stdc++.h>
using namespace std;
int n,e;

void traverse(int s, bool visited[], int **graph){
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<n;j++){
    //         cout<<graph[i][j]<<" ";
    //     }
    //     cout<<endl;
    // }
    // cout<<endl;
    visited[s]=true;
    queue<int>q;
    q.push(s);
    while(!q.empty()){
        int u=q.front();
        q.pop();
        for(int i=0;i<n;i++){
            if(graph[i][u]){
                if(!visited[i]){
                    visited[i]=true;
                    q.push(i);
                }
            }
        }
    }
    // return;
}

bool connected(int **graph){
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<n;j++){
    //         cout<<graph[i][j]<<" ";
    //     }
    //     cout<<endl;
    // }
    // cout<<endl;
    bool *visited= new bool[n];
    for(int u=0;u<n;u++){
        for(int i=0;i<n;i++){
            visited[i]=false;
        }
        traverse(u, visited, graph);
        for(int i=0;i<n;i++){
            if(!visited[i]){
                return false;
            }
        }
    }
    return true;
}

int main(){
    cin>>n>>e;
    int **graph = new int *[n];
    for(int i=0;i<n;i++){
        graph[i] = new int[n];
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            graph[i][j]=0;
        }
    }
    int x,y;
    for(int i=0;i<e;i++){
        cin>>x>>y;
        graph[x][y]=1;
    }
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<n;j++){
    //         cout<<graph[i][j]<<" ";
    //     }
    //     cout<<endl;
    // }
    // cout<<endl;
    if(connected(graph)){
        cout<<"Yes";
    } else {
        cout<<"No";
    }
    return 0;
}