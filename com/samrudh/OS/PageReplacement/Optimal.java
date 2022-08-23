package com.samrudh.OS.PageReplacement;

public class Optimal {
        static boolean search(int key, int[] fr)
        {
            for (int i = 0; i < fr.length; i++)
                if (fr[i] == key)
                    return true;
            return false;
        }
        static int predict(int pages[], int[] frame, int page_length, int index)
        {
            int res = -1, farthest = index;
            for (int i = 0; i < frame.length; i++) {
                int j;
                for (j = index; j < page_length; j++) {
                    if (frame[i] == pages[j]) {
                        if (j > farthest) {
                            farthest = j;
                            res = i;
                        }
                        break;
                    }
                }
                if (j == page_length)
                    return i;
            }
            return (res == -1) ? 0 : res;
        }
        static void optimalPage(int pages[], int page_length, int frame_size)
        {
            int[] frame = new int[frame_size];
            int hit = 0;
            int index = 0;
            for (int i = 0; i < page_length; i++) {
                if (search(pages[i], frame)) {
                    hit++;
                    continue;
                }
                if (index < frame_size)
                    frame[index++] = pages[i];
                else {
                    int j = predict(pages, frame, page_length, i + 1);
                    frame[j] = pages[i];
                }
            }
            System.out.println("No. of hits = " + hit);
            System.out.println("No. of misses = " + (page_length - hit));
        }
        public static void main(String[] args)
        {
            int pages[] = { 7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2 };
            int page_length = pages.length;
            int frame_size = 4;
            optimalPage(pages, page_length, frame_size);
        }
}