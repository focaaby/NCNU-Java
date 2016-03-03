public class Resource {
    int readers, writers;
    int var;
 //   int pendingWriters;
    int token; // 號碼牌發到哪裡了
    int serving; //哪個號碼牌可以獲得服務
    public synchronized void getReadLock() {
        int myNum = token++;
        while (writers > 0 || serving < myNum) {
            try {
                wait();
            } catch(Exception err) {
            }
        }
        readers++;
        serving++;
        if (token == serving)
            token = serving = 0;
        notifyAll(); 
    }
    
    public synchronized void releaseReadLock() {
        // 釋放資源，若沒人了就叫醒正在 wait 的人
        readers--;
        if (readers == 0) {
            notifyAll();
        }
    }
    
    public synchronized void getWriteLock() {
        int myNum = token++;
        // 有人正在讀或寫，就不能寫入
        while (writers > 0 || readers > 0 || serving < myNum) {
            try {
                wait();
            } catch(Exception err) {
            }
        }
        serving++;
        writers++;
        if ( token == serving)
            token = serving = 0;
    }
    
    public synchronized void releaseWriteLock() {
        writers--;
        if (writers == 0) {
            notifyAll();
        }
    }
    
    public int read() {
        return var;
    }
    
    public void write(int x){
        var = x;
    }
   
    public static void main(String[] argv) {
        // 使用方法
        Resource r = new Resource();
        // 先鎖定，就可以隨意讀取，讀後再解鎖
        r.getReadLock();
        // 對 r 做任意的讀取
        r.read();
        r.read();
        r.read();
        r.releaseReadLock();
        // 如果對 r 做寫入，則...
        // 先鎖定，就可以寫入，寫後再解鎖
        r.getWriteLock();
        r.write(20);
        r.releaseWriteLock();
    }
}
