package com.elong.concurrency.ifeve;

/**
 * 包名: com.elong.concurrency.ifeve
 * 创建人 : Elong
 * 时间: 16/9/20 下午5:40
 * 描述 :
 */
public class QueueObject {

    private boolean isNotified = false;

    public synchronized void doWait() throws InterruptedException {

        while(!isNotified){
            this.wait();
        }

        this.isNotified = false;

    }

    public synchronized void doNotify() {
        this.isNotified = true;
        this.notify();
    }

    public boolean equals(Object o) {
        return this == o;
    }

}

