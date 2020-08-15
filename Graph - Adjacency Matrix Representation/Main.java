#include<bits/stdc++.h>
using namespace std;

int main(){
    int nodes, edges;
    cout<<"Please enter the number of nodes in the graph"<<endl;
    cout<<"Please enter the number of edges in the graph"<<endl;
    cin>>nodes>>edges;
    int graph[nodes][nodes];
    string str;
    cout<<"Is the graph directed"<<endl;
    cin>>str;
    cout<<"Adjacency Matrix Representation:"<<endl;
    for(int i=1;i<=nodes;i++){
        for(int j=1;j<=nodes;j++){
            graph[i][j]=0;
            cout<<graph[i][j]<<" ";
        }
        cout<<endl;
    }
    for(int i=1;i<=edges;i++){
        int start, end, weight;
        cout<<"Enter the start node, end node and weight of edge no "<<i<<endl;
        cin>>start>>end>>weight;
        if(str=="yes"){
            // cout<<"Enterd"<<endl;
            graph[start][end]=weight;
        } else {
            graph[start][end]=weight;
            graph[end][start]=weight;
        }
    }
    //cout<<"String : "<<str<<endl;
    cout<<"Adjacency Matrix Representation:"<<endl;
    for(int i=1;i<=nodes;i++){
        for(int j=1;j<=nodes;j++){
            cout<<graph[i][j]<<" ";
        }
        cout<<endl;
    }
}