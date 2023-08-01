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
   1. FORM : First, how'll you identify that whether an equation of divide & conquer form or not ?
      ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/51ec2f59-9521-4e56-8006-ca3349eb852d)

      Example 1 : Binary Search recurrence form comparison
      ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/da459eb8-7706-4f5b-932c-eb6eb38cb599)

      Example 2 :
      ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/1a216ccf-5f03-451f-a296-3c294d6dc00d)

   2. WHAT IS g(n) ?
      When the recursion call is over, then afterwards the amount of time comlexity required to do actually sth with those recursion calls that are now over. Extra time required at that step, basically.
    
      ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/0b63aede-eb88-4fcb-a926-9616092e1d3e)

      So, the time taken to do something with obtained answer(s) to reach the final solution is represented by g(n).

      The above equation is for merge sort where N/2 to sort half array, N/2 to sort another half array contributes to 2T(N/2) while after this these 2 arrays (of size N/2 & N/2) got merged where N-1 comparisons are made which contributes to g(n) = N-1.

   3. HOW TO SOLVE & GET COMPLEXITY ?
      1. PLUG & CHUG (not recommended)
      2. MASTER THEOREM (done in 4th sem, have Nonita ma'am notes)
      3. AKRA-BAZZI FORMULA/THEOREM (Best way, you can solve any conquer & divide recurrence relation, 1996)
         ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/7b3a8a42-eb5a-40e9-820e-7bc3557772ae)
         The g(u) you can take simpler by removing constants.
         
         ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/cfd2a946-66ac-417a-9058-641e6cef0b17)
         * Example1 of Merge sort complexity by Akra-Bazzi formula :
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/66e33924-3203-44bd-9aa5-6f2bf5e0acac)
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/8f0bf34e-7e16-4931-a717-3670d6248ad0)
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/55602f71-fb7c-403b-b5e9-cf642994f4be)
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/9e957b67-b741-4fe2-a8b2-dc62ae136aa6)
           Hence, for an array of size N, the time complexity for merge sort is θ(NlogN)
         * Example2 which can't be solved by master theorem, recursion tree, etc.
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/f7c1f7de-1435-49ad-825c-b4ac25d4552b)
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/4ae79a08-08e5-4d35-a797-8aa6d8c5c898)
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/c615cb09-81e3-4efd-a766-e3854724699a)
           Ignoring less dominating term x^2
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/4d9b8045-20af-414b-8382-d22945917077)
         * Example3 : If you CAN'T find the value of 'p'
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/66a92e26-0585-49d9-8536-efee3a71f07f)
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/117f7b3c-80d8-4985-99fe-37c25bcf488e)
           So, I need to increase the power !
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/b786325e-ca28-49c5-916d-0190dc359246)
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/d6a10271-50a6-4314-8a5f-0006ef70b7b8)
           Now, I need to decrease the denominator so as to increase the value of fraction => p needs to be decrease !
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/41d7e993-5380-4fde-887b-789b0299e3b9)
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/1d75e801-8793-4f2d-a4f4-553cb0af062a)
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/298c4e66-9d27-4bbb-ad1e-b9eb887d3e87)
           ![gitpaste](https://github.com/ShrutiSharma-27/SPACE_TIME_COMPLEXITY/assets/53565103/bda9533a-3788-4c30-a6e7-b2c15a4f313e)
5. LINEAR RECURRENCES
