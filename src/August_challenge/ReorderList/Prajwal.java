class Solution
{
    public ListNode reverse(ListNode head)
    {

        ListNode p1 = head;
        ListNode p2 = head.next;
        p1.next = null;

        while(p2 != null)
        {

            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;

        }

        return p1;
    }

    public void reorderList(ListNode head)
    {

        if(head == null || head.next == null) return ;

        ListNode slowPtr = head, fastPtr = head;
        ListNode prev = head;

        // splitting list
        while(fastPtr != null && fastPtr.next != null)
        {

            prev = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

        }

        prev.next = null;

        // reverse
        ListNode rev = reverse(slowPtr);
        ListNode ptr = head;

        // arrange alternatively
        while(ptr != null)
        {

            ListNode t1 = ptr.next;
            ListNode t2 = rev.next;
            ptr.next = rev;

            if(t1 != null)
                rev.next = t1;

            ptr = t1;
            rev = t2;

        }
    }
}