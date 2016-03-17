## Counting Sort
 1. 先掃一次，算每種值出現的次數
 2. 累次比值小的總次數
 3. 排序


 * 用途：數值的範圍不大，而且數值重複率極高
 * 如果數值是負數，必須另做 shift

## Radix Sort

Radix Sort => stable sort algorithm

stable：同值的會按照順序排序
- [x] Bubble Sort
- [x] Selection Sort
- [x] Insertion Sort
- [ ] Quick Sort
- [ ] Heap Sort
- [x] Counting Sort
- [x] Merge Sort

radix Sort: 是一種策略，不是一種排序
- 先依比較小的權重排序，在用比較重權重的排序
- 搭配 stable algorithm
- 可以用 Counting Sort 拿數字的 byte當 key 分四堆

```
SA HK SJ H9 S8 HQ SQ
-> SA HK HQ SQ SJ H9 S8 //先依數字排序
-> SA SQ SJ S8 HK HQ H9 //按照花色排序
```
