# SPACE_TIME_COMPLEXITY

## TIME COMPLEXITY :

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
   * Always ignore less dominating terms.
     Example : O(N^3 + logN)
     if N = 1 million then
     ((1 million)^3 + log(1 million))
     = ((1 million)^3 + 6) , 6 is very small hence, ignored.
     
5. Big-Oh Notation
* Word Definition : O(N^3) represents upper bound. In simple language, it means that the complexity of that given graph can't exceed N^3.
* Mathematical Definition :

![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/7204b3b7-9a31-4623-8d8d-cd954ff6f760)

f(n) <= c.g(n) where n >= nₒ and c>0 & nₒ>=1 are 2 positive constants.

6. Big-Omega Notation
* Word Definition : Ω(N^3) represents lower bound. In simple language, it means the minimum value of the complexity that given graph can have.
* Mathematical Definition : if f(n) = Ω(g(n)) then,
  
![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/9fe9508a-6da7-4632-8c30-2eccdade5072)

f(n) >= c.g(n) where n >= nₒ and c>0 & nₒ>=1 are 2 positive constants.

7. Theta Notation :
* Word Definition : θ(N^2) represents both upper bound and lower bound. It simply combines both the above notations.
* Mathematical Definition : if f(n) = θ(g(n)) then,

![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/c5216f4d-9a32-4784-bcb4-5adfc3f90f80)

c1.g(n) <= f(n) <= c2.g(n) where n >= nₒ and c1,c2>0 & nₒ>=1 are 2 positive constants.

8. Small-Oh Notation :
* Word Definition : Loose upperbound.
* Mathematical Definition : if f(n) = o(g(n)) then,

![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/795c3b3b-cb7d-4bad-a698-0ab6935d9bfa)

f(n) < c.g(n) [strict inequality and stronger statement than that of big-O] where n >= nₒ and c>0 & nₒ>=1 are 2 positive constants.

9. Small-Omega Notation :
* Word Definition : Loose lowerbound
* Mathematical Definition : if f(n) = w(g(n)) then,

![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/833726a8-3e85-4d1a-9a76-d6f05dbd436c)

f(n) > c.g(n) [strict inequality and stronger statement than that of big-O] where n >= nₒ and c>0 & nₒ>=1 are 2 positive constants.
---

## SPACE COMPLEXITY :

1. It is input space + auxiliary space (extra space or the temporary space taken by an algorithm)
2. We mostly/always talk about auxiliary space because it makes us to do better comparison among different standard algorithms which have same input size that in turn means same space complexity.

Elaboration : if we want to consider standard sorting algorihtms on the basis of space, then auxiliary space would be a better criteria than space complexity. Merge sort uses O(N) auxiliary space, Insertion sort and Heap sort use O(1) auxiliary space. Space complexity of all these sorting algorithms is O(N) though.
3. 
![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/63501b79-5b30-42da-9826-a8a069b77c9e)

Solution : 
* Time taken by inner loop = kt
* Total time = kt*(No. of times outer loop will execute)
* i = 1, 1+k, 1+2k, 1+3k,...1+xk (lets say it reaches base condition i<=N in x steps)
* Now, i<=N -> 1+xk = N -> x = N-1/k
* Hence, Total time = (kt*(N-1))/k = t(N-1)
* Ignoring constants (1 & t), time complexity = O(N)                      
---

## COMPLEXITY ANALYSIS OF RECURSIVE ALGORITHMS :

1. Recursive programs don't have constant space complexity as function calls are stored in stack (occupy memory i n stack)
2. At any partucular point of time, no 2 function calls at same level of recursion tree will be in the stack at the same time
> Only calls that are interlinked with each other will be in the stack at the same time.
3. Space complexity : height of the tree (longest chain in the recursion tree/path).

Example tree of fibonacci :

Space complexity (auxiliary space complexity) - O(N), as for Nth element, max N number of function calls are stored in the stack. (according to the count of nodes present in the path of longest chain to determine height of the tree) 

![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/a88d58a6-4325-4292-af1b-2dd56e94c86e)

4. DIVIDE AND CONQUER RECURRENCES :
   1. FORM
      - First, how'll you identify that whether an equation of divide & conquer form or not ?
        ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/d0a68f9c-69e2-4c73-ad5a-5099388f3aa6)
