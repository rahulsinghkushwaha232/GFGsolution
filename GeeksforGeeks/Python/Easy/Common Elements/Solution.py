from collections import Counter

class Solution:
    def commonElements(self, a, b):
        # Count frequencies of elements in both arrays
        count_a = Counter(a)
        count_b = Counter(b)

        result = []
        # Find the intersection of elements and take the minimum frequency
        for num in count_a:
            if num in count_b:
                freq = min(count_a[num], count_b[num])
                result.extend([num] * freq)

        # Return the result sorted in non-decreasing order
        return sorted(result)