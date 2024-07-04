public class HeapSort {

    // 辅助方法：用于调整堆，确保从给定的索引开始的子树满足大根堆的性质
    private static void heapify(int[] arr, int n, int i) {
        int largest = i; // 假设最大的元素是根节点
        int left = 2 * i + 1; // 左子节点
        int right = 2 * i + 2; // 右子节点

        // 如果左子节点大于根节点
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // 如果右子节点更大，则更新最大值
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // 如果最大值不是根节点，将其与根节点交换，并继续堆化
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    // 堆排序方法
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // 构建大根堆
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 一个个从堆顶取出元素
        for (int i = n - 1; i > 0; i--) {
            // 将当前堆顶元素（最大值）与堆数组的末尾元素进行交换
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // 调用heapify来调整剩余的堆，使其重新成为大根堆
            heapify(arr, i, 0);
        }
    }

    // 测试堆排序
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        heapSort(arr);
        System.out.println("Sorted array is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}