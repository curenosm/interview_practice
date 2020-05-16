// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
    ListNode<Integer> newHead = new ListNode<>(null);
    newHead.next = l;
    
    ListNode<Integer> current = l;
    ListNode<Integer> previous = newHead;
    while(current != null) {
        if(current.value == k) {
            previous.next = current.next;
            current = current.next;
        }
        else {
            previous = current;
            current = current.next;
        }
    }
    
    return newHead.next;
}
