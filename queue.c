#include <stdio.h>
#define SIZE 10

struct Queue {
    int arr[SIZE];
    int front, rear;
};

// Initialize queue
void initQueue(struct Queue *q) {
    q->front = -1;
    q->rear = -1;
}

// Check if queue is empty
int isEmpty(struct Queue *q) {
    return (q->front == -1);
}

// Check if queue is full
int isFull(struct Queue *q) {
    return (q->rear == SIZE - 1);
}

// Enqueue operation
void enqueue(struct Queue *q, int value) {
    if (isFull(q)) {
        printf("Queue is Full\n");
        return;
    }

    if (isEmpty(q)) {
        q->front = 0;
    }

    q->rear++;
    q->arr[q->rear] = value;
    printf("%d enqueued\n", value);
}

// ✅ Priority Dequeue: Dequeue 10 first
void dequeuePriority10(struct Queue *q) {
    if (isEmpty(q)) {
        printf("Queue is Empty\n");
        return;
    }

    int index = -1;

    // Search for 10 in the queue
    for (int i = q->front; i <= q->rear; i++) {
        if (q->arr[i] == 10) {
            index = i;
            break;
        }
    }

    // If 10 is found, delete it
    if (index != -1) {
        printf("Priority Dequeued: %d\n", q->arr[index]);

        for (int i = index; i < q->rear; i++) {
            q->arr[i] = q->arr[i + 1]; // Shift left
        }
        q->rear--;
    }
    // Else perform normal dequeue
    else {
        printf("Normal Dequeued: %d\n", q->arr[q->front]);

        for (int i = q->front; i < q->rear; i++) {
            q->arr[i] = q->arr[i + 1];
        }
        q->rear--;
    }

    // Reset if queue becomes empty
    if (q->rear < q->front) {
        q->front = -1;
        q->rear = -1;
    }
}

// Display queue
void display(struct Queue *q) {
    if (isEmpty(q)) {
        printf("Queue is Empty\n");
        return;
    }

    printf("Queue: ");
    for (int i = q->front; i <= q->rear; i++) {
        printf("%d ", q->arr[i]);
    }
    printf("\n");
}

// Main function
int main() {
    struct Queue q;
    initQueue(&q);

    enqueue(&q, 5);
    enqueue(&q, 10);
    enqueue(&q, 20);
    enqueue(&q, 15);
    enqueue(&q, 10);
    enqueue(&q, 10);
    enqueue(&q, 10);
    enqueue(&q, 16);


    display(&q);

    dequeuePriority10(&q);  // ✅ 10 will be removed first

    display(&q);

    return 0;
}
