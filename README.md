# SPACE_TIME_COMPLEXITY

1. Time Complexity != Time Taken
2. Time complexity is a function that tells us how the time is going to grow as the input grows / Time complexity is a function that gives us the relationship about how the time will grow with growing input size.
3. We care about large numbers (what will happen if input size is large like that) while talking about time complexity.
4. What do we consider while thinking about complexity :
   * Always look for worst case complexity (Definitely, you can optimize your  best case but more concern is given to worst case so that our code will run perfectly in that situation).
   * Always look at complexity for large/infinite data.
   * * Even though value of actual time is different, they are all growing linearly.
     <img width="849" alt="image" src="https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/e88c10ad-8f2f-4cbb-89c9-918174a5b75b">

      * We don't care about the actual time taken because that may vary from machine to machine.
      * This is why we ignore all constants.
   * Always ignore less dominating terms. Example : O(N^3 + logN)
if N = 1 million then ((1 million)^3 + log(1 million))
= ((1 million)^3 + 6) , 6 is very small hence, ignored.
