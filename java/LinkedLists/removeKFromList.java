// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//

/*
    Note: Try to solve this task in O(n) time using O(1) additional space,
    where n is the number of elements in the list, since this is what
    you'll be asked to do during an interview.

    Given a singly linked list of integers l and an integer k, remove
    all elements from list l that have a value equal to k.
*/

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
