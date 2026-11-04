import heapq

def secondmaxi(arr):
    heapq.heapify(arr)
    
    for num in arr:
        first_maximum = heapq.heappop(arr)
        second_maximum = heapq.heappop(arr)
    return second_maximum
    
arr = [10, 5, 20, 8, 15]

result = secondmaxi(arr)
print(result) #-->15