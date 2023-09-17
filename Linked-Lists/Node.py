class Node:
    def __init__(self, data=0, next=None):
        self.data = data
        self.next = next

class LinkedList:

    def __init__(self):
        self.head = None

    def insert(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def display(self):
        current = self.head
        while current:
            print(current.data)
            current = current.next

    def delete(self, data):
        current = self.head
        previous = None
        while current:
            if current.data == data:
                if previous:
                    previous.next = current.next
                else:
                    self.head = current.next
                return
            previous = current
            current = current.next
    
    def find_kth_from_end(self, k):
        slow, fast = self.head, self.head
        for _ in range(k):
            if fast:
                fast = fast.next
            else:
                return None
        while fast:
            slow = slow.next
            fast = fast.next
        return slow.data
    
    def is_palindrome(self):
        slow, fast = self.head, self.head
        stack = []
        while fast and fast.next:
            stack.append(slow.data)
            slow = slow.next
            fast = fast.next.next
        if fast:
            slow = slow.next
        while slow:
            if slow.data != stack.pop():
                return False
            slow = slow.next
        return True
    
def find_intersection(list1, list2):
    nodes_set = set()
    
    current = list1.head
    while current:
        nodes_set.add(current)
        current = current.next

    current = list2.head
    while current:
        if current in nodes_set:
            return current
        current = current.next
    
    return None
    
intersection_node = Node(7)
list1 = LinkedList()
list1.insert(5)
list1.insert(3)
list1.insert(1)
list1.head.next.next.next = intersection_node

list2 = LinkedList()
list2.insert(4)
list2.insert(2)
list2.head.next.next = intersection_node

# Kesişim düğümünü buluyoruz
intersect_node = find_intersection(list1, list2)
if intersect_node:
    print(f"Kesişim düğümü: {intersect_node.data}")
else:
    print("Kesişim düğümü yok.")

