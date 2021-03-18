 public static int count(Node head, int search_for)
    {
       int all_count=0;
       Node temp=head;
       while(temp!=null)
       {
          if(temp.data==search_for)
          {
              all_count++;
          }
          temp=temp.next;
       }
       return all_count;
    }
