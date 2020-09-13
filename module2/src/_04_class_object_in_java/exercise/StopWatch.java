package _04_class_object_in_java.exercise;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getLapsedTime(){
        return this.endTime - this.startTime;
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int [] array= new int [100000];
        //random elements array
        int max = 100000, min = 1;
        for(int i =0; i<array.length; i++){
            array[i]= (int) (Math.random() * (max - min)) +min;
        }
        //print array
        selectionSort(array);
        displayArray(array);
        stopWatch.stop();
        stopWatch.getLapsedTime();
        System.out.println("");
        System.out.println(stopWatch.getLapsedTime()+" ms");
    }

    public static void selectionSort(int[]array) {
        for (int i= 0; i<array.length-1; i++){
            int min_index = i;
            for (int j = i+1; j<array.length;j++){
                if(array[j]<array[min_index]){
                    min_index = j;
                }
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }

    public static void displayArray(int[]array) {
        for (int i = 0 ; i <array.length ; i++){
            System.out.print(array[i] +"\t");
        }
    }
}


