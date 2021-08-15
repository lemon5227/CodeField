#include "bits/stdc++.h"
#define MaxSize 10
using namespace std;
typedef struct Queue{
    int data[MaxSize]
    int front;
    int rear;
}Queue;
int InitQueue(Queue* queue){
    if(!queue){
        return 0;
    }
    queue->front =queue->rear = 0;
    return 1;
}
int EmptyQueue(Queue* queue){
    if(!queue){
        return 0;
    }
    if(queue->front == queue->rear){
        return 1;
    }
    return 0;
}
int GetQueueSize(Queue* queue){
    if(!queue){
        return 0;
    }
    if(queue->front == queue->rear){
        return 0;
    }
    return (queue->rear - queue->front+MaxSize)%MaxSize;
}

int AddQueue(Queue* queue,int e){
    //队满或空指针
    if(!queue){
        return 0;
    }
    //刚好队尾再走一个单元就到对头，说明栈满
    if((queue->rear+1)%MaxSize == queue->front){
        return 0;
    }
    queue->data[queue->rear] = e;
    queue->rear = (queue->rear+1)%MaxSize;
    return 1;
}
int DelQueue(Queue* queue,int *e){
    if(!queue){
        return 0;
    }
    if(queue->rear == queue->front){
        return 0;
    }
    *e = queue->data[queue->front];
    queue->front =(queue->front+1)%MaxSize;
    return 1;
}
void PrintQueue(Queue * queue){
    int begin = queue->front;
    while(begin !=queue->rear){
        cout << queue->data[begin]<< endl;
        if(begin < MaxSize-1){
            begin++;
        }
        else{
            begin = begin+1 - MaxSize;
        }
    }
    return;
}

int main() {
    Queue q;
    InitQueue(&q);
    AddQueue(&q,1);
    AddQueue(&q,2);
    AddQueue(&q,3);
    AddQueue(&q,4);
    AddQueue(&q,5);
    AddQueue(&q,6);
    AddQueue(&q,7);
    AddQueue(&q,8);
    AddQueue(&q,9);
    PrintQueue(&q);
    int e1,e2;
    DelQueue(&q,&e1);
    cout << e1 << endl;
    DelQueue(&q,&e2);
    cout << e2 << endl;
    cout << GetQueueSize(&q);
    
}