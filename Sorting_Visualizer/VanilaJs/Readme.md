# [Sorting Visualizer](https://sorting-visualizer-vanila-js.netlify.app/)
<p> A sorting algorithm is an algorithm that puts the elements of a list in a certain order. While there are a large number of sorting algorithms, in practical implementations a few algorithms predominate. In this implementation of sorting visualizer, we'll be looking at some of these sorting algorithms and visually comprehend their working. The sorting algorithms covered here are Selection Sort, Insertion Sort, Bubble Sort, Merge Sort, Quick Sort and Heap Sort. The maximum array size is fixed to 150 elements. You can randomize the array and select any type of sorting algorithm to call on the list from the given options. Here, all sorting algorithms will sort the elements in ascending order.</p> 

## Implemented algorithms:

- Bubble sort
- Selection sort
- Insertion sort
- Merge sort
- Quick sort
- Heap sort

## Purpose
I wanted to improve my skills with JS and also learn classic sorting algorithms. This project turned out to be a great way to achieve both of the aforementioned objectives at the same time.
## Features

Colored representation of step being executed. 1.1) Blue:default 1.2) Yellow: Being compared 1.3) Red: Identified as in incorrect position and to be moved 1.4) Green: In correct position
3 Controls for visualizations 2.1) Speed of visualization (5 speed levels) 2.2) Data size () 2.3) Generation of new data (Randomly generate new data).
Time and Space complexity of algorithm being visualized.
## Algorithms
- Bubble Sort
    - Bubble sort is one of the most straightforward sorting algorithms, it makes multiple passes through a list.
    - Starting with the first element, compare the current element with the next element of the array.
    - If the current element is greater than the next element of the array, swap them.
    - If the current element is less than the next element, move to the next element.
    - In essence, each item “bubbles” up to the location where it belongs.
- Insertion Sort
    - Like bubble sort, the insertion sort algorithm is straightforward to implement and understand.
    - Iterate from arr[1] to arr[n] over the array.
    - Compare the current element (key) to its predecessor.
    - If the key element is smaller than its predecessor, compare its elements before.
    - Move the greater elements one position up to make space for the swapped element.
    - It splits the given array into sorted and unsorted parts, then the values from the unsorted parts are picked and placed at the correct position in the sorted part.
- Selection Sort
    - The algorithm maintains two subarrays in a given array.
    - The subarray which is already sorted.
    - Remaining subarray which is unsorted.
    - If the key element is smaller than its predecessor, compare its elements before.
    - Move the greater elements one position up to make space for the swapped element.
    - It splits the given array into sorted and unsorted parts, then the values from the unsorted parts are picked and placed at the correct position in the sorted part.

### This app is deployed with Netlify and can be accessed here: [Sorting Visualizer](https://sorting-visualizer-vanila-js.netlify.app/). I hope you have fun playing around with it.-> 
