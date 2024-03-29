package com.samrudh.OS.PageReplacement;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
class FIFO
{
    static int pageFaults(int pages[], int n, int capacity)
    {
        HashSet<Integer> s = new HashSet<>(capacity);
        Queue<Integer> indexes = new LinkedList<>() ;
        int page_faults = 0;
        for (int i=0; i<n; i++)
        {
            if (s.size() < capacity)
            {
                if (!s.contains(pages[i]))
                {
                    s.add(pages[i]);
                    page_faults++;
                    indexes.add(pages[i]);
                }
            }
            else
            {
                if (!s.contains(pages[i]))
                {
                    int val = indexes.peek();
                    indexes.poll();
                    s.remove(val);
                    s.add(pages[i]);
                    indexes.add(pages[i]);
                    page_faults++;
                }
            }
        }
        return page_faults;
    }
    public static void main(String args[])
    {
        int pages[] = {1,3, 0, 3, 5, 6, 3};
        int capacity = 3;
        System.out.println("Page Faults are: "+pageFaults(pages, pages.length, capacity));
    }
}