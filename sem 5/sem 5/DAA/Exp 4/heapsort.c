// write a code for heap sort algorithm
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
void heapify(int a[], int n, int i)
{
    int largest = i;
    int l = 2 * i + 1;
    int r = 2 * i + 2;
    if (l < n && a[l] > a[largest])
        largest = l;
    if (r < n && a[r] > a[largest])
        largest = r;
    if (largest != i)
    {
        int temp = a[i];
        a[i] = a[largest];
        a[largest] = temp;
        heapify(a, n, largest);
    }
}
void heapsort(int a[], int n)
{
    for (int i = n / 2 - 1; i >= 0; i--)
        heapify(a, n, i);
    for (int i = n - 1; i >= 0; i--)
    {
        int temp = a[0];
        a[0] = a[i];
        a[i] = temp;
        heapify(a, i, 0);
    }
}
int main()
{
    int n;
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    int a[n];
    printf("Enter the elements: ");
    for (int i = 0; i < n; i++)
        scanf("%d", &a[i]);
    clock_t start, end;
    start = clock();
    heapsort(a, n);
    end = clock();
    printf("The sorted array is: ");
    for (int i = 0; i < n; i++)
        printf("%d ", a[i]);
    printf("\n");
    double t = (double)(end - start) / CLOCKS_PER_SEC;
    printf("The time taken is %f\n", t);
    return 0;
}

// Path: sem%205/sem%205/DAA/Exp%204/insertionsort.c
