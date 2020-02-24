package src.Assignemnt;

class LinkedList
{
    Node1 head=null;
    Node1 tail=null;
    public void add(Object data)
    {
        Node1 new_node=new Node1(data);
        if(head==null)
        {
            head=new_node;
            tail=new_node;
        }
        else
        {
            tail.next=new_node;
            tail=new_node;
        }


    }
    public void show()
    {

        Node1 current=head;
        if(current==null)
        {
            System.out.println("Empty List");
        }
        else {
            while (current != null) {
                System.out.println(current.data);
                current=current.next;
            }
            System.out.println();

        }
    }


    public void delete(int data)
    {
        Node1 temp,current;
        current=head;
        if(current==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            int count=data;
            if(head!=tail)
            {
                temp=head;
                current=null;

                for(int i=0;i<count;i++)
                {
                    current=temp;
                    temp=temp.next;
                }
                if(current!=null)
                {
                    current.next=temp.next;
                    temp=null;
                }
                else {
                    head = current = temp.next;

                    temp = null;
                }

            }
        }

    }

    
    
}
