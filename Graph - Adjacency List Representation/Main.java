#include<bits/stdc++.h>
using namespace std;

void add(vector<int>adj[], int x, int y){
    adj[x].push_back(y);
    adj[y].push_back(x);
    return;
}

int main(){
    int vertex,edges;
    cout<<"Enter the number of vertices:"<<endl;
    cout<<"Enter the number of edges:"<<endl;
    cin>>vertex>>edges;
    vector<int>adj[vertex];
    int x,y;
    for(int i=1;i<=edges;i++){
        cout<<"Enter the Start node and End node of edge "<<i<<endl;
        cin>>x>>y;
        add(adj,x,y);
    }
    cout<<"Adjacency List:"<<endl;
    for(int i=0;i<vertex;i++){
        cout<<i<<"--->";
        for(auto p : adj[i]){
            cout<<p<<" ";
        }
        cout<<endl;
    }
}