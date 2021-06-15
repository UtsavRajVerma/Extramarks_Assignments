package com.company;

import java.util.*;
import com.company.ThreadPool;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner (System.in);
        int numThread=s.nextInt();
        int maxTaskCapacity=s.nextInt();

        ThreadPool threadPool = new ThreadPool(numThread, maxTaskCapacity);

        for(int i=0; i<maxTaskCapacity; i++) {
            int taskNo = i;
            threadPool.execute( () -> System.out.println(Thread.currentThread().getName() + ": Task No." + taskNo ));
        }
        threadPool.waitUntilAllTasksFinished();
        threadPool.stop();
    }
}
