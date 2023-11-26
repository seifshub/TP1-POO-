public class CustomArrayList {
    private int[] arr;
    private int size;
    public CustomArrayList()
    {
        arr=new int[10];
        size=0;
    }
    public CustomArrayList(int initialSize)
    {
        arr=new int[initialSize];
        size=0;
    }
    public void add(int obj)
    {
        if(size!=arr.length)
        {
            arr[size]=obj;
        }
        else{
            int[] arr1=new int[arr.length*2];
            for(int i=0;i<arr.length;i++)
            {
                arr1[i]=arr[i];
            }
            arr1[arr.length]=obj;
            arr=arr1;
        }
        this.size++;
    }

    public void add(int index,int x)
    {
        int[]arr1;
        if(arr.length==size)
        {
            arr1 = new int[this.size * 2];
        }
        else
        {
            arr1 = new int[arr.length];

        }
        for (int i=0;i <index; i++)
        {
            arr1[i] = arr[i];
        }
        arr1[index]=x;
        for(int i=index+1;i<=size;i++)
        {
            arr1[i]=arr[i-1];
        }
        this.size++;
        arr=arr1;
    }

    public int get(int x)
    {
        return arr[x];
    }

    public int size()
    {
        return this.size;
    }

    public boolean isEmpty()
    {
        return this.size()==0;
    }

    public boolean isIn(int x)
    {
        for(int i=0;i<this.size();i++)
        {
            if(this.get(i)==x)
            {
                return true;
            }
        }
        return false;
    }

    public int find(int x)
    {
        for(int i=0;i<this.size();i++)
        {
            if(this.get(i)==x)
            {
                return i;
            }
        }
        return -1;
    }

    public void remove(int x)
    {
        int pos=this.find(x);
        if(pos!=-1)
        {
            if(pos==size-1)
            {
                arr[pos]=0;
            }
            else{
                for(int i=pos;i<size-1;i++)
                {
                    arr[i]=arr[i+1];
                }
            }
            size--;
        }
    }
    C:\Users\eusei\IdeaProjects\Exercice3 TP1\src\CustomArrayList.java

    public void display()
    {
        for(int i=0;i<this.size();i++)
        {
            System.out.print(this.get(i)+"/");
        }
    }
}
