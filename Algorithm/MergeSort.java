/* merge sort
 * 需要比較大的空間(buffer) 去做複製
 * - 先切段落，切半左右兩個
 *
 * 排序時間與資料無關,
 *
 *
 */


public class MergeSort {
    public static void mergeSort(int[] data) {
        int[] buf = new int[data.length];
        merrgeSort(data, buf, 0, data.length - 1);
    }
    private statatic void mergeSort(int[] data, int[] nuf, int left, int right) {
        if (left >= right)
            return;
        int mid = (left + right) / 2;
        mergeSort(data, buf, left, mid);
        mergeSort(data, buf, mid + 1 , right);
        //do merge now
        int l = left;
        int r = mid + 1;
        int c = left;
        while (l <= mid && r <= right) {
            if (data[l] > data[r] ) {
                buf[c++] = data[r++];
            } else {
                buf[c++] = data[l++];
            }
        }
        // copy remaining elements
        while (l <= mid)
            buf[c++] = data[l++];
        while (r <= right)
            buf[c++] = data[r++];
        // copy back buf to data
        for (c = left; c <= right; c++)
            data[c] = buf[c];
    }



}
