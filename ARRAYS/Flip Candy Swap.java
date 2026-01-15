class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
       //Let:

// A = total candies Alice has

// B = total candies Bob has

// Alice gives box with x candies
// Bob gives box with y candies

// After exchange:

// Alice → A - x + y

// Bob → B - y + x

// We want:

// A - x + y = B - y + x
//that means first of all need the sum of candies both alice and bob have then i need that  A - x + y = B - y + x this should be done for that both are swapping candies and i need to return x and y

//basically x and y are the number of candies both can swap with each other
//aliceSizes = [1,1], bobSizes = [2,2] like here a = 2 and b= 4 so if a gives 1 to b abd b gives 2 to a then they both will become 3 so her x = 1 and y = 2 so basically we dont know which needs to be exchanges so one way is swap each element and then check the sum if its equal if it does then return that x and y
//steps we need to perform 
// swap one element check sum if equals then return if not make the original array and then repeat the same process
int sumAlice = 0, sumBob = 0;
        // Calculate initial sums
        for (int a : aliceSizes) sumAlice += a;
        for (int b : bobSizes) sumBob += b;

        // Try every pair of swaps
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                // swap conceptually: Alice gives a, Bob gives b
                int newAlice = sumAlice - aliceSizes[i] + bobSizes[j];
                int newBob = sumBob - bobSizes[j] + aliceSizes[i];

                if (newAlice == newBob) {
                    return new int[]{aliceSizes[i], bobSizes[j]};
                }
            }
        }

        // Should never reach here because problem guarantees a solution
        return new int[]{-1, -1};

    }
}