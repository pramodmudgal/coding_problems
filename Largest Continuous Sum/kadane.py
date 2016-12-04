def largest_cont_sum(arr):
    current_sum = max_sum = arr[0]

    for num in arr[1:]:
        current_sum = max(current_sum + num, num)
        max_sum = max(max_sum, current_sum)

    return max_sum;


a = [1, -1, -1, 2, -2, 3]
print largest_cont_sum(a)