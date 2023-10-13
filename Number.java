public class Number extends Thread {
    int num;
    int size;

    public Number(int num, int size){
        this.num = num;
        this.size = size;
    }

    public void run() {
        try {
            Thread.sleep(num*1000);
            synchronized (Main.sortedArr) {
                Main.sortedArr.add(num);
                if (Main.sortedArr.size() == size) {
                    Main.printArray(Main.sortedArr, "Sorted Array");
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Couldn't Sleep zzzz");
        }
    }
}